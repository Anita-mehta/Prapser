package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class OfflineConsultAdapter extends RecyclerView.Adapter<OfflineConsultAdapter.MyOffConsClass> {

    private Context context;
    private Select select;

    public OfflineConsultAdapter(Context context,Select select) {
        this.context = context;
        this.select=select;
    }
    public interface Select{
        void onClick(int position);
    }

    @NonNull
    @Override
    public MyOffConsClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.offline_list_item,parent,false);
        return new MyOffConsClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOffConsClass holder, int position) {

        holder.bokk_tv.setOnClickListener(new View.OnClickListener() {
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

    public class MyOffConsClass extends RecyclerView.ViewHolder {
        private TextView bokk_tv;
        public MyOffConsClass(@NonNull View itemView) {
            super(itemView);
            bokk_tv=itemView.findViewById(R.id.bokk_tv);


        }
    }


}
