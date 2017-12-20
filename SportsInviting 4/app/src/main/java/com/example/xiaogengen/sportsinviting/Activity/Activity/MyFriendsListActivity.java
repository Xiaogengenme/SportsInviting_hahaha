package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;


import com.example.xiaogengen.sportsinviting.Activity.Adapter.FriendListAdapter;
import com.example.xiaogengen.sportsinviting.Activity.Class.FriendList_Friends;
import com.example.xiaogengen.sportsinviting.R;

import java.util.ArrayList;
import java.util.List;

public class MyFriendsListActivity extends AppCompatActivity {

    private List<FriendList_Friends> friendList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_friends_list);
        initFriendList();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FriendListAdapter adapter=new FriendListAdapter(friendList);
        recyclerView.setAdapter(adapter);


//        recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent=new Intent(MyFriendsListActivity.this,ChooseFriendsToInviteActivity.class);
//                startActivity(intent);
//            }
//        });
    }


    private void initFriendList(){
        for(int i=0;i<3;i++){
            FriendList_Friends Tom=new FriendList_Friends("Tom",R.drawable.friend_a);
            friendList.add(Tom);
            FriendList_Friends Buck=new FriendList_Friends("Buck",R.drawable.friend_b);
            friendList.add(Buck);
            FriendList_Friends Harry=new FriendList_Friends("Harry",R.drawable.friend_c);
            friendList.add(Harry);
        }
    }
}
