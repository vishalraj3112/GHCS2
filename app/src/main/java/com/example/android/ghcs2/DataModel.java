package com.example.android.ghcs2;

/**
 * Created by VIshal on 11-09-2017.
 */

public class DataModel {
    private     String date;
    private     String des;
    private Integer imageId;

    public DataModel(String date,String des,Integer imageId){
        this.date=date;
        this.des=des;
        this.imageId=imageId;
    }

    public String getDate(){
        return date;
    }
    public void setDate(){
        this.date=date;
    }
    public String getDes(){
        return des;
    }
    public void setDes(){this.des=des;}

    public Integer getImageId(){
        return imageId;
    }
    public void setImageId(){this.imageId=imageId;
    }
}
