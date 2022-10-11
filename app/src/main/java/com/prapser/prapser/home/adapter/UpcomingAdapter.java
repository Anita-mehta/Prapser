package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;

import com.prapser.prapser.R;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.MyUpcomingClass> {
    private Context context;
    private Select select;

    public  UpcomingAdapter(Context context,Select select){
        this.context=context;
        this.select=select;

    }

    public interface Select{

      void   onCancelBtn(int position);
    }
    @NonNull
    @Override
    public MyUpcomingClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_list,parent,false);
        return new MyUpcomingClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyUpcomingClass holder, int position) {

        holder.option_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                PopupMenu popupMenu = new PopupMenu(v.getContext(), v);
                popupMenu.inflate(R.menu.book_appointment_popup);
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.cancel_btn:

                                select.onCancelBtn(position);

                                // Toast.makeText(context, "Report Successfully", Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return false;
                        }
                    }
                });

            }
        });

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class MyUpcomingClass extends RecyclerView.ViewHolder {
        private RelativeLayout option_popup;
        public MyUpcomingClass(@NonNull View itemView) {
            super(itemView);

            option_popup=itemView.findViewById(R.id.option_popup);
        }
    }
}
