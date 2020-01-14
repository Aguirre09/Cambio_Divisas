package com.example.cambio_divisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // CAMBIAR LOS DATOS DE DOLARES


        button_peso2.setOnClickListener {
            val dol = etDol.text.toString().toDouble()
            val someFloat:Float=3288.55F
            val doubleVar:Double= dol * someFloat

            val pesos =doubleVar.toString()

            dos_Peso.text  = "$ $pesos"

        }

        button_EURO2.setOnClickListener {
            val eu= etDol.text.toString().toDouble()
            var someFloat:Float= 0.90F
            val doubleVar:Double= eu *someFloat
            val euros = doubleVar.toString()
            dos_Euro.text="€ $euros"

        }



        // CAMBIAR LOS DATOS DE EUROS

        button_Peso3.setOnClickListener {
            val eur=et_Euro.text.toString().toDouble()
            var someFloat:Float=3660.99F
            val doubleVar:Double= eur *someFloat
            val pesos = doubleVar.toString()
            tres_Peso.text= "$ $pesos  "         }

        button_DOLAR3.setOnClickListener {

            val eur = et_Euro.text.toString().toDouble()
            var someFloat:Float=1.11F
            val doubleVar:Double = eur*someFloat
            val dolar= doubleVar.toString()
            tres_Dolar.text = "$ $dolar"

        }












        // CAMBIAR LOS DATOS DE PESOS

        // para DOLARES

        button_dolar.setOnClickListener {

            val peso = et_Cop.text.toString().toDouble()
            var someFloat:Float= 3288.55F
            val doubleVar:Double= peso * someFloat

            val pes =doubleVar.toString()

            uno_dolar.text  = "$ $pes "

        }



  // Para Euro

        button_Euro.setOnClickListener {
            val peso = et_Cop.text.toString().toDouble()
            var someFloat:Float = 3660.73F
            val doubleVar:Double= peso * someFloat
            val eur = doubleVar.toString()
            uno_Euro.text = "€ $eur"

        }















    }
}
