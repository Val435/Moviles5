package sv.edu.ufg.fis.amb.pb100221_valentina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.title="Pocasangre Bonilla"
        supportActionBar?.subtitle="Universidad Francisco gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)

        val boton = findViewById<Button>(R.id.btn);

        boton.setOnClickListener{
            val intent = Intent(this, SegundaPantalla::class.java)
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ufg_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.configuracion ->{
                Toast.makeText(this ,"Usted ha seleccinado la opcion de configuracion ", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.perfil->{
                Toast.makeText(this ,"Usted ha seleccinado la opcion de ver su perfil ", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.mapa ->{
                Toast.makeText(this ,"Usted ha seleccinado la opcion de configuracion  ", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nueva_cuenta ->{
                Toast.makeText(this ,"Usted ha seleccinado la opcion de agregar cuenta ", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.salir ->{
                Toast.makeText(this ,"Usted ha seleccinado la opcion de cerrar sesion  ", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false

        }

    }
}