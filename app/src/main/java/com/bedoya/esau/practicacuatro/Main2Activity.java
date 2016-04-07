package com.bedoya.esau.practicacuatro;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        FlashFragment fragment=new FlashFragment();
        //ft.add(android.R.id.content,fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        if(id==R.id.mbatmat){
            BatmanFragment fragment=new BatmanFragment();
            //ft.replace(android.R.id.content,fragment).commit();
        }
        if(id==R.id.mflash){
            FlashFragment fragment=new FlashFragment();
           // ft.replace(android.R.id.content,fragment).commit();
        }
        if(id==R.id.msuper){
            SuperFragment fragment=new SuperFragment();
           // ft.replace(android.R.id.content,fragment).commit();
        }

        return super.onOptionsItemSelected(item);
    }
}
