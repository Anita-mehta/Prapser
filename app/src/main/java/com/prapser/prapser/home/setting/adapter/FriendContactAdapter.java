package com.prapser.prapser.home.setting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class FriendContactAdapter extends RecyclerView.Adapter<FriendContactAdapter.MyContactViewClass> {

    private Context context;


    public FriendContactAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyContactViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contatc_list,parent,false);
        return new MyContactViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyContactViewClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyContactViewClass extends RecyclerView.ViewHolder {
        public MyContactViewClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
