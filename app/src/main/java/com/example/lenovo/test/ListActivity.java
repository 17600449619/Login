package com.example.lenovo.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/3/7.
 */

public class ListActivity extends Activity {

    ArrayList<String> list=new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
       ListView listView=(ListView) findViewById(R.id.list);
        initData();
        listView.setAdapter(new listAdapter(list,this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),i+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void initData(){

        list.add("dasdada");
        list.add("看到积极");
        list.add("4d4a5");
        list.add("发案件覅及");
        list.add("大爱i");
        list.add("看到积极");
        list.add("4d4a5");
        list.add("呼吁 ");
        list.add("大爱i");
        list.add("一个一个一个");
        list.add("戹呼呼呼呼 ");
        list.add("i关于工业化");
        list.add("呼呼戹");

        
    }
}
