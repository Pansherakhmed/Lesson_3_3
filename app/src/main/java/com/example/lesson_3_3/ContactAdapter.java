package com.example.lesson_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactVieHolder> {

    private ArrayList<String> contactList;

    public ContactAdapter(ArrayList<String> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactVieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactVieHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_first, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactVieHolder holder, int position) {
        holder.bind(contactList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

}
