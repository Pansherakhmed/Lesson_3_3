package com.example.lesson_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityViewHolder extends RecyclerView.ViewHolder {

   private TextView tvCity;

    public CityViewHolder(View itemView) {
        super(itemView);
        tvCity = itemView.findViewById(R.id.tv_city);
    }
    public void bind(String city){
        tvCity.setText(city);
    }
}
