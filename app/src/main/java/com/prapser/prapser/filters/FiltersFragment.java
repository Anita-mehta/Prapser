package com.prapser.prapser.filters;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.prapser.prapser.R;

public class FiltersFragment extends Fragment implements View.OnClickListener {

    private View view;
    private ImageView back_arrow;
    private AppCompatButton apply_btn,cancel_btn;



    public FiltersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_filters, container, false);
        findId();
        return view;    
    }

    private void findId() {

        cancel_btn=view.findViewById(R.id.cancel_btn);
        cancel_btn.setOnClickListener(this);
        apply_btn=view.findViewById(R.id.apply_btn);
        apply_btn.setOnClickListener(this);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.apply_btn:
                getActivity().onBackPressed();
                break;

            case R.id.cancel_btn:
                getActivity().onBackPressed();
                break;
        }
    }
}