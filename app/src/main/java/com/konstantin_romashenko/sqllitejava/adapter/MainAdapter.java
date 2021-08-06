package com.konstantin_romashenko.sqllitejava.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder>
{
    private Context context;
    private List<String> mainArray;

    public MainAdapter(Context context)
    {
        this.context = context;
        mainArray = new ArrayList<>();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return mainArray.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void updateAdapter(List<String> newList)
    {
        mainArray.clear();
        mainArray.addAll(newList);
        notifyDataSetChanged();
    }
}
