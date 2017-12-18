package com.example.xiaogengen.sportsinviting.Activity.Adapter;

/**
 * Created by xiaogengen on 2017/12/7.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xiaogengen.sportsinviting.Activity.Class.Friend;
import com.example.xiaogengen.sportsinviting.R;

import java.util.List;

/**
 * Created by john on 2017/11/24.
 */

public class FriendAdapter extends ArrayAdapter<Friend> {
    private int resourceId;
    public FriendAdapter(Context context, int textViewResouceId, List<Friend> objects){
        super(context,textViewResouceId,objects);
        resourceId=textViewResouceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Friend friend=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView friendImage=(ImageView) view.findViewById(R.id.friend_image);
        TextView friendName=(TextView) view.findViewById(R.id.friend_name);
        TextView friendMessage=(TextView) view.findViewById(R.id.friend_message);
        friendImage.setImageResource(friend.getImageId());
        friendName.setText(friend.getName());
        friendMessage.setText(friend.getMessage());
        return view;
    }

}
