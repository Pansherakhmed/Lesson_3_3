package com.example.lesson_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroViewHolder> {

    private ArrayList<String> heroList;

    public HeroAdapter(ArrayList<String> heroList) {
        this.heroList = heroList;
    }


    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeroViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_second,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
    holder.bind(heroList.get(position));
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }
}
