package com.eodessa.store.domain.base

import com.eodessa.store.domain.Store
import spock.lang.Shared
import spock.lang.Specification

class ModelBaseSpec extends Specification {
    @Shared String TEST_STR = "TEST_STR"
    @Shared int TEST_INT = 12345
    @Shared BigDecimal TEST_BIGDECIMAL = 11.11

    def getSTORE_OBJ(){
        Store a = new Store()
        a.name = TEST_STR
        a.storename = TEST_STR
        return a
    }
}
