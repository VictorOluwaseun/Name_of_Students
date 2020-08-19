package com.decagon.listofstudents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_student.view.*
// Student Adapter which take the list of students' names, clickListener and extends RecyclerView Adapter
class StudentAdapter(private val students:List<Student>, private val clickListener:OnStudentClick):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    // Overriden method from super class
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }
    // The onBindViewHolder method
    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.initClick(students[position], clickListener)
    }
// The getItemCount method
    override fun getItemCount() = students.size
// The ViewHolder class which takes in itemView as View
    inner class StudentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val holdSurname: TextView = itemView.tvSurname
        private val holdFirstName: TextView = itemView.tvFirstName

        fun initClick(data: Student, action: OnStudentClick){
            holdSurname.text = data.surname
            holdFirstName.text = data.firstName
            // The event listner
            itemView.setOnClickListener{
                action.click(data)
            }
        }
    }
// The OnstudentClick interface for click
    interface OnStudentClick{
        fun click(data: Student)
    }
}