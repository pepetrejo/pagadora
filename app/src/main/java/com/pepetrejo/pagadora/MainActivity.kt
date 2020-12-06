package com.pepetrejo.pagadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.pepetrejo.pagadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var in20: Int = binding.in20.toString().toInt()
        var in10: Int = binding.in10.toString().toInt()
        var in1: Int = binding.in1.toString().toInt()
        var in05: Int = binding.in05.toString().toInt()
        var in01: Int = binding.in01.toString().toInt()
        var sumar: Float = binding.sumaTotal.toString().toFloat()
        var pagadora = binding.pagadora.setText(String())


        var calculo20: Int = binding.calculo20.toString().toInt()
            calculo20 = in20 * 20

        var calculo10: Int = binding.calculo10.toString().toInt()
            calculo10 = in10 *10

        var calculo1: Int = binding.calculo1.toString().toInt()
            calculo1 = in1 * 1

        var calculo05: Float = binding.calculo05.toString().toFloat()
            calculo05 = in05 * 0.5f

        var calculo01: Float = binding.calculo01.toString().toFloat()
            calculo01 = in01 * 0.1f

        sumar = calculo20 + calculo10 + calculo1 + calculo05 + calculo01









    }
}