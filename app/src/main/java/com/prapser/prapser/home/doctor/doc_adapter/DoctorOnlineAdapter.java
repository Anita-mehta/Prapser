package com.prapser.prapser.home.doctor.doc_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class DoctorOnlineAdapter  extends RecyclerView.Adapter<DoctorOnlineAdapter.MyDocOnlineClass> {

    private Context context;
    private Select select;

    public DoctorOnlineAdapter(Context context,Select select){
        this.context=context;
        this.select=select;
    }

    public interface Select{
        void onclick(int position);

    }

    @NonNull
    @Override
    public MyDocOnlineClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.doct_online_consult_layout,parent,false);
        return new MyDocOnlineClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyDocOnlineClass holder, int position) {
        holder.consult_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                select.onclick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyDocOnlineClass extends RecyclerView.ViewHolder {
        private TextView consult_tv;
        public MyDocOnlineClass(@NonNull View itemView) {

            super(itemView);

            consult_tv=itemView.findViewById(R.id.consult_tv);
        }
    }
}
