package test.groovy.com.eodessa.appointment.domain

import com.eodessa.appointment.UnitTest
import com.eodessa.appointment.domain.base.ModelBaseSpec
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class ServiceSpec extends ModelBaseSpec {

    @Unroll("Service.Builder() Scenario #num - builds as expected")
    def testBuilder() {
        expect:
        assert service.name == name
        where:
        num | service     | name
        1   | SERVICE_OBJ | TEST_STR
    }
}
