package com.example.xiaogengen.sportsinviting.Activity.Activity;
import com.example.xiaogengen.sportsinviting.R;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeActivity extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        Button sentInvatation = (Button) findViewById(R.id.sentInvatation);
        Button recivedInvatation = (Button) findViewById(R.id.recivedInvatation);
        sentInvatation.setOnClickListener(new BtnClickListener());
        recivedInvatation.setOnClickListener(new BtnClickListener());
    }
        class BtnClickListener implements View.OnClickListener {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.sentInvatation:
                        Intent intent1 = new Intent(MeActivity.this, InviteHistoryActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.recivedInvatation:
                        Intent intent2 = new Intent(MeActivity.this, ChatHistoryActivity.class);
                        startActivity(intent2);
                        break;

                }
            }

        }


}
