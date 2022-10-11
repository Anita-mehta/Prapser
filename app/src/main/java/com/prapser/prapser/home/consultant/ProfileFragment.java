package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.prapser.prapser.R;


public class ProfileFragment extends Fragment implements View.OnClickListener {

    private View view;
    private ImageView back_arrow;
    private BottomNavigationView bottom_navigation1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_profile, container, false);
        findId();

        return view;
    }

    private void findId() {

        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);

        bottom_navigation1=getActivity().findViewById(R.id.bottom_navigation1);
        bottom_navigation1.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;
        }
    }
}