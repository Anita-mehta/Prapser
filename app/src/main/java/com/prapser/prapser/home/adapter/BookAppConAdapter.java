package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class BookAppConAdapter extends RecyclerView.Adapter<BookAppConAdapter.MyBookViewClass> {
    private Context context;
    private Select select;
    private int checkedPosition = -1;


    public BookAppConAdapter(Context context,Select select) {
        this.context = context;
        this.select=select;
    }

    public interface Select{
        void onclick(int position);
    }

    @NonNull
    @Override
    public MyBookViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.time_list,parent,false);
        return new MyBookViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBookViewClass holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select.onclick(position);
                notifyDataSetChanged();
                checkedPosition=position;

            }
        });

        if (checkedPosition==position) {
            holder.time_rl.setBackgroundResource(R.drawable.green_circle);
            holder.cat_text_tv.setTextColor(ContextCompat.getColor(context,R.color.white));
            holder.time_tv.setTextColor(ContextCompat.getColor(context,R.color.white));



        }
        else {
            holder.time_rl.setBackgroundResource(R.drawable.circle_layout_bg);
            holder.cat_text_tv.setTextColor(ContextCompat.getColor(context,R.color.appcolor));
            holder.time_tv.setTextColor(ContextCompat.getColor(context,R.color.appcolor));


        }

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyBookViewClass extends RecyclerView.ViewHolder {
        private RelativeLayout time_rl;
        private TextView cat_text_tv,time_tv;
        public MyBookViewClass(@NonNull View itemView) {
            super(itemView);
            time_tv=itemView.findViewById(R.id.time_tv);
            cat_text_tv=itemView.findViewById(R.id.cat_text_tv);
            time_rl=itemView.findViewById(R.id.time_rl);
        }
    }
}
