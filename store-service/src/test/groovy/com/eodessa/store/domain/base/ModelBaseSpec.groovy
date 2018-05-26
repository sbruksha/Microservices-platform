package com.eodessa.store.domain.base

import com.eodessa.store.domain.Opening
import com.eodessa.store.domain.Store
import spock.lang.Shared
import spock.lang.Specification

class ModelBaseSpec extends Specification {
    @Shared String TEST_STR = "TEST_STR"
    @Shared int TEST_INT = 123
    @Shared BigDecimal TEST_BIGDECIMAL = 11.11

    def getSTORE_OBJ(){
        Store a = new Store()
        a.name = TEST_STR
        a.storename = TEST_STR
        a.addressstreet = TEST_STR
        a.addresscity = TEST_STR
        a.addressstate = TEST_STR
        a.addresspostalcode = TEST_STR
        a.addresscountry = TEST_STR
        return a
    }

    def getOPENING_OBJ(){
        Opening a = new Opening()
        a.weekday_id = TEST_INT
        a.start = TEST_INT
        a.end = TEST_INT
        a.pause_start = TEST_INT
        a.pause_end = TEST_INT
        return a
    }
}
