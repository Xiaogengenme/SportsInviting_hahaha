package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.xiaogengen.sportsinviting.R;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.Window;
public class MapActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        btn=(Button)findViewById(R.id.map);
        btn.setOnClickListener(new BtnClickListener());
    }
    class BtnClickListener implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(MapActivity.this,ChooseFriendsToInviteActivity.class);
            startActivity(intent);

        }}
}
