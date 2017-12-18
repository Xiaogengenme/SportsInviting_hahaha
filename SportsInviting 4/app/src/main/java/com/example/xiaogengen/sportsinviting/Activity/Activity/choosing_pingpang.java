package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.xiaogengen.sportsinviting.R;

public class choosing_pingpang extends AppCompatActivity {

    private String[] data={"北航体育馆乒乓球场","威凯体育文化俱乐部","北京交通大学乒乓球","乒乓球活动室"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_pingpang);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(choosing_pingpang.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(choosing_pingpang.this,ChooseFriendsToInviteActivity.class);
                startActivity(intent);
            }
        });
    }
}
