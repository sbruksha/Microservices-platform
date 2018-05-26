package test.groovy.com.eodessa.store.domain

import com.eodessa.store.UnitTest
import com.eodessa.store.domain.base.ModelBaseSpec
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class OpeningSpec extends ModelBaseSpec {

    @Unroll("Opening Model Scenario #num - builds as expected")
    def testOpening() {
        expect:
        assert opening.weekday_id == weekday_id
        assert opening.start == start
        assert opening.end == end
        assert opening.pause_start == pause_start
        assert opening.pause_end == pause_end
        where:
        num | opening     | weekday_id | start      | end       | pause_start | pause_end
        1   | OPENING_OBJ | TEST_INT   | TEST_INT   | TEST_INT  | TEST_INT    | TEST_INT
    }
}
