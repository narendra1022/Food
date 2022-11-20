package com.example.food

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CouseRVAdapter(private var courseList: ArrayList<CourseRVModal>) : RecyclerView.Adapter<CouseRVAdapter.CouseViewHolder>() {
    inner class CouseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val courseIV: ImageView =itemView.findViewById(R.id.image)
        val courseNameTV: TextView =itemView.findViewById(R.id.text)
    }

    var onclick:((CourseRVModal) -> Unit) ? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CouseViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.course_rv_item,parent,false)
        return CouseViewHolder(view)
    }

    // method for filtering our recyclerview items.
    fun filterList(filterlist: ArrayList<CourseRVModal>) {
        courseList = filterlist
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder:CouseViewHolder, position: Int) {
        val fod=courseList[position]
        holder.courseNameTV.text = fod.courseName
        holder.courseIV.setImageResource(fod.courseImg)

        holder.itemView.setOnClickListener{
            onclick?.invoke(fod)
        }
    }

    override fun getItemCount(): Int {
        return courseList.size
    }


}
