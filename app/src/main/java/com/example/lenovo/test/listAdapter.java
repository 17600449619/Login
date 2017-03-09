package com.example.lenovo.test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/3/7.
 */

public class listAdapter extends BaseAdapter {
    ArrayList list;
    Context context;
    public listAdapter(ArrayList list, Context context){

        this.list=list;
        this.context=context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        Holder holder;
        if (convertview==null){
        convertview=View.inflate(context,R.layout.list_item,null);
            holder=new Holder();
            holder.iv=(ImageView) convertview.findViewById(R.id.item_iv);
            holder.tv=(TextView) convertview.findViewById(R.id.item_tv);
            convertview.setTag(holder);
        }else{
           holder=(Holder)convertview.getTag();


        }
        holder.iv.setBackgroundResource(R.mipmap.ic_launcher);
        holder.tv.setText(list.get(i).toString());
        return convertview;
    }
    class  Holder{
    private ImageView iv;
        private TextView tv;

    }
}
