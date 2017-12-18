package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xiaogengen.sportsinviting.R;

public class ChooseFriendsToInviteActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_friends_to_invite);
        btn=(Button)findViewById(R.id.tbutton3);
        btn.setOnClickListener(new BtnClickListener());
    }
    class BtnClickListener implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(ChooseFriendsToInviteActivity.this,InvitationActivity.class);
            startActivity(intent);
        }
    }}
