package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.xiaogengen.sportsinviting.Activity.Adapter.InviteHistoryAdapter;
import com.example.xiaogengen.sportsinviting.Activity.Class.InviteHistoryFriends;
import com.example.xiaogengen.sportsinviting.R;

import java.util.ArrayList;
import java.util.List;

public class InviteHistoryActivity extends AppCompatActivity {

    private List<InviteHistoryFriends> friendList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_history);
        initFriends();
        InviteHistoryAdapter adapter = new InviteHistoryAdapter(InviteHistoryActivity.this,R.layout.invite_history_item,friendList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFriends() {

        InviteHistoryFriends friendA =new InviteHistoryFriends("friendA", R.drawable.friend_a);
        friendList.add(friendA);
        InviteHistoryFriends friendB =new InviteHistoryFriends("friendB", R.drawable.friend_b);
        friendList.add(friendB);
        InviteHistoryFriends friendC =new InviteHistoryFriends("friendC", R.drawable.friend_c);
        friendList.add(friendC);


    }
}
