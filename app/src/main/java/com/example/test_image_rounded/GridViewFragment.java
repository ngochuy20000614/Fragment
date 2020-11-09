package com.example.test_image_rounded;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class GridViewFragment extends Fragment {
    ArrayAdapter arrayAdapter;
    ArrayList arrayList;
    GridView listView;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment_gridview,container,false);
        listView = (GridView) view.findViewById(R.id.gridview1);
        arrayList = new ArrayList();
        arrayList.add("Python");
        arrayList.add("Python");
        arrayList.add("Python");
        arrayList.add("Python");
        arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1,
                arrayList);
        listView.setAdapter(arrayAdapter);
        return view;
    }
}
