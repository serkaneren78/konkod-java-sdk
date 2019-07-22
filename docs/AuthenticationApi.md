# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticationPOST**](AuthenticationApi.md#authenticationPOST) | **POST** /api/v1/authenticate | 


<a name="authenticationPOST"></a>
# **authenticationPOST**
> JWTToken authenticationPOST(clientCredentials)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.AuthenticationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AuthenticationApi apiInstance = new AuthenticationApi();
ClientCredentials clientCredentials = new ClientCredentials(); // ClientCredentials | 
try {
    JWTToken result = apiInstance.authenticationPOST(clientCredentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authenticationPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCredentials** | [**ClientCredentials**](ClientCredentials.md)|  | [optional]

### Return type

[**JWTToken**](JWTToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

