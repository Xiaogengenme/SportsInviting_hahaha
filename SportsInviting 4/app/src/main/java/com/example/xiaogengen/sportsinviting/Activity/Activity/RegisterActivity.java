package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xiaogengen.sportsinviting.R;

public class RegisterActivity extends AppCompatActivity {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }

        btn1=(Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new BtnClickListener());

    }
    class BtnClickListener implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
            startActivity(intent);
        }
    }
}