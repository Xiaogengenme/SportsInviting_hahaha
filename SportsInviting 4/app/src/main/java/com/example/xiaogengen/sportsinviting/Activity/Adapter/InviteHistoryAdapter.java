package com.example.xiaogengen.sportsinviting.Activity.Adapter;

/**
 * Created by xiaogengen on 2017/12/7.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xiaogengen.sportsinviting.Activity.Class.InviteHistoryFriends;
import com.example.xiaogengen.sportsinviting.R;

import java.util.List;

/**
 * Created by john on 2017/11/24.
 */

public class InviteHistoryAdapter extends ArrayAdapter<InviteHistoryFriends> {
    private int resourceId;
    public InviteHistoryAdapter(Context context, int textViewResouceId, List<InviteHistoryFriends> objects){
        super(context,textViewResouceId,objects);
        resourceId=textViewResouceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        InviteHistoryFriends friend=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView friendImage=(ImageView) view.findViewById(R.id.friend_image);
        TextView friendName=(TextView) view.findViewById(R.id.friend_name);
        Button button=(Button) view.findViewById(R.id.button) ;
         //TextView friendMessage=(TextView) view.findViewById(R.id.friend_message);
        friendImage.setImageResource(friend.getImageId());
        friendName.setText(friend.getName());

        //friendMessage.setText(friend.getMessage());


        return view;
    }
}
