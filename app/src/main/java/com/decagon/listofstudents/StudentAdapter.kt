package com.decagon.listofstudents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_student.view.*

class StudentAdapter(private val students:List<Student>):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    inner class StudentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.itemView.apply {
            tvSurname.text = students[position].surname
            tvFirstName.text = students[position].firstName
        }
    }

    override fun getItemCount() = students.size
}