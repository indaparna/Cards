package com.example.aparna.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context mcontext;
    List<Item> mData;


    public Adapter(Context mcontext, List<Item> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View  v = inflater.inflate(R.layout.card_item,viewGroup,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int i) {

        holder.background_img.setImageResource(mData.get(i).getBackground());
        holder.profile_photo.setImageResource(mData.get(i).getProfilePhoto());
        holder.tv_title.setText(mData.get(i).getItemTitle());
        holder.tv_num.setText(mData.get(i).getNum()+"Number");


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView profile_photo, background_img;
        TextView tv_title, tv_num;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_photo = itemView.findViewById(R.id.profile_img);
            background_img= itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.card_title);
            tv_num = itemView.findViewById(R.id.num);


        }
    }
}
