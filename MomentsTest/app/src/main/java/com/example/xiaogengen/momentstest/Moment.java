package com.example.xiaogengen.momentstest;

/**
 * Created by xiaogengen on 2017/12/18.
 */

public class Moment {

    private String Name;
    private int Moment_Image_Id;
    private int Head_Image_Id;
    private String MomentContent;

    public Moment(String name,int head_image_id,int moment_image_id,String momentContent){

        Name=name;
        Moment_Image_Id=moment_image_id;
        Head_Image_Id=head_image_id;
        MomentContent=momentContent;

    }
    public String getName(){
        return Name;
    }
    public String getMomentContent(){
        return MomentContent;
    }
    public int getMoment_Image_Id(){
        return Moment_Image_Id;
    }
    public int getHead_Image_Id(){
        return  Head_Image_Id;
    }
}
