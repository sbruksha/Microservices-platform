package com.eodessa.auth.domain

import com.eodessa.auth.domain.base.ModelBaseSpec
import com.eodessa.auth.UnitTest
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class UserSpec extends ModelBaseSpec {

    @Unroll("User Model Scenario #num - builds as expected")
    def testUser() {
        expect:
        assert user.username == username
        assert user.password == password
        where:
        num | user     | username | password
        1   | USER_OBJ | TEST_STR | TEST_STR
    }
}
