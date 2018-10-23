package com.example.xiangha.firstrunning;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemFragment extends Fragment {

    private TextView textView;

    private List<String> mList = new ArrayList<String>();
    private View rootView;

    public static ItemFragment newInstance(int page) {
        ItemFragment fragment = new ItemFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.tab_item_layout, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initBook();
        RecyclerView recyslerview = view.findViewById(R.id.rv_item);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(getActivity());
        recyslerview.setLayoutManager(layoutmanager);
        ItemAdapter adapter = new ItemAdapter(mList);
        recyslerview.setAdapter(adapter);
    }

    private void initBook() {
        for (int i = 0; i < 100; i++) {
            mList.add("第"+i+"条");
        }
    }
}
