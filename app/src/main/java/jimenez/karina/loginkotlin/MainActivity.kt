package jimenez.karina.loginkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.DragStartHelper
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar.setOnClickListener{
            val user = etNombre.text.toString()
            val pass = etPass.text.toString()

            if (user.equals("") or pass.equals("")){
               mensaje("Datos vacios", Toast.LENGTH_LONG)
            }else {
                if (user.equals("karina") and pass.equals("1234")){
                    val i = Intent(this, ActivitySegunda::class.java)
                    i.putExtra("nombre", "karina")
                    startActivity(i)
                }else{
                    mensaje("No te conozco")

                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.wtf("ejemplo", "Debo estar en el onStart")
    }



    fun mensaje(mensaje:String,dur:Int= Toast.LENGTH_SHORT){
        Toast.makeText(this,mensaje,dur).show()

    }


}
