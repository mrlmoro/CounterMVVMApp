package br.com.mrlmoro.simplecounterapp

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField


class CounterViewModel : ViewModel() {

    val display = ObservableField<String>("0")

    private val counter = Counter()

    fun onClickIncrease() {
        counter.increase()
        display.set(counter.display())
    }

    fun onClickDecrease() {
        counter.decrease()
        display.set(counter.display())
    }

}