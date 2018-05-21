package com.eodessa.appointment.controller

import org.junit.experimental.categories.Category
import com.eodessa.IntegrationTest
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
import static com.toomuchcoding.jsonassert.JsonAssertion.assertThatJson

@Category(IntegrationTest.class)
class AppointmentControllerSpec extends Specification {

    def appointmentService = "http://localhost"
    def restTemplate = new RestTemplate()
    def jwt = "Bearer abcdef"
    def headers = new LinkedMultiValueMap<>() as MultiValueMap<String, String>
    def setup(){ headers.setAll(["Authorization": "jwt" ])
    }

    @Unroll("Expect valid appointment info when calling getAppointmentByName(#name)")
    "should get appointment details by name"() {
        given: "appointments endpoint"
        def endpoint = "$appointmentService/appointments/$name"
        when: "the endpoint is called"
        def response = restTemplate.exchange(endpoint, HttpMethod.GET, new HttpEntity<String>(headers), String)
        then: "Verify the status code = 200"
        assert response.statusCode == HttpStatus.OK
        and: "Verify the contents of the body"
        DocumentContext parsedJson = JsonPath.parse(response.getBody().toString())
        assert(parsedJson !=null)
        assertThatJson(parsedJson).field("id").isEqualTo("demo")
        //assertThatJson(parsedJson).field("['start']").matches("-?(\\d*\\.\\d+|\\d+)")
        assertThatJson(parsedJson).field("['description']").matches("[\\S\\s]+")
        where:
        num | name
        1   | "demo"
    }
}
