package com.pepetrejo.pagadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pepetrejo.pagadora.databinding.ActivityMainBinding
import java.net.HttpCookie.parse
import java.util.logging.Level.parse


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCalcular.setOnClickListener {

            val btnCalcular = binding.btnCalcular // este creo que no vale para nada pasarla a variable
            val btnBorrar = binding.btnBorrar
            var pagadora = binding.pagadora.text.toString()


            var in20: Float = binding.in20.text.toString().toFloat() //pasa el EditText a Float
            var total20 = in20 * 20
            binding.calculo20.text = total20.toString() + "€" //Muestra la var en el TextView. obliga a pasarlo a String
            println(total20)

            var in10: Float = binding.in10.text.toString().toFloat()
            var total10 = in10 * 10
            binding.calculo10.text = total10.toString() + "€"
            println(total10)

            var in1: Float = binding.in1.text.toString().toFloat()
            var total1 = in1 * 10
            binding.calculo1.text = total1.toString() + "€"
            println(total1)

            var in05: Float = binding.in05.text.toString().toFloat()
            var total05 = in05 * 0.5
            binding.calculo05.text = total05.toString() + "€"
            println(total05)

            var in01: Float = binding.in01.text.toString().toFloat()
            var total01 = in01 * 0.10
            binding.calculo01.text = total01.toString() + "€"
            println(total01)

            var sumatotal = total20 + total10 + total1 + total05 + total01
            binding.sumaTotal.text = sumatotal.toString() + ("€")
            println(sumatotal)

        }


        binding.btnBorrar.setOnClickListener {

            val intent = intent
            finish()
            startActivity(intent)
        }


    }


}