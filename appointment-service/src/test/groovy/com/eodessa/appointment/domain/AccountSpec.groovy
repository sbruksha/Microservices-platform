package test.groovy.com.eodessa.appointment.domain

import com.eodessa.appointment.UnitTest
import com.eodessa.appointment.domain.base.ModelBaseSpec
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class AccountSpec extends ModelBaseSpec {

    @Unroll("Account.Builder() Scenario #num - builds as expected")
    def testBuilder() {
        expect:
        assert account.name == name
        where:
        num | account     | name
        1   | ACCOUNT_OBJ | TEST_STR
    }
}
