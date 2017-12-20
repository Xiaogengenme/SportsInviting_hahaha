package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.xiaogengen.sportsinviting.Activity.Adapter.MomentAdapter;
import com.example.xiaogengen.sportsinviting.Activity.Class.Moment;
import com.example.xiaogengen.sportsinviting.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Moment> moments=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMoments();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MomentAdapter adapter =new MomentAdapter(moments);
        recyclerView.setAdapter(adapter);
    }

    private void initMoments(){
        Moment Tom=new Moment("Tom",R.drawable.head1,R.drawable.picture1,"dajidalicaonimabi");
        moments.add(Tom);
        Moment Jerry=new Moment("Jerry",R.drawable.head2,R.drawable.picture2,"dajidalicaonimabi");
        moments.add(Jerry);
        Moment Kanye=new Moment("Kanye",R.drawable.head3,R.drawable.picture3,"dajidalicaonimabi");
        moments.add(Kanye);
        Moment Jordan=new Moment("Jordan",R.drawable.head4,R.drawable.picture4,"dajidalicaonimabi");
        moments.add(Jordan);
    }

}