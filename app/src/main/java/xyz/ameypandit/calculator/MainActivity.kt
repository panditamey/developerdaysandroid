package xyz.ameypandit.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter: TextView = findViewById(R.id.counter)
        val reset: TextView = findViewById(R.id.reset)
        val incrementButton: Button = findViewById(R.id.incrementButton)
        val decrementButton: Button = findViewById(R.id.decrementButton)

        incrementButton.setOnClickListener {
            var value = Integer.parseInt(counter.text.toString())
            value++
            counter.text = value.toString()
        }

        decrementButton.setOnClickListener {
            var value = Integer.parseInt(counter.text.toString())
            value--
            counter.text = value.toString()
        }

        reset.setOnClickListener {
            counter.text = "0"
        }

    }
}