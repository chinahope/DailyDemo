package com.example.cm.removeviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    private RelativeLayout contentView;
    private RelativeLayout rootView;
    private String TAG = "eventTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootView = (RelativeLayout) findViewById(R.id.rl_root);
        contentView = (RelativeLayout) findViewById(R.id.rl_content);
        Button btn_add = (Button) findViewById(R.id.btn_add);
        Button btn_remove = (Button) findViewById(R.id.btn_remove);

        rootView.setOnClickListener(this);
        contentView.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_remove.setOnClickListener(this);

        rootView.setOnTouchListener(this);
        contentView.setOnTouchListener(this);
        btn_add.setOnTouchListener(this);
        btn_remove.setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(R.id.rl_root == id){
            Log.e(TAG, "root click");
        }else if(R.id.rl_content == id){
            Log.e(TAG, "content click");
        }else if(R.id.btn_add == id){
            Log.e(TAG, "btnAdd click");
        }else if(R.id.btn_remove == id){
            Log.e(TAG, "btnRemove click");
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.e(TAG, v + " , click action" + event.getAction());
        return false;
    }
}
