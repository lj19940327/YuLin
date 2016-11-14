package com.liujie.lenovo.yulin;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;

import adapter.MyPageAdapter;

public class MainActivity extends Activity {
    private int[] image = {R.mipmap.start1, R.mipmap.start2, R.mipmap.start3, R.mipmap.start4};
    private ViewPager vp_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        SharedPreferences sp = getSharedPreferences("info", MODE_PRIVATE);
        Boolean isFirst = sp.getBoolean("isFirstLogin", false);
        if (!isFirst) {
            vp_page = (ViewPager) findViewById(R.id.vp_page);
            vp_page.setAdapter(new MyPageAdapter(this));
            vp_page.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    if (position == image.length - 1) {

                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean("isFirstLogin", true);
            editor.commit();

        }

        else {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
