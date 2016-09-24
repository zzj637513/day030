package com.example.administrator.day030;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getScreenInfo();
    }

    private void getScreenInfo(){
        DisplayMetrics dm=getResources().getDisplayMetrics();
        //屏幕的密度比
        float density=dm.density;
        //屏幕的密度
        int dpi=dm.densityDpi;
        //屏幕的宽度：px为单位
        int w=dm.widthPixels;
        int h=dm.heightPixels;
        //字体在屏幕显示的比
        float sd=dm.scaledDensity;

        StringBuilder sb=new StringBuilder();
        sb.append("密度比：").append(density).append("\n");
        sb.append("dpi：").append(dpi).append("\n");
        sb.append("宽：").append(w).append("\n");
        sb.append("高：").append(h).append("\n");
        sb.append("字体比：").append(sd).append("\n");
        Log.d("zzj",sb.toString());
        //要提交的代码
    }















}
