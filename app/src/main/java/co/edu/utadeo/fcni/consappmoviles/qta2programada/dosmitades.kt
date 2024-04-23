package co.edu.utadeo.fcni.consappmoviles.qta2programada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class dosmitades : AppCompatActivity() {
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
        setContentView(R.layout.activity_dosmitades)

        supportActionBar?.title = "Dos Mitades"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}