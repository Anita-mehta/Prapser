package com.prapser.prapser.home.doctor.doc_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class DoctorOfficeAdapter extends RecyclerView.Adapter<DoctorOfficeAdapter.MyDocOffAdapter> {

    private Context context;
    private Select select;

    public DoctorOfficeAdapter(Context context,Select select){
        this.context=context;
        this.select=select;
    }
    public interface Select{
       void onClick(int position);
       void onMoreClick(int position);
    }
    @NonNull
    @Override
    public MyDocOffAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.doctor_office_cons,parent,false);

        return new MyDocOffAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyDocOffAdapter holder, int position) {
        holder.bokk_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                select.onClick(position);
                
            }
        });

        holder.more_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.onMoreClick(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyDocOffAdapter extends RecyclerView.ViewHolder {
        private TextView bokk_tv1,more_tv;
        public MyDocOffAdapter(@NonNull View itemView) {
            super(itemView);

            more_tv=itemView.findViewById(R.id.more_tv);
            bokk_tv1=itemView.findViewById(R.id.bokk_tv1);
        }
    }
}
