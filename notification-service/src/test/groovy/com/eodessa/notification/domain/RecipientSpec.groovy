package com.eodessa.notification.domain

import com.eodessa.notification.domain.base.ModelBaseSpec
import com.eodessa.notification.UnitTest
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class RecipientSpec extends ModelBaseSpec {

    @Unroll("Recipient Model Scenario #num - builds as expected")
    def testRecipient() {
        expect:
        assert recipient.accountName == accountName
        assert recipient.email == email
        where:
        num | recipient     | accountName   | email
        1   | RECIPIENT_OBJ | TEST_STR      | TEST_STR
    }
}
