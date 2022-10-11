package com.prapser.prapser.home.setting.report;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.prapser.prapser.R;


public class AddReportFragment extends Fragment implements View.OnClickListener {

    private View view;
    private ImageView back_arrow;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_add_report, container, false);

        finddId();
        return view;
    }

    private void finddId() {

        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);


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