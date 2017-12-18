package com.example.xiaogengen.sportsinviting.Activity.Class;

/**
 * Created by xiaogengen on 2017/11/23.
 */

public class FriendList_Friends {
    private String name;
    private int imageId;
    public FriendList_Friends(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }

    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
