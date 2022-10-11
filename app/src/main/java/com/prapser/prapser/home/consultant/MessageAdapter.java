package com.prapser.prapser.home.consultant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyMessageViewClass> {

    private Context context;

    public MessageAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MessageAdapter.MyMessageViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.message_list,parent,false);
        return new MyMessageViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.MyMessageViewClass holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyMessageViewClass extends RecyclerView.ViewHolder {
        public MyMessageViewClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
