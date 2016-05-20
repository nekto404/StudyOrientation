package com.example.nekto404.stuyorientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;

public class Ori extends AppCompatActivity {

    TextView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ori);
        v1 = (TextView) findViewById(R.id.textView);
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
        v1.setText(getRotateOrientation());
    }

}
