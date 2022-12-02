package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class demo_newspaper extends AppCompatActivity {

    private ViewPager mViewPager;
    private BottomNavigationView mBottomNavigationView;
    private RecyclerView rcvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_newspaper);

        mViewPager = findViewById(R.id.view_pager);
        mBottomNavigationView = findViewById(R.id.bottom_nav);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(1);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        mBottomNavigationView.getMenu().findItem(R.id.home1).setChecked(true);
                        break;
                    case 1:
                        mBottomNavigationView.getMenu().findItem(R.id.favorite).setChecked(true);
                        break;
                    case 2:
                        mBottomNavigationView.getMenu().findItem(R.id.user).setChecked(true);
                        break;
                    case 3:
                        mBottomNavigationView.getMenu().findItem(R.id.search).setChecked(true);
                        break;
                    case 4:
                        mBottomNavigationView.getMenu().findItem(R.id.Category).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home1:
                        mViewPager.setCurrentItem(0);
                        Toast.makeText(demo_newspaper.this, "Home", Toast.LENGTH_SHORT).show();
                        Tab1_Fragment tab1Fragment = (Tab1_Fragment) mViewPager.getAdapter().instantiateItem(mViewPager, 0);
                        tab1Fragment.reloadData();
                        break;
                    case R.id.favorite:
                        mViewPager.setCurrentItem(1);
                        Toast.makeText(demo_newspaper.this, "Favorite", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.user:
                        mViewPager.setCurrentItem(2);
                        Toast.makeText(demo_newspaper.this, "Username", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.search:
                        mViewPager.setCurrentItem(3);
                        Toast.makeText(demo_newspaper.this, "Search", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Category:
                        mViewPager.setCurrentItem(4);
                        Toast.makeText(demo_newspaper.this, "Category", Toast.LENGTH_SHORT).show();
                        break;

                }
                return true;
            }
        });
        replaceFragment(new Tab1_Fragment());
    }

    private void replaceFragment(Tab1_Fragment tab1_fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.view_pager, tab1_fragment);
        fragmentTransaction.commit();
    }
}