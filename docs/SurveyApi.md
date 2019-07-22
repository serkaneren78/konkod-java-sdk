# SurveyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**surveyPOST**](SurveyApi.md#surveyPOST) | **POST** /api/v1/survey | 


<a name="surveyPOST"></a>
# **surveyPOST**
> Survey surveyPOST(survey)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.SurveyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SurveyApi apiInstance = new SurveyApi();
Survey survey = new Survey(); // Survey | 
try {
    Survey result = apiInstance.surveyPOST(survey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#surveyPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **survey** | [**Survey**](Survey.md)|  | [optional]

### Return type

[**Survey**](Survey.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

