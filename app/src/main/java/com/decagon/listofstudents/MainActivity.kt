package com.decagon.listofstudents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), StudentAdapter.OnStudentClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// List of students names
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
// Setting recycler view adapter
        val adapter = StudentAdapter(studentNames, this)
        rvStudents.adapter = adapter
        rvStudents.layoutManager = LinearLayoutManager(this)
    }
// The override function from OnStudentClick Interface
    override fun click(data: Student) {
        Toast.makeText(this, "Hi! ${data.surname} ${data.firstName}", Toast.LENGTH_SHORT).show()
    }


}