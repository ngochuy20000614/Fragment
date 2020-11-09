package com.example.test_image_rounded;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ListViewFragment extends Fragment {
    ArrayAdapter arrayAdapter;
    ArrayList arrayList;
    ListView listView;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_listview,container,false);
        listView = (ListView)view.findViewById(R.id.listview1);
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
