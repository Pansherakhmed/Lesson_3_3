package com.example.lesson_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeroViewHolder extends RecyclerView.ViewHolder {

    private TextView tvHero;

    public HeroViewHolder( View itemView) {
        super(itemView);
        tvHero = itemView.findViewById(R.id.tv_hero);
    }
    public void bind(String hero){
        tvHero.setText(hero);
    }

}
