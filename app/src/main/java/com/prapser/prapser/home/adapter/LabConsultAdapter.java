package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class LabConsultAdapter extends RecyclerView.Adapter<LabConsultAdapter.MyLabViewClass> {

    private Context context;
    private Select select;

    public LabConsultAdapter(Context context, Select select) {
        this.context = context;
        this.select = select;
    }

    public interface  Select{
        void onClick(int position);
    }
    @NonNull
    @Override
    public MyLabViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lab_office_con,parent,false);
        return new MyLabViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyLabViewClass holder, int position) {

        holder.bokk_tv1.setOnClickListener(new View.OnClickListener() {
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

    public class MyLabViewClass extends RecyclerView.ViewHolder {
        private TextView bokk_tv1;
        public MyLabViewClass(@NonNull View itemView) {
            super(itemView);

            bokk_tv1=itemView.findViewById(R.id.bokk_tv1);
        }
    }
}
