package com.example.recyclerviewprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var userList = arrayListOf<DataVo>(
        DataVo("user1", "test1", "suwon", 30000, "user_img_01"),
        DataVo("user2", "test2", "seoul", 20000, "user_img_02"),
        DataVo("user3", "test3", "suwon", 50000, "user_img_03")
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recycler_view_id = findViewById<RecyclerView>(R.id.recycler_view)
        val mAdapter = CustomAdapter(this, userList)

        recycler_view_id.adapter = mAdapter

        val layout = LinearLayoutManager(this)
        recycler_view_id.layoutManager = layout
        recycler_view_id.setHasFixedSize(true)
    }
}