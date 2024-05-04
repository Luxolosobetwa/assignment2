package com.example.project2




        import android.annotation.SuppressLint
        import android.content.Intent
                import android.os.Bundle
                import android.widget.Button
                import androidx.appcompat.app.AppCompatActivity

        class MainActivity : AppCompatActivity() {

            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val getStartedButton: Button = findViewById(R.id.getStartedButton)

                getStartedButton.setOnClickListener {
                    // Define the destination activity
                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    // Start the next activity
                    startActivity(intent)
                }
            }
        }