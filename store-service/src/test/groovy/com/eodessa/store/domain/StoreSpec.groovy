package com.eodessa.store.domain

import com.eodessa.store.domain.base.ModelBaseSpec
import com.eodessa.store.UnitTest
import org.junit.experimental.categories.Category
import spock.lang.Unroll

@Category(UnitTest.class)
class StoreSpec extends ModelBaseSpec {

    @Unroll("Store Model Scenario #num - builds as expected")
    def testStore() {
        expect:
        assert store.name == name
        assert store.storename == storename
        where:
        num | store     | name     | storename
        1   | STORE_OBJ | TEST_STR | TEST_STR
    }
}
