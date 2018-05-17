package com.eodessa.auth.domain.base

import com.eodessa.auth.domain.User
import spock.lang.Shared
import spock.lang.Specification

class ModelBaseSpec extends Specification {
    @Shared String TEST_STR = "TEST_STR"
    @Shared int TEST_INT = 12345
    @Shared BigDecimal TEST_BIGDECIMAL = 11.11

    def getUSER_OBJ(){
        User a = new User()
        a.username = TEST_STR
        a.password = TEST_STR
        return a
    }
}
