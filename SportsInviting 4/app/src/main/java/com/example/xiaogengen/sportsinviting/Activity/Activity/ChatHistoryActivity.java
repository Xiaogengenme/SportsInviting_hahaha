package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.xiaogengen.sportsinviting.Activity.Adapter.FriendAdapter;
import com.example.xiaogengen.sportsinviting.Activity.Class.Friend;
import com.example.xiaogengen.sportsinviting.R;

import java.util.ArrayList;
import java.util.List;

public class ChatHistoryActivity extends Activity {
    private List<Friend> friendList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_history);
        initFriends();
        FriendAdapter adapter = new FriendAdapter(ChatHistoryActivity.this, R.layout.friend_item,friendList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFriends() {

        Friend friendA =new Friend("friendA", R.drawable.friend_a,"are u free tonight?");
        friendList.add(friendA);
        Friend friendB =new Friend("friendB", R.drawable.friend_b,"hello");
        friendList.add(friendB);
        Friend friendC =new Friend("friendC", R.drawable.friend_c,"2:00pm");
        friendList.add(friendC);


    }
}
