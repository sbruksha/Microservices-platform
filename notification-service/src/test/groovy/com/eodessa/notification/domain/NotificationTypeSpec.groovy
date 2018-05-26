package test.groovy.com.eodessa.notification.domain

import com.eodessa.notification.UnitTest
import com.eodessa.notification.domain.base.ModelBaseSpec
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class NotificationTypeSpec extends ModelBaseSpec {

    @Unroll("NotificationType Model Scenario #num - builds as expected")
    def testNotificationType() {
        expect:
        assert notificationtype.subject == subject
        assert notificationtype.text == text
        assert notificationtype.attachment == attachment
        where:
        num | notificationtype     | subject   | text       | attachment
        1   | NOTIFICATIONTYPE_OBJ | TEST_STR  | TEST_STR   | TEST_STR
    }
}
