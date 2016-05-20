package com.example.nekto404.stuyorientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;

public class Ori extends AppCompatActivity {

    TextView v1;
    String str="Hellow world";
    private static final String KEY_STR= "Str";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ori);
        v1 = (TextView) findViewById(R.id.textView);

        if (savedInstanceState != null) {
            str = savedInstanceState.getString(KEY_STR, "Hellow");
            v1.setText(str);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString(KEY_STR, str);
    }

    private String getRotateOrientation() {
        int rotate = getWindowManager().getDefaultDisplay().getRotation();
        switch (rotate) {
            case Surface.ROTATION_0:
                return "Не поворачивали";
            case Surface.ROTATION_90:
                return "Повернули на 90 градусов по часовой стрелке";
            case Surface.ROTATION_180:
                return "Повернули на 180 градусов";
            case Surface.ROTATION_270:
                return "Повернули на 90 градусов против часовой стрелки";
            default:
                return "Не понятно";
        }
    }

    public void onClickButton(View view) {
        str=getRotateOrientation();
        v1.setText(str);
    }

}
