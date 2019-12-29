package com.example.ifood.com.precocervejaemlitro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   fun somarLitro (view : View){

       var valor_ml = editTextMl.text.toString()
       var valor_preco = editTextPreco.text.toString();
       somarlitros(valor_ml,valor_preco)
   }

    private fun somarlitros(vMl: String, vPreco: String) {

        var valorML = vMl.toDouble();
        var preco = vPreco.toDouble()
        var resultadoDoPreco = valorML * preco;

        textViewResult.text = "O valor em litro é $resultadoDoPreco"

    }

}
