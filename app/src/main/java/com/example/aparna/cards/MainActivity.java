package com.example.aparna.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set status bar bg to transparent

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //setup recycler view with adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<Item> mlist = new ArrayList<>();
        mlist.add(new Item(R.drawable.aa,"Cities",R.drawable.a,1234));
        mlist.add(new Item(R.drawable.gg,"Cities",R.drawable.b,1234));
        mlist.add(new Item(R.drawable.cc,"Cities",R.drawable.c,1234));
        mlist.add(new Item(R.drawable.dd,"Cities",R.drawable.d,1234));
        mlist.add(new Item(R.drawable.ee,"Cities",R.drawable.e,1234));
        mlist.add(new Item(R.drawable.hh,"Cities",R.drawable.f,1234));
        mlist.add(new Item(R.drawable.gg,"Cities",R.drawable.g,1234));
        Adapter adapter = new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
