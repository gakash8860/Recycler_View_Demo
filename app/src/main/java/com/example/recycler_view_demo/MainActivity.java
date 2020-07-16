package com.example.recycler_view_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    int img[]={R.drawable.aloghobhi,R.drawable.bhindi,R.drawable.brinjal,R.drawable.chili_con_carnejpg,R.drawable.burger,R.drawable.dahi,R.drawable.ifood};
    String price[]={"50rs","54","56","74","89","78","98"};
    String name[]={"Aalo Ghobhi","Bhindi","Brinjal","Chilli con carne","Burger","Dahi Bhalle"," Italian"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rcv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter=new RecyclerAdapter(this,getList());
        rv.setAdapter(adapter);
    }

    public List<Data> getList(){
        List<Data> list =new ArrayList<>();
        for(int i=0;i<price.length;i++){

            Data data=new Data();
            data.setName(name[i]);
            data.setPrice(price[i]);
            data.setImg(img[i]);
            list.add(data);


        }
        return list;


    }
}