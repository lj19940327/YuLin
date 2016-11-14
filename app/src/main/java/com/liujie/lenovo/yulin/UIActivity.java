package com.liujie.lenovo.yulin;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;

import fragment.faxian_fragment;
import fragment.wode_fragment;
import fragment.xiaoxi_fragment;
import fragment.yinxiang_fragment;

public class UIActivity extends FragmentActivity implements View.OnClickListener {

    private FragmentManager manager;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private yinxiang_fragment yinxiang;
    private faxian_fragment faxian;
    private wode_fragment wode;
    private xiaoxi_fragment xiaoxi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ui);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        rb4.setOnClickListener(this);

        getFragment();
        changeFragment("f1");
    }
    /*
    * 通过tag值选择显示或隐藏fragment
    * */
    private void changeFragment(String tag) {
        // TODO Auto-generated method stub
        FragmentTransaction trans = manager.beginTransaction();

        if ("f1".equals(tag)) {
            trans.show(yinxiang);
            trans.hide(faxian);
            trans.hide(xiaoxi);
            trans.hide(wode);
        } else if ("f2".equals(tag)) {
            trans.show(faxian);
            trans.hide(yinxiang);
            trans.hide(xiaoxi);
            trans.hide(wode);
        } else if ("f3".equals(tag)) {
            trans.show(xiaoxi);
            trans.hide(yinxiang);
            trans.hide(faxian);
            trans.hide(wode);
        } else if ("f4".equals(tag)) {
            trans.show(wode);
            trans.hide(yinxiang);
            trans.hide(faxian);
            trans.hide(xiaoxi);
        }
        trans.commit();
    }
    /*
    * 实例化fragment*/
    private void getFragment() {
        manager = getSupportFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        yinxiang = new yinxiang_fragment();
        faxian = new faxian_fragment();
        xiaoxi = new xiaoxi_fragment();
        wode = new wode_fragment();
        trans.add(R.id.fg, yinxiang, "f1");
        trans.add(R.id.fg, faxian, "f2");
        trans.add(R.id.fg, xiaoxi, "f3");
        trans.add(R.id.fg, wode, "f4");
        trans.commit();
    }
/*
* 通过ID找到tag值
* */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rb1:
                changeFragment("f1");
                break;
            case R.id.rb2:
                changeFragment("f2");
                break;
            case R.id.rb3:
                changeFragment("f3");
                break;
            case R.id.rb4:
                changeFragment("f4");
                break;

            default:
                break;

    }
}
}
