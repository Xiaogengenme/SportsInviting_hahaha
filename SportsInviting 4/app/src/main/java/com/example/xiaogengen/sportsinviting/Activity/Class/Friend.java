package com.example.xiaogengen.sportsinviting.Activity.Class;

/**
 * Created by xiaogengen on 2017/12/7.
 */


/**
 * Created by john on 2017/11/24.
 */

public class Friend {
    private String name;
    private int imageId;
    private String message;

    public Friend(String name,int imageId,String message){
        this.name=name;
        this.imageId=imageId;
        this.message=message;
    }
    public String getName(){
        return name;
    }
    public String getMessage(){
        return message;
    }
    public int getImageId() {
        return imageId;
    }
}
