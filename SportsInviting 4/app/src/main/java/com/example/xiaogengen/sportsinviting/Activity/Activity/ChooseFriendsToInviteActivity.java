package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xiaogengen.sportsinviting.R;

public class ChooseFriendsToInviteActivity extends AppCompatActivity {
    private Button btn3;
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_friends_to_invite);
        btn3=(Button)findViewById(R.id.tbutton3);
        btn3.setOnClickListener(new BtnClickListener3());

        btn1=(Button)findViewById(R.id.tbutton1);
        btn1.setOnClickListener(new BtnClickListener1());

        btn2=(Button)findViewById(R.id.tbutton2);
        btn2.setOnClickListener(new BtnClickListener2());
    }
    class BtnClickListener3 implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(ChooseFriendsToInviteActivity.this,GuideActivity.class);
            startActivity(intent);
        }
    }

    class BtnClickListener1 implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(ChooseFriendsToInviteActivity.this,InvitationActivity.class);
            startActivity(intent);
        }

    }class BtnClickListener2 implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(ChooseFriendsToInviteActivity.this,InvitationActivity.class);
            startActivity(intent);
        }
    }





}
