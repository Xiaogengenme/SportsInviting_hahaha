package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.xiaogengen.sportsinviting.R;

public class Choosing_tennis extends AppCompatActivity {

    private String[] data={"北京邮电大学网球场","北京师范大学网球场","首都体育大学网球场","齐动力儿童网球馆"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_tennis);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Choosing_tennis.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(Choosing_tennis.this,ChooseFriendsToInviteActivity.class);
                startActivity(intent);
            }
        });
    }
}
