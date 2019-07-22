/*
 * Konkod
 * Kontrol Kodu
 *
 * OpenAPI spec version: v1
 * Contact: mkilcibkm@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.junit.Assert;
import org.junit.Before;
import org.openapitools.client.ApiException;
import org.openapitools.client.auth.ApiKeyAuth;
import org.openapitools.client.model.JWTToken;
import org.openapitools.client.model.Konkod;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KonkodApi
 */
@Ignore
public class KonkodApiTest {

    private final KonkodApi api = new KonkodApi();

    @Before
    public void setup() throws ApiException {
        AuthenticationApiTest authenticationApiTest = new AuthenticationApiTest();
        JWTToken jwtToken = authenticationApiTest.authenticate(authenticationApiTest.createClientCredentials());
        // setup authentication
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) api.getApiClient().getAuthentication("Bearer");
        apiKeyAuth.setApiKey(jwtToken.getAccessToken());
        apiKeyAuth.setApiKeyPrefix(jwtToken.getTokeType());
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void konkodGETTest() throws ApiException {
        String phone = "905313280240";
        List<Konkod> response = api.konkodGET(phone);
        response.forEach(konkod -> System.out.println(konkod));
        Assert.assertNotNull(response);
        // TODO: test validations
    }
    
}
