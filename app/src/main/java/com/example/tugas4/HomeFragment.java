package com.example.tugas4;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView rv_llist;
    private ArrayList<com.example.tugas4.Heroes> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rv_llist = view.findViewById(R.id.rv_list);
        list.addAll(com.example.tugas4.HeroesData.getHeroList());

        ShowRecycleList();
        return view;
    }

    private void ShowRecycleList() {
        rv_llist.setLayoutManager(new LinearLayoutManager(getActivity()));
        com.example.tugas4.HeroesAdapter heroesAdapter = new com.example.tugas4.HeroesAdapter(getActivity());
        heroesAdapter.setListHero(list);
        rv_llist.setAdapter(heroesAdapter);

    }

}