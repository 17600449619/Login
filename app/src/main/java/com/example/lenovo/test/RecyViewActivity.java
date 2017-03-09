package com.example.lenovo.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/3/8.
 */

public class RecyViewActivity extends Activity {
    ArrayList<String> mDatas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recy);
        initData();
        RecyclerView recy=(RecyclerView) findViewById(R.id.recy_view);
        RecyAdapter recyAdapter=new RecyAdapter(this,mDatas);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
                     //设置布局管理器
        recy.setLayoutManager(layoutManager);
                    //设置为垂直布局，这也是默认的
                   layoutManager.setOrientation(OrientationHelper.VERTICAL);
                     //设置Adapter
        recy.setAdapter(recyAdapter);
                     //设置增加或删除条目的动画
        recy.setItemAnimator(new DefaultItemAnimator());

    }
    private void initData() {
                 mDatas = new ArrayList<String>();
                for ( int i=0; i < 40; i++) {
                       mDatas.add( "item"+i);
                }
         }

}
