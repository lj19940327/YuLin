package com.liujie.lenovo.yulin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class WebActivity extends AppCompatActivity {

    private WebView wv;
    private ImageView listview_xiangqing_fanhui_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        listview_xiangqing_fanhui_img = (ImageView) findViewById(R.id.listview_xiangqing_fanhui_img);
        listview_xiangqing_fanhui_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        wv = (WebView) findViewById(R.id.wv);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        wv.loadUrl(url);
    }
}
