package com.eodessa.account.controller

import org.junit.experimental.categories.Category
import org.springframework.http.ResponseEntity
import spock.lang.Specification
import spock.lang.Unroll
import com.jayway.jsonpath.DocumentContext
import com.jayway.jsonpath.JsonPath
import org.springframework.web.client.RestTemplate
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import com.eodessa.account.IntegrationTest

import static com.toomuchcoding.jsonassert.JsonAssertion.assertThatJson

@Category(IntegrationTest.class)
class AccountControllerSpec extends Specification {

    def accountService = "http://localhost:6000"
    def restTemplate = new RestTemplate()
    def jwt = "Bearer abcdef"
    def headers = new LinkedMultiValueMap<>() as MultiValueMap<String, String>
    def setup(){ headers.setAll(["Authorization": "jwt" ])
    }

    @Unroll("Expect valid account info when calling getAccountByName(#name)")
    "should get account details by name"() {
        given: "account endpoint"
        def endpoint = "$accountService/accounts/$name"
        when: "the endpoint is called"
        def response = restTemplate.exchange(endpoint, HttpMethod.GET, new HttpEntity<String>(headers), String)
        then: "Verify the status code = 200"
        assert response.statusCode == HttpStatus.OK
        and: "Verify the contents of the body"
        DocumentContext parsedJson = JsonPath.parse(response.getBody().toString())
        assert(parsedJson !=null)
        assertThatJson(parsedJson).field("name").isEqualTo("demo")
        //assertThatJson(parsedJson).field("['email']").matches("[\\S\\s]+")
        where:
        num | name
        1   | "demo"
    }
}
