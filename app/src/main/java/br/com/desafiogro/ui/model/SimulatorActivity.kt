package br.com.desafiogro.ui.model

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.desafiogro.R
import kotlinx.android.synthetic.main.activity_simulador.*


class SimulatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulador)

        btn_simular.setOnClickListener{
            if (editNumber1.text.toString().length === 0) {
                editNumber2.text.get(0)
            }
            if (editNumber2.text.toString().length === 0) {
                editNumber1.text.get(0)
            }
            val num1 = editNumber1.text.toString().toInt()
            val num2  = editNumber2.text.toString().toInt()
            var taxaselic : Double = 4.25
            val sum =  taxaselic + (1 + num1 ) + num2/252
            textView_resultado.text = "Resultado:" + sum.toString()
            Toast.makeText(this, "Resultado" + textView_resultado.text, Toast.LENGTH_LONG).show()
        }



    }



}
