package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class OnlineConsultAdapter extends RecyclerView.Adapter<OnlineConsultAdapter.MyOnlineViewClass> {
    private Context context;
    private Select select;

    public OnlineConsultAdapter(Context context,Select select) {
        this.context = context;
        this.select=select;
    }
    public interface  Select{
        void onClick(int position);
    }

    @NonNull
    @Override
    public MyOnlineViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.online_list_item,parent,false);
        return new MyOnlineViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOnlineViewClass holder, int position) {
        holder.consult_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select.onClick(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyOnlineViewClass extends RecyclerView.ViewHolder {
        private TextView consult_tv;
        public MyOnlineViewClass(@NonNull View itemView) {
            super(itemView);
            consult_tv=itemView.findViewById(R.id.consult_tv);
        }
    }
}
