package com.maxrodrigoss.olimpiadasdeesp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        BTcontinuar.setOnClickListener {
            val time1 = nomeDoTime1.text.toString().trim()
            val time2 = nomeDoTime2.text.toString().trim()

            if (time1 = ""){
                Toast.makeText(this, "preencha o time 1", Toast.LENGTH_SHORT).show()
                return@setOnClickListener }
            if (time2 = ""){
                Toast.makeText(this, "preencha o Time 2", Toast.LENGTH_SHORT).show()
                return@setOnClickListener }

            val intent = intent(this, )
        }
    }
}
