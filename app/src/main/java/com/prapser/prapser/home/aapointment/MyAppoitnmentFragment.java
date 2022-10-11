package com.prapser.prapser.home.aapointment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prapser.prapser.R;

public class MyAppoitnmentFragment extends Fragment implements View.OnClickListener {

    private View view;
    private TextView upcoming_tv,past_tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_my_appoitnment, container, false);
        findID();

        loadFragment(new UpcomingFragment());
        return view;
    }

    private void findID() {

        past_tv=view.findViewById(R.id.past_tv);
        past_tv.setOnClickListener(this);
        upcoming_tv=view.findViewById(R.id.upcoming_tv);
        upcoming_tv.setOnClickListener(this);
    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.past_tv:
                past_tv.setBackground(getResources().getDrawable(R.drawable.right_round_green_corner));
                past_tv.setTextColor(getResources().getColor(R.color.white));
                upcoming_tv.setBackground(getResources().getDrawable(R.drawable.white_bg_left));
                upcoming_tv.setTextColor(getResources().getColor(R.color.black));
                loadFragment(new PastFragment());

                break;

            case R.id.upcoming_tv:

                upcoming_tv.setBackground(getResources().getDrawable(R.drawable.round_green_corner));
                upcoming_tv.setTextColor(getResources().getColor(R.color.white));
                past_tv.setBackground(getResources().getDrawable(R.drawable.white_bg));
                past_tv.setTextColor(getResources().getColor(R.color.black));
                loadFragment(new UpcomingFragment());

                break;
        }


    }
}