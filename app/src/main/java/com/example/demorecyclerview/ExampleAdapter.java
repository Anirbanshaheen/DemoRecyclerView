package com.example.demorecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> exampleItems;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewExampleItem;
        public TextView textViewOneItem;
        public TextView textViewTwoItem;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewExampleItem = itemView.findViewById(R.id.imageView);
            textViewOneItem = itemView.findViewById(R.id.textViewOne);
            textViewTwoItem = itemView.findViewById(R.id.textViewTwo);
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleItems) {
        this.exampleItems = exampleItems;

    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItem currentItem = exampleItems.get(position);

        holder.imageViewExampleItem.setImageResource(currentItem.getImageResource());
        holder.textViewOneItem.setText(currentItem.getTextOne());
        holder.textViewTwoItem.setText(currentItem.getTextTwo());
    }

    @Override
    public int getItemCount() {
        return exampleItems.size();
    }


}
