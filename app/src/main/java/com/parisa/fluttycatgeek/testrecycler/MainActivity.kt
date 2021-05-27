package com.parisa.fluttycatgeek.testrecycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainRecyclerAdapter.Interaction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = mutableListOf(
            UsersFieldDto(1, "Medicine"),
            UsersFieldDto(2, "Pharmacy"),
            UsersFieldDto(3, "Nursing"),
            UsersFieldDto(4, "Dentistry"),
            UsersFieldDto(4, "Medical")
        )

        val adapter = MainRecyclerAdapter()
        rvUser.adapter = adapter
        adapter.submitList(list)
        rvUser.layoutManager = LinearLayoutManager(this)
        adapter.notifyDataSetChanged()
    }

    override fun onItemSelected(position: Int, item: UsersFieldDto) {
        TODO("Not yet implemented")
    }
}