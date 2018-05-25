package com.eodessa.appointment.domain.base

import com.eodessa.appointment.domain.*
import com.eodessa.appointment.domain.Store
import spock.lang.Shared
import spock.lang.Specification

class ModelBaseSpec extends Specification {
    @Shared String TEST_STR = "TEST_STR"
    @Shared int TEST_INT = 12345
    @Shared BigDecimal TEST_BIGDECIMAL = 11.11

    def getAPPOINTMENT_OBJ(){
        Appointment app = new Appointment()
        app.id = TEST_STR
        return app
    }

    def getSTORE_OBJ(){
        Store app = new Store()
        app.name = TEST_STR
        return app
    }
}
