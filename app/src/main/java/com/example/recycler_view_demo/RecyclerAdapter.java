package com.example.recycler_view_demo;

import android.app.Activity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Activity context;
    List<Data> list;


   public RecyclerAdapter(Activity context, List<Data> list){
        this.context=context;
        this.list=list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v=context.getLayoutInflater().inflate(R.layout.foodi,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Data data=list.get(position);
       holder.img.setImageDrawable(context.getDrawable(data.getImg()));
       holder.t1.setText(data.getName());
       holder.t2.setText(data.getPrice());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView t1,t2;
       ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            img=itemView.findViewById(R.id.imageView2);


        }
    }
}
