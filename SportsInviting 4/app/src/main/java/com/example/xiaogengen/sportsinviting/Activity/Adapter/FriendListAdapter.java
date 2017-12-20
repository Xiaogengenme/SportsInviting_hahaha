package com.example.xiaogengen.sportsinviting.Activity.Adapter;

/**
 * Created by xiaogengen on 2017/12/7.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xiaogengen.sportsinviting.Activity.Class.FriendList_Friends;
import com.example.xiaogengen.sportsinviting.R;

import java.util.List;

/**
 * Created by john on 2017/11/24.
 */

public class FriendListAdapter extends RecyclerView.Adapter<FriendListAdapter.ViewHolder> {
    private List<FriendList_Friends> mFriendList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView friendHeadImage;
        TextView friendName;

        public ViewHolder(View view) {
            super(view);
            friendHeadImage = (ImageView) view.findViewById(R.id.friend_image);
            friendName = (TextView) view.findViewById(R.id.friend_name);
        }
    }

    public FriendListAdapter(List<FriendList_Friends> friendList) {
        mFriendList = friendList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.friend_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        FriendList_Friends friend=mFriendList.get(position);
        holder.friendHeadImage.setImageResource(friend.getImageId());
        holder.friendName.setText(friend.getName());
    }
    @Override
    public int getItemCount(){
        return mFriendList.size();
    }
}