package com.example.test_image_rounded;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LayoutFragmentListview1Activity extends AppCompatActivity {

    ArrayAdapter arrayAdapter;
    ArrayList arrayList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment_listview);
    }
}