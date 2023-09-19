package com.example.hw_3_m3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CakeViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_cake;
    public CakeViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_cake = itemView.findViewById(R.id.tv_cake);

    }

    public void bind(String cakeName){
        tv_cake.setText(cakeName);
    }
}
