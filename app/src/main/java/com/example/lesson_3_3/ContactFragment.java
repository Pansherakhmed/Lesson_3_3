package com.example.lesson_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class ContactFragment extends Fragment {

    private ArrayList<String> contactList = new ArrayList<String>();
    private RecyclerView rvContact;
    private ContactAdapter contactAdapter = new ContactAdapter(contactList);
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hero, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvContact = view.findViewById(R.id.rv_contact);
        loadData();
        rvContact.setAdapter(contactAdapter);
        button = view.findViewById(R.id.btn_contact);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.fragment, new HeroFragment()).commit();
            }
        });

    }

    private void loadData() {
        contactList.add("Contact 1");
        contactList.add("Contact 2");
        contactList.add("Contact 3");
        contactList.add("Contact 4");
        contactList.add("Contact 5");
        contactList.add("Contact 6");
        contactList.add("Contact 7");
        contactList.add("Contact 8");
        contactList.add("Contact 9");
        contactList.add("Contact 10");
        contactList.add("Contact 11");
        contactList.add("Contact 12");
        contactList.add("Contact 13");
    }
}