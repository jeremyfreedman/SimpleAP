package me.jeremyfreedman.simpleap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val newRecipeFab = findViewById(R.id.floatingActionButton) as FloatingActionButton
    newRecipeFab.setOnClickListener toNewRecipeActivity() {

    }
}
