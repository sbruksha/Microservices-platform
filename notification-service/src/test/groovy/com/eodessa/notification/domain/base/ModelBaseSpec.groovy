package com.eodessa.notification.domain.base

import com.eodessa.notification.domain.Frequency
import com.eodessa.notification.domain.NotificationSettings
import com.eodessa.notification.domain.NotificationType
import com.eodessa.notification.domain.Recipient
import spock.lang.Shared
import spock.lang.Specification

class ModelBaseSpec extends Specification {
    @Shared String TEST_STR = "TEST_STR"
    @Shared int TEST_INT = 12345
    @Shared BigDecimal TEST_BIGDECIMAL = 11.11

    def getRECIPIENT_OBJ(){
        Recipient a = new Recipient()
        a.accountName = TEST_STR
        a.email = TEST_STR
        return a
    }

    def getNOTIFICATIONTYPE_OBJ(){
        NotificationType a = NotificationType.TEST
        return a
    }

    def getFREQUENCY_OBJ(){
        Frequency a = Frequency.WEEKLY
        a.days = 7
        return a
    }
}
