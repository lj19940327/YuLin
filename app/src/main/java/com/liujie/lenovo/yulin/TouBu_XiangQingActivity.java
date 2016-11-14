package com.liujie.lenovo.yulin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class TouBu_XiangQingActivity extends AppCompatActivity {
    private String path="http://www.yulin520.com/a2a/h/news/o/1952?a=1478245100676";
    private WebView wb;
    private WebView webview;
    private ImageView toubu_xiangqing_fanhui_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tou_bu__xiang_qing);
        wb=(WebView)findViewById(R.id.webview);
        wb.loadUrl(path);
       wb.setWebViewClient(new WebViewClient());
        toubu_xiangqing_fanhui_img=(ImageView)findViewById(R.id.toubu_xiangqing_fanhui_img);
        toubu_xiangqing_fanhui_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
