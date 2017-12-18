package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xiaogengen.sportsinviting.R;

public class InvitationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitation);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new BtnClickListener1());
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new BtnClickListener2());
    }


    class BtnClickListener1 implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(InvitationActivity.this, ChooseFriendsToInviteActivity.class);
            startActivity(intent);
        }

    }
    class BtnClickListener2 implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(InvitationActivity.this, ChooseFriendsToInviteActivity.class);
            startActivity(intent);
        }

    }
}

