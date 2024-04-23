package co.edu.utadeo.fcni.consappmoviles.qta2programada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import co.edu.utadeo.fcni.consappmoviles.qta2programada.databinding.ActivityInicioSesionBinding

class inicioSesion : AppCompatActivity() {
    private lateinit var binding: ActivityInicioSesionBinding

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                // Respond to the action bar's Up/Home button
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Inicio Sesión"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val usuarioEditText = findViewById<EditText>(R.id.Usuario)
        val contrasenaEditText = findViewById<EditText>(R.id.Contraseña)
        fun lanzarDosMitades() {
            val intent = Intent(this, inicioSesion::class.java)
            startActivity(intent)
        }
        binding.imageButton.setOnClickListener {
            if(usuarioEditText.text.toString() == "alejing@gmail.com" && contrasenaEditText.text.toString() == "profe123"){
                lanzarDosMitades()
            }
        }
    }
}

