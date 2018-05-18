package com.eodessa.account.domain

import com.eodessa.account.domain.base.ModelBaseSpec
import com.eodessa.account.UnitTest
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class AccountSpec extends ModelBaseSpec {

    @Unroll("Account Model Scenario #num - builds as expected")
    def testAccount() {
        expect:
        assert account.name == name
        assert account.email == email
        where:
        num | account     | name     | email
        1   | ACCOUNT_OBJ | TEST_STR | TEST_STR
    }
}
