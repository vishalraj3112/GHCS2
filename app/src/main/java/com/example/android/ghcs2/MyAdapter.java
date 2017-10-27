package com.example.android.ghcs2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.name;

/**
 * Created by VIshal on 11-09-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContext;
    private List<DataModel> dataModel;



    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView date;
        public TextView des;
        public ImageView imageView;
        public View layout;

        public ViewHolder(View v){
            super(v);
            layout=v;
            date=(TextView) v.findViewById(R.id.firstline);
            des=(TextView) v.findViewById(R.id.secondLine);
            imageView=(ImageView) v.findViewById(R.id.icon);
        }
    }



    public MyAdapter(Context mContext,List<DataModel> dataModel){
        this.mContext=mContext;
        this.dataModel=dataModel;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());

        View v=inflater.inflate(R.layout.noticeactivity_list,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder,final int position) {
        DataModel data=dataModel.get(position);
        holder.date.setText(data.getDate());
        holder.des.setText(data.getDes());
        holder.imageView.setImageResource(data.getImageId());
    }


    @Override
    public int getItemCount() {
        return dataModel.size();
    }
}