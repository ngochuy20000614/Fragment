package com.example.test_image_rounded;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    ViewPager viewPager;
    RadioButton rbListView, rbGridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewpager_trangchu);
        rbListView = (RadioButton)findViewById(R.id.rblistview);
        rbGridView = (RadioButton)findViewById(R.id.rbgriview);
        AdapterViewPager adapterViewPager = new AdapterViewPager(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                rbListView.setChecked(true);
                break;
            case 1:
                rbGridView.setChecked(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}