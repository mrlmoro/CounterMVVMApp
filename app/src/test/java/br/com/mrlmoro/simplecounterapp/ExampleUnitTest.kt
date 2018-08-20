package br.com.mrlmoro.simplecounterapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun `Testando contador`() {
        val counter = Counter()
        counter.increase()
        counter.increase()
        counter.increase()
        counter.decrease()
        assertEquals("2", counter.display())
    }


}
