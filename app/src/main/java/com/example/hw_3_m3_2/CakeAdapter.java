package com.example.hw_3_m3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CakeAdapter extends RecyclerView.Adapter<CakeViewHolder> {

    private ArrayList<String> cakeList;

    public CakeAdapter(ArrayList<String> cakeList) {
        this.cakeList = cakeList;
    }


    @NonNull
    @Override
    public CakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CakeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cake,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CakeViewHolder holder, int position) {
        holder.bind(cakeList.get(position));
    }

    @Override
    public int getItemCount() {
        return cakeList.size();
    }
}
