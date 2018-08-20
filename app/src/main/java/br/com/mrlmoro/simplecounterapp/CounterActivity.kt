package br.com.mrlmoro.simplecounterapp

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.mrlmoro.simplecounterapp.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    lateinit var binding: ActivityCounterBinding
    lateinit var viewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_counter)
        viewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)
        binding.vm = viewModel
    }
}
