package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.prapser.prapser.R;

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.MyCatviewClass> {
    private Context context;
    private int[] catImage;
    private String[] catName;
    private Select select;

    public CategoryListAdapter(Context context,  int[] catImage, String[] catName,Select select) {

        this.context = context;
        this.catImage=catImage;
        this.catName=catName;
        this.select=select;
    }

    public interface Select{
        void onClick(int position);
        void onLawyerClick(int position);
        void onAccountant(int position);
        void onElectrician(int position);
        void onMechanics(int position);
        void onPlumber(int position);
        void onTeacher(int position);
        void onCarWash(int position);
        void onPsyclogist(int position);
        void onArchitecture(int position);
        void onNotrais(int position);
        void onSalon(int position);
        void onPhysician(int position);
        void onDoctor(int position);
        void onLab(int position);
    }

    @NonNull
    @Override
    public MyCatviewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.cat_list_item,parent,false);
        return new MyCatviewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCatviewClass holder, int position) {
        Glide.with(context).load(catImage[position]).placeholder(R.drawable.doctor).into(holder.cat_img);
        holder.cat_name_tv.setText(catName[position]);

        if (position==1){

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    select.onLawyerClick(position);
                }
            });
        }
           if (position==8){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       select.onClick(position);
                   }
               });

           }

           if (position==2){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onAccountant(position);
                   }
               });
           }

           if (position==13){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onElectrician(position);
                   }
               });
           }

           if (position==11){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onMechanics(position);
                   }
               });
           }

           if (position==12){
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        select.onPlumber(position);
                    }
                });
           }
           if (position==4){

               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onTeacher(position);
                   }
               });
           }
           if (position==10){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onCarWash(position);
                   }
               });
           }

           if (position==3){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                       select.onPsyclogist(position);
                   }
               });
           }
           if (position==5){
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        select.onArchitecture(position);
                    }
                });
           }
           if (position==6){

               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onNotrais(position);
                   }
               });
           }
           if (position==9){

               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onSalon(position);
                   }
               });
           }
           if (position==14){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       select.onPhysician(position);
                   }
               });
           }

           if (position==0){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                       select.onDoctor(position);
                   }
               });
           }
           if (position==7){
               holder.itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                       select.onLab(position);
                   }
               });
           }
    }

    @Override
    public int getItemCount() {
        return catImage.length;
    }

    public class MyCatviewClass extends RecyclerView.ViewHolder {
        private ImageView cat_img;
        private TextView cat_name_tv;
        public MyCatviewClass(@NonNull View itemView) {
            super(itemView);

            cat_name_tv=itemView.findViewById(R.id.cat_name_tv);
            cat_img=itemView.findViewById(R.id.cat_img);
        }
    }
}
