package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.xiaogengen.sportsinviting.R;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Logggg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button button_=(Button)findViewById(R.id.button4);
        button_.setOnClickListener(new BtnClickListener());
    }
    class BtnClickListener implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(Logggg.this,FunctionActivity.class);
            startActivity(intent);
        }

}}
