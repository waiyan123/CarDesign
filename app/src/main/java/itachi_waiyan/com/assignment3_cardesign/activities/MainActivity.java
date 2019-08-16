package itachi_waiyan.com.assignment3_cardesign.activities;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import itachi_waiyan.com.assignment3_cardesign.R;
import itachi_waiyan.com.assignment3_cardesign.adapter.MyPagerAdapter;
import itachi_waiyan.com.assignment3_cardesign.adapter.RvAdapter;
import itachi_waiyan.com.assignment3_cardesign.fragment.FragmentChild;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager ;
    MyPagerAdapter pagerAdapter;
    Toolbar toolbar;
    TabLayout tabs;
    ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);

        toolbar = findViewById(R.id.tool_bar);

        tabs = findViewById(R.id.tabs);
        setSupportActionBar(toolbar);

        tabs.setupWithViewPager(viewPager);
        setupWithViewPager(viewPager);

        imgBack = findViewById(R.id.img_back);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    private void setupWithViewPager(ViewPager vp){
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new FragmentChild(),"LOWEST PRICE");
        pagerAdapter.addFragment(new FragmentChild(),"DISTANCE");
        pagerAdapter.addFragment(new FragmentChild(),"RECOMMENDED");

        vp.setAdapter(pagerAdapter);
    }
}
