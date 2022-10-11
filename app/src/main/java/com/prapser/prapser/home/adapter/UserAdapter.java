package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyuserViewClass> {

    private Context context;

    public UserAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyuserViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list_item,parent,false);
        return new MyuserViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyuserViewClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyuserViewClass extends RecyclerView.ViewHolder {
        public MyuserViewClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
