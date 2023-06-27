package com.example.lesson_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CityFragment extends Fragment {

    private ArrayList<String> cityList = new ArrayList<String>();
    private RecyclerView rvCity;
    private CityAdapter cityAdapter = new CityAdapter(cityList);



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCity = view.findViewById(R.id.tv_city);
        loadData();
        rvCity.setAdapter(cityAdapter);
}

    private void loadData() {
        cityList.add("Бишкек");
        cityList.add("Алма-Ата");
        cityList.add("Абу-Даби");
        cityList.add("Бангкок");
        cityList.add("Барселона");
        cityList.add("Белград");
        cityList.add("Будапешт");
        cityList.add("Вашингтон");
        cityList.add("Москва");
        cityList.add("Дубай");
        cityList.add("Санкт-Петербург");
        cityList.add("Лас-Вегас");
        cityList.add("Павлодар");
        cityList.add("Сан-Франциско");
    }
}