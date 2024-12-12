package tr.com.nuritiras.ogrenmebirimi5uygulama4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val textView = findViewById<TextView>(R.id.textView)

        button1.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val toplam = topla(sayi1, sayi2)
            textView.text = "Sonuç: $toplam"
        }

        button2.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val sayi3 = editText3.text.toString().toInt()
            val toplam = topla(sayi1, sayi2, sayi3)
            textView.text = "Sonuç: $toplam"
        }

    }

    fun topla(sayi1: Int, sayi2: Int): Int {
        return sayi1 + sayi2
    }

    fun topla(sayi1: Int, sayi2: Int, sayi3: Int): Int {
        return sayi1 + sayi2 + sayi3
    }
}