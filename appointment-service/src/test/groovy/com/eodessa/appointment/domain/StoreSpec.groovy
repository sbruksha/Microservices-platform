package test.groovy.com.eodessa.appointment.domain

import com.eodessa.appointment.UnitTest
import com.eodessa.appointment.domain.base.ModelBaseSpec
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class StoreSpec extends ModelBaseSpec {

    @Unroll("Store.Builder() Scenario #num - builds as expected")
    def testBuilder() {
        expect:
        assert store.name == name
        where:
        num | store     | name
        1   | STORE_OBJ | TEST_STR
    }
}
