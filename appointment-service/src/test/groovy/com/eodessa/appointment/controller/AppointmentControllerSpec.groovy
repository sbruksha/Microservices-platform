package com.eodessa.appointment.controller

import com.eodessa.appointment.domain.Appointment
import com.eodessa.appointment.service.AppointmentService
import org.junit.experimental.categories.Category
import com.eodessa.appointment.UnitTest
import org.springframework.http.ResponseEntity
import spock.lang.Specification
import spock.lang.Unroll

import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK

@Category(UnitTest.class)
class AppointmentControllerSpec extends Specification {
    AppointmentService mockRecommendationService = Mock()
    def controller = new AppointmentController(mockRecommendationService)

    @Unroll("Test #num - getAppointment(#productId, #storeId)")
    testGetAppointment() {
        given:
        mockRecommendationService.getAppointmentByName("demo") >> appointment

        when:
        ResponseEntity<Appointment> result = controller.getAppointmentByName("demo")

        then:
        assert statusCode == result.statusCode
        //assert expected == result.body
        assert productId == '1234'

        where:
        num | productId   | storeId | appointment                      | statusCode | expected
        1   | '1234'      | 1234L   | Optional.empty()                 | NO_CONTENT | null
        2   | '1234'      | 1234L   | Optional.of(createAppointment()) | OK         | createAppointment()
    }

    def createAppointment() {
        Appointment app = new Appointment()
        app.id = '1234'
        return app
    }
}
