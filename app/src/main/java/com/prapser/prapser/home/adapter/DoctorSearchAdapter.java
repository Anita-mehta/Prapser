package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class DoctorSearchAdapter extends RecyclerView.Adapter<DoctorSearchAdapter.MydocSearchViewClass> {
    private Context context;
    private Select select;

    public DoctorSearchAdapter(Context context,Select select) {
        this.context = context;
        this.select=select;
    }
    public interface Select{
        void onClick(int position);
    }


    @NonNull
    @Override
    public MydocSearchViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.specialist_list_item,parent,false);
        return new MydocSearchViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MydocSearchViewClass holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                select.onClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MydocSearchViewClass extends RecyclerView.ViewHolder {
        public MydocSearchViewClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
