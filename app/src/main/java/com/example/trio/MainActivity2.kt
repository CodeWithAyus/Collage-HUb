package com.example.trio
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val clickActbutton = findViewById<Button>(R.id.gohome)
        clickActbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
override fun onBackPressed() {
    if (isOnMainActivity2()) {

        navigateToMainActivity()
    } else {
        super.onBackPressed()
    }
}

private fun isOnMainActivity2(): Boolean {
    return javaClass.simpleName == "MainActivity2"
}

private fun navigateToMainActivity() {

    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
    finish()
}
}
