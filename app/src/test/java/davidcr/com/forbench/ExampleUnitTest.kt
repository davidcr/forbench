package davidcr.com.forbench

import org.junit.Test
import kotlin.system.measureNanoTime

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun listIndexedTest() {
        val list = (1..10000).toList()

        println("ForLoop Time: " + measureNanoTime {
            for (i in list) {
                //do something
            }
        })
    }

    @Test
    fun listIteratorTest() {
        val list = (1..10000).toList()

        println("Iterator Time:" + measureNanoTime {
            list.forEach {
                //do something
            }
        })
    }


}
