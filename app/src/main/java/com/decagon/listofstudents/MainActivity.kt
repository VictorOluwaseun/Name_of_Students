package com.decagon.listofstudents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentNames = mutableListOf(
                Student("Scott", "Edwards"),
                Student("Lewis", "Rogers"),
                Student("Meyer", "Mitchell"),
                Student("Harper", "Owens"),
                Student("Wright", "Cole"),
                Student("Matthews", "Reynolds"),
                Student("Martin", "Edwards"),
                Student("Jones", "Edwards"),
                Student("Henry", "Reynolds"),
                Student("Armstrong", "Johnson"),
                Student("Robertson", "Parker"),
                Student("Daniel", "Steve"),
                Student("Peter", "Mills"),
                Student("Lopez", "Smith"),
                Student("Lawrence", "Richardson"),
                Student("Edwards", "Andrews"),
        )

        val adapter = StudentAdapter(studentNames)

    }
}