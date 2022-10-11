package com.prapser.prapser.home.aapointment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.UpcomingAdapter;


public class UpcomingFragment extends Fragment {

   private View view;
   private RecyclerView upcoming_rv;
   private UpcomingAdapter upcomingAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_upcoming, container, false);
         findID();
         setAdapter();
        return view;
    }

    private void findID() {
        upcoming_rv=view.findViewById(R.id.upcoming_rv);

    }

    private void setAdapter(){

        upcomingAdapter=new UpcomingAdapter(getActivity(), new UpcomingAdapter.Select() {
            @Override
            public void onCancelBtn(int position) {

            }
        });
        upcoming_rv.setAdapter(upcomingAdapter);

    }
}