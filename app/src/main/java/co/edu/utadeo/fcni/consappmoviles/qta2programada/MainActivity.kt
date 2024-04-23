package co.edu.utadeo.fcni.consappmoviles.qta2programada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import co.edu.utadeo.fcni.consappmoviles.qta2programada.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        fun lanzarInicioSesion() {
            val intent = Intent(this, inicioSesion::class.java)
            startActivity(intent)
        }
        binding.imageButton2.setOnClickListener {
            lanzarInicioSesion()
        }
    }
}