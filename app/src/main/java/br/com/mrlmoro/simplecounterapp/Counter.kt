package br.com.mrlmoro.simplecounterapp


class Counter(private var count: Int = 0) {

    fun increase() {
        count++
    }

    fun decrease() {
        count--
    }

    fun display() = count.toString()
}