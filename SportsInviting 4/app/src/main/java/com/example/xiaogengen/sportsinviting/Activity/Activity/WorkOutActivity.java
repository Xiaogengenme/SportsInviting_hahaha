package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.xiaogengen.sportsinviting.R;

public class WorkOutActivity extends AppCompatActivity {

    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);

//        cardView = (CardView) findViewById(R.id.cardView);
//
//        cardView.setRadius(8);//设置图片圆角的半径大小
//
//        cardView.setCardElevation(8);//设置阴影部分大小
//
//        cardView.setContentPadding(5, 5, 5, 5);//设置图片距离阴影大小

        ImageButton buttonend=findViewById(R.id.imageButton_end);
        buttonend.setOnClickListener(new BtnClickListener());



}
    class BtnClickListener implements View.OnClickListener{
        public void onClick(View v){
            Intent intent=new Intent(WorkOutActivity.this,FunctionActivity.class);
            startActivity(intent);
        }
    }
}