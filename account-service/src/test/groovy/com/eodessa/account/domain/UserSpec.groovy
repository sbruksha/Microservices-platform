package com.eodessa.account.domain

import com.eodessa.account.domain.base.ModelBaseSpec
import com.eodessa.account.UnitTest
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class UserSpec extends ModelBaseSpec {

    @Unroll("User Model Scenario #num - builds as expected")
    def testUser() {
        expect:
        assert user.username == username
        assert user.password == password
        assert user.email == email
        where:
        num | user     | username     | password | email
        1   | USER_OBJ | TEST_STR     | TEST_STR | TEST_STR
    }
}
