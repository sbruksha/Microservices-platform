package test.groovy.com.eodessa.notification.domain

import com.eodessa.notification.UnitTest
import com.eodessa.notification.domain.base.ModelBaseSpec
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class FrequencySpec extends ModelBaseSpec {

    @Unroll("Frequency Model Scenario #num - builds as expected")
    def testFrequency() {
        expect:
        assert frequency.days == days
        where:
        num | frequency     | days
        1   | FREQUENCY_OBJ | 7
    }
}
