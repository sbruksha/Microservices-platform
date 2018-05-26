package com.eodessa.account.domain.base

import com.eodessa.account.domain.Account
import com.eodessa.account.domain.User
import spock.lang.Shared
import spock.lang.Specification

class ModelBaseSpec extends Specification {
    @Shared String TEST_STR = "TEST_STR"
    @Shared int TEST_INT = 12345
    @Shared BigDecimal TEST_BIGDECIMAL = 11.11

    def getACCOUNT_OBJ(){
        Account a = new Account()
        a.name = TEST_STR
        a.email = TEST_STR
        a.note = TEST_STR
        return a
    }

    def getUSER_OBJ(){
        User a = new User()
        a.username = TEST_STR
        a.password = TEST_STR
        a.email = TEST_STR
        return a
    }
}
