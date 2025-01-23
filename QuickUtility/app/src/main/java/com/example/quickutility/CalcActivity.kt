package com.example.quickutility

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import com.example.quickutility.databinding.ActivitySecondBinding

class CalcActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun operatorAction(view: View) {}
    fun numberAction(view: View) {}

    fun allClearAction(view: View)
    {
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.WorkingsTv.text = ""
        binding.ResultsTv.text = ""
        binding.AllClear.setOnClickListener(

        )
    }
    fun backSpaceAction(view: View) {}
    fun equalsAction(view: View) {}
}