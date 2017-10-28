package com.porollo.doitkotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.allTaskListView)

        listView.adapter = ToDoMainListAdapter(this)
    }



    private class ToDoMainListAdapter(context: Context) : BaseAdapter() {

        private val mContext: Context = context
        private val tasks = arrayListOf<String>("Make DoIT App", "Make Typhoon Weather",
                "Make Courcework", "Make World", "Make Something Else")

        override fun getCount(): Int {
            return tasks.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getItem(position: Int): Any {
            return "Test"
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {

            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false )


            val taskTextView = rowMain.findViewById<TextView>(R.id.taskTextView)
            taskTextView.text = tasks.get(position)

            val positionTextView = rowMain.findViewById<TextView>(R.id.positionTextView)
            positionTextView.text = "Subtasks: $position"

            return rowMain
        }
    }
}

