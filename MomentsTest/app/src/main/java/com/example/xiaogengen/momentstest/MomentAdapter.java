package com.example.xiaogengen.momentstest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xiaogengen on 2017/12/18.
 */

public class MomentAdapter extends RecyclerView.Adapter<MomentAdapter.ViewHolder> {

    private List<Moment> mMoments;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView HeadImage;
        ImageView MomentImage;
        TextView Name;
        TextView MomentContent;

        public ViewHolder(View view){
            super(view);
            HeadImage=(ImageView)view.findViewById(R.id.friend_head_image);
            MomentImage=(ImageView)view.findViewById(R.id.friend_moment_image);
            Name=(TextView)view.findViewById(R.id.friend_name);
            MomentContent=(TextView)view.findViewById(R.id.friend_moment_content);

        }

    }
    public MomentAdapter(List<Moment> momentList){
        mMoments=momentList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.moment_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        Moment moment =mMoments.get(position);
        holder.HeadImage.setImageResource(moment.getHead_Image_Id());
        holder.MomentImage.setImageResource(moment.getMoment_Image_Id());
        holder.MomentContent.setText(moment.getMomentContent());
        holder.Name.setText(moment.getName());
    }

@Override
    public int getItemCount(){
        return mMoments.size();
}



}
