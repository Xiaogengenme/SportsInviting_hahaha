package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.example.xiaogengen.sportsinviting.R;

public class GuideActivity extends AppCompatActivity {

    private Button btn_start_WO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);//设置对应的XML布局文件

        MapView mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);// 此方法必须重写
        AMap aMap = mapView.getMap();
        // Button buttonToFriendsList=(Button)findViewById(R.id.button_Go2);

        btn_start_WO = (Button) findViewById(R.id.button_Go2);
        btn_start_WO.setOnClickListener(new BtnClickListener_go());


    }


    class BtnClickListener_go implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(GuideActivity.this, WorkOutActivity.class);
            startActivity(intent);
        }
    }
}


