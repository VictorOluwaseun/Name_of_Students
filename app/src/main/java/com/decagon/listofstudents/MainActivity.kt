package com.decagon.listofstudents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

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
        rvStudents.adapter = adapter
        rvStudents.layoutManager = LinearLayoutManager(this)
    }
}