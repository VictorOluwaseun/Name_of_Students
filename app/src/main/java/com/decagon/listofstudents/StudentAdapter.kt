package com.decagon.listofstudents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_student.view.*

class StudentAdapter(private val students:List<Student>, private val clickListener:OnStudentClick):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.initClick(students[position], clickListener)
    }

    override fun getItemCount() = students.size

    inner class StudentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val holdSurname: TextView = itemView.tvSurname
        private val holdFirstName: TextView = itemView.tvFirstName

        fun initClick(data: Student, action: OnStudentClick){
            holdSurname.text = data.surname
            holdFirstName.text = data.firstName

            itemView.setOnClickListener{
                action.click(data)
            }
        }
    }

    interface OnStudentClick{
        fun click(data: Student)
    }
}