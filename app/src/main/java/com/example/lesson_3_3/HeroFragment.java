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


public class HeroFragment extends Fragment {

    private ArrayList<String> heroList = new ArrayList<String>();
    private RecyclerView rvHero;
    private HeroAdapter heroAdapter = new HeroAdapter(heroList);
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
        rvHero = view.findViewById(R.id.rv_contact);
        loadData();
        rvHero.setAdapter(heroAdapter);
        button = view.findViewById(R.id.btn_hero);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.fragment, new HeroFragment()).commit();
            }
        });
}

    private void loadData() {
        heroList.add("Ник Фьюри");
        heroList.add("Доктор Стрендж");
        heroList.add("Тор");
        heroList.add("Человек-Паук");
        heroList.add("Соколинный глаз");
        heroList.add("Ракета");
        heroList.add("Грут");
        heroList.add("Железный человек");
        heroList.add("Халк");
        heroList.add("Капитан Америка");
        heroList.add("Ртуть");
        heroList.add("Черная Вдова");
        heroList.add("Черная Пантера");
    }
}