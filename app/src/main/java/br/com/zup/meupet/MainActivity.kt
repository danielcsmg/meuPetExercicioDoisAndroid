package br.com.zup.meupet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagem = findViewById<Button>(R.id.button_message)
        botaoMensagem.setOnClickListener {
            Toast.makeText(this,"Meu nome é Pequeno!", Toast.LENGTH_LONG).show()
        }
    }
}