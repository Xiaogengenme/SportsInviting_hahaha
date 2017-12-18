package com.example.xiaogengen.sportsinviting.Activity.Class;

/**
 * Created by xiaogengen on 2017/12/7.
 */

public class Msg {
    public static final int TYPE_RECIVED=0;
    public  static final int TYPE_SENT=1;
    private String content;
    private int type;
    public Msg(String content, int type){
        this.content=content;
        this.type=type;
    }

    public String getContent(){
        return content;
    }

    public int getType(){
        return type;
    }
}

