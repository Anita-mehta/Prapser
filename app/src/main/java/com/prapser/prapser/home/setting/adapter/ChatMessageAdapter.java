package com.prapser.prapser.home.setting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class ChatMessageAdapter extends RecyclerView.Adapter<ChatMessageAdapter.MyChatViewClass> {

    private Context context;
    private Select select;

    public ChatMessageAdapter(Context context, Select select) {
        this.context = context;
        this.select = select;
    }

    public interface Select{
       void onClick(int position);
    }

    @NonNull
    @Override
    public MyChatViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_message_list,parent,false);
        return new MyChatViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyChatViewClass holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
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

    public class MyChatViewClass extends RecyclerView.ViewHolder {
        public MyChatViewClass(@NonNull View itemView) {
            super(itemView);
        }
    }
}
