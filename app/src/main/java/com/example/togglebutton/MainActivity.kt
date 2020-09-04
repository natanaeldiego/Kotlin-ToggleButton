package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var interruptor: ToggleButton
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView)
        interruptor = findViewById(R.id.toggleButton)
        botao = findViewById(R.id.button)

        interruptor.setOnCheckedChangeListener {
            buttonView, isChecked -> isChecked
            texto.text = verificaToggle(isChecked)
        }

        botao.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, texto.text, Toast.LENGTH_LONG).show()
            }

        })
    }

    private fun verificaToggle(isChecked: Boolean): String {
        var textoExibir = ""
        if (isChecked) {
            textoExibir = "Ligado"
        } else {
            textoExibir = "Desligado"
        }

        return  textoExibir
    }
}