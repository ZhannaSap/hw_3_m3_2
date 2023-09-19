package com.example.hw_3_m3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class OneA extends Fragment {
    private ArrayList<String> cakeList = new ArrayList<>();
    private RecyclerView rvCake;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCake = requireActivity().findViewById(R.id.rv_cake);
        loadData();
        CakeAdapter adapter = new CakeAdapter(cakeList);
        rvCake.setAdapter(adapter);

    }

    private void loadData() {
        cakeList.add("Терамису");
        cakeList.add("Красный Бархат");
        cakeList.add("Брауни");
        cakeList.add("Медовик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
        cakeList.add("Ещё какой-то тортик");
    }
}