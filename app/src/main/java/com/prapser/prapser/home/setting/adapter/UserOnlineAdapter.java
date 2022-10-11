package com.prapser.prapser.home.setting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class UserOnlineAdapter extends RecyclerView.Adapter<UserOnlineAdapter.MyOnlineUserViewClass> {

private Context context;

    public UserOnlineAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyOnlineUserViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.online_user_list,parent,false);
        return new MyOnlineUserViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOnlineUserViewClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyOnlineUserViewClass extends RecyclerView.ViewHolder {
        public MyOnlineUserViewClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
