# KonkodApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**konkodGET**](KonkodApi.md#konkodGET) | **GET** /api/v1/konkod | 


<a name="konkodGET"></a>
# **konkodGET**
> List&lt;Konkod&gt; konkodGET(phone)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.KonkodApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

KonkodApi apiInstance = new KonkodApi();
String phone = "phone_example"; // String | 
try {
    List<Konkod> result = apiInstance.konkodGET(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KonkodApi#konkodGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**|  | [optional]

### Return type

[**List&lt;Konkod&gt;**](Konkod.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

