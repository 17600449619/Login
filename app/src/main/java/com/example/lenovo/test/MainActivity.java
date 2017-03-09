package com.example.lenovo.test;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    Button a;
    Button b;
    FragmentTransaction ft;
    AFragment aFragment;
    BFragment bFragment;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       a=(Button) findViewById(R.id.a);
        b=(Button) findViewById(R.id.b);
         fm=getFragmentManager();
         ft=fm.beginTransaction();

        aFragment=new AFragment();
         bFragment=new BFragment(this);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
    }
    public void onClick(View v){
        ft = fm.beginTransaction();
    switch (v.getId()){
        case R.id.a:
            ft.replace(R.id.fl,aFragment).commit();

            break;
        case R.id.b:
            ft.replace(R.id.fl,bFragment).commit();
            break;

    }


    }
}
