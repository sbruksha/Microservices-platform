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

    AppointmentService mockService = Mock()
    def controller = new AppointmentController(mockService)

    @Unroll("Test #num - getAppointment(#parm1, #parm2)")
    testGetAppointment() {
        given:
        mockService.getAppointmentByName("demo") >> appointment

        when:
        ResponseEntity<Appointment> result = controller.getAppointmentByName("demo")

        then:
        assert statusCode == result.statusCode
        //assert expected == result.body
        assert parm1 == '01234'

        where:
        num | parm1        | parm2    | appointment                      | statusCode | expected
        1   | '01234'      | 01234L   | Optional.empty()                 | NO_CONTENT | null
        2   | '01234'      | 01234L   | Optional.of(createAppointment()) | OK         | createAppointment()
    }

    def createAppointment() {
        Appointment app = new Appointment()
        app.id = '1234'
        return app
    }
}
