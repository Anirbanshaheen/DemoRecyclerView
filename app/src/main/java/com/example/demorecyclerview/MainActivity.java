package com.example.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Data list
        ArrayList<ExampleItem> exampleItems = new ArrayList<>();
        // 12 items
        exampleItems.add(new ExampleItem(R.drawable.ic_android_black, "Line One", "Line Two"));
        exampleItems.add(new ExampleItem(R.drawable.ic_video_label_black, "Line Three", "Line Four"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sentiment_neutral_black, "Line Five", "Line Six"));
        exampleItems.add(new ExampleItem(R.drawable.ic_wb_sunny_black, "Line Seven", "Line Eight"));

        exampleItems.add(new ExampleItem(R.drawable.ic_android_black, "Line One", "Line Two"));
        exampleItems.add(new ExampleItem(R.drawable.ic_video_label_black, "Line Three", "Line Four"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sentiment_neutral_black, "Line Five", "Line Six"));
        exampleItems.add(new ExampleItem(R.drawable.ic_wb_sunny_black, "Line Seven", "Line Eight"));

        exampleItems.add(new ExampleItem(R.drawable.ic_android_black, "Line One", "Line Two"));
        exampleItems.add(new ExampleItem(R.drawable.ic_video_label_black, "Line Three", "Line Four"));
        exampleItems.add(new ExampleItem(R.drawable.ic_sentiment_neutral_black, "Line Five", "Line Six"));
        exampleItems.add(new ExampleItem(R.drawable.ic_wb_sunny_black, "Line Seven", "Line Eight"));


        // Initialize Recycler View
        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerViewAdapter = new ExampleAdapter(exampleItems);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
