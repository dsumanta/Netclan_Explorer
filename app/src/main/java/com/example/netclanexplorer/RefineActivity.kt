package com.example.netclanexplorer
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.GridLayout
import android.widget.Spinner
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.netclanexplorer.R

class RefineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.refine_activity)
        val spinner = findViewById<Spinner>(R.id.spinner)

// Create an ArrayAdapter using a string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.dropdown_items_array,
            android.R.layout.simple_spinner_item
        )

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

// Set the adapter for the spinner
        spinner.adapter = adapter
        val backToMainActivity:Button=findViewById(R.id.back_to_mainactivity)
        backToMainActivity.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            this.onBackPressedDispatcher.onBackPressed();

        }

        val gridLayout: GridLayout = findViewById(R.id.gridLayout)
        val childCount: Int = gridLayout.childCount

        for (i in 0 until childCount) {
            val view: View = gridLayout.getChildAt(i)
            if (view is TextView) {
                val textView: TextView = view
                val originalBackground = textView.background
                val originalTextColor = textView.currentTextColor

                textView.setOnClickListener {
                    if (textView.background == originalBackground) {
                        textView.setBackgroundResource(R.drawable.background_circle)
                        textView.setTextColor(ContextCompat.getColor(this, android.R.color.white))
                    } else {
                        textView.background = originalBackground
                        textView.setTextColor(originalTextColor)
                    }
                }
            }
        }
        val editText = findViewById<EditText>(R.id.editText)
        val maxLength = 250 // Set your desired maximum length
        val usedCharactersTextView = findViewById<TextView>(R.id.usedCharactersTextView)
        val remainingCharactersTextView = findViewById<TextView>(R.id.remainingCharactersTextView)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val currentLength = s?.length ?: 0
                val remainingCharacters = maxLength - currentLength

                usedCharactersTextView.text = "$currentLength"
                remainingCharactersTextView.text = "/250"
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })


    }


}
