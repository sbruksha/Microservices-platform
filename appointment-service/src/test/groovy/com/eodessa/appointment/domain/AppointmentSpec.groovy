import com.eodessa.appointment.domain.base.ModelBaseSpec
import com.eodessa.appointment.UnitTest
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class AppointmentSpec extends ModelBaseSpec {
    @Unroll("Appointment.Builder() Scenario #num - builds as expected")
    def testBuilder() {
        expect:
        assert appointment.id == id
        where:
        num | appointment     | id
        1   | APPOINTMENT_OBJ | TEST_STR
    }
}
