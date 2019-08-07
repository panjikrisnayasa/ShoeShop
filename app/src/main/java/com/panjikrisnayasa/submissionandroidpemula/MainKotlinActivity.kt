package com.panjikrisnayasa.submissionandroidpemula

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar

class MainKotlinActivity : AppCompatActivity() {

    private lateinit var mToolbar: Toolbar
    private lateinit var mRecyclerView: RecyclerView
    private var list: ArrayList<ShoeKotlin> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mToolbar = findViewById(R.id.toolbar_main)
        mRecyclerView = findViewById(R.id.recycler_main_shoes)
        mRecyclerView.setHasFixedSize(true)

        setSupportActionBar(mToolbar)

        list.addAll(ShoesDataKotlin.listShoesDataKotlin)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        mRecyclerView.layoutManager = LinearLayoutManager(this@MainKotlinActivity)
        val shoesAdapterKotlin = ShoesAdapterKotlin(list)
        mRecyclerView.adapter = shoesAdapterKotlin
    }
}