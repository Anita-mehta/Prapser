package com.prapser.prapser.home.setting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class WalletAdapter extends RecyclerView.Adapter<WalletAdapter.MyWallViewClass> {
    private Context context;

    public WalletAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyWallViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.wallet_list_item,parent,false);
        return new MyWallViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyWallViewClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyWallViewClass extends RecyclerView.ViewHolder {
        public MyWallViewClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
