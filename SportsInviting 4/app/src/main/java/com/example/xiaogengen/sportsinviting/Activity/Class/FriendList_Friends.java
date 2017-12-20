package com.example.xiaogengen.sportsinviting.Activity.Class;

/**
 * Created by xiaogengen on 2017/11/23.
 */

public class FriendList_Friends {
    private String name;
    private int headimageId;
    public FriendList_Friends(String name, int headimageId){
        this.name=name;
        this.headimageId=headimageId;
    }

    public String getName(){
        return name;
    }
    public int getImageId(){
        return headimageId;
    }
}
