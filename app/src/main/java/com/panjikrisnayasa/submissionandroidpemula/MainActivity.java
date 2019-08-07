package com.panjikrisnayasa.submissionandroidpemula;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Shoe> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbarMain = findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolbarMain);

        mRecyclerView = findViewById(R.id.recycler_main_shoes);
        mRecyclerView.setHasFixedSize(true);

        list.addAll(ShoesData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ShoesAdapter shoesAdapter = new ShoesAdapter(list);
        mRecyclerView.setAdapter(shoesAdapter);
    }
}
