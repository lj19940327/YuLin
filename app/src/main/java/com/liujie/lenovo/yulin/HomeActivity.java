package com.liujie.lenovo.yulin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends Activity {


    private ImageView home_image;
    private Timer timer;
    private int count;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(android.os.Message msg) {
            count=msg.arg1;
            if(count==3){
                Intent intent=new Intent(HomeActivity.this,UIActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
        if(timer==null){
            timer=new Timer();
            timer.schedule(new TimerTask() {
                int count=0;
                @Override
                public void run() {
                Message msg=Message.obtain();
                    msg.arg1=count;
                    handler.sendMessage(msg);
                    count++;
                }
            },0,1000);
        }
      home_image=(ImageView)findViewById(R.id.home_image);
        home_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,UIActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(timer!=null){
            timer.cancel();
        }
    }
}

