package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameEdit : EditText
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEdit = findViewById(R.id.nameEditText)
        button = findViewById(R.id.clickMeButton)


        button.setOnClickListener {
            var name = nameEdit.text.toString()
            if (name.isEmpty()) {
                nameEdit.setError("Name has not been entered")
                var displayText = displayTextView.text.toString()

            }
            else {
                displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
            }


        }


    }
}