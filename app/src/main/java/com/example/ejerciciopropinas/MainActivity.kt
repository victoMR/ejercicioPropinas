package com.example.ejerciciopropinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var etNum1 : EditText //variables de inicio tardio
    private lateinit var etNum2 : EditText
    private lateinit var btnResultado : Button
    private lateinit var tvRes :TextView
    private lateinit var tvRes1 :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1) //para que encuentre el id
        etNum2 = findViewById(R.id.etNum2) //R: carpeta de r4ecursos (Resouses)
        btnResultado = findViewById(R.id.btnResultado)
        tvRes = findViewById(R.id.tvRes)
        tvRes1 = findViewById(R.id.tvRes1)

        btnResultado.setOnClickListener {
            if(etNum1.text.isEmpty() || etNum2.text.isEmpty()){
                tvRes.text = "Debes de escribir un numero"
            }else{
                var num1 : Float = etNum1.text.toString().toFloat()
                var num2 : Float = etNum2.text.toString().toFloat()

                var propina : Double = (num1*0.10)
                var resultado : Double = (num1*0.10)/num2


                tvRes1.text = "La propina es de =  $$propina"
                tvRes.text = "Cada uno debe pagar  =  $$resultado"

            }
        }
    }
}