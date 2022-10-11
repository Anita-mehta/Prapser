package com.prapser.prapser.home.setting;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.prapser.prapser.R;
import com.prapser.prapser.home.setting.adapter.FriendContactAdapter;

public class ReferFriendFragment extends Fragment implements View.OnClickListener {

     private View view;
     private RecyclerView contact_rv;
     private FriendContactAdapter contactAdapter;
     private ImageView back_arrow;
    private BottomNavigationView bottom_navigation1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_refer_friend, container, false);

        findId(view);
        setContactAdapter();
        return view;
    }

    private void findId(View view) {
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        contact_rv=view.findViewById(R.id.contact_rv);
        bottom_navigation1=getActivity().findViewById(R.id.bottom_navigation1);
        bottom_navigation1.setVisibility(View.GONE);

    }

    private void setContactAdapter(){

        contactAdapter=new FriendContactAdapter(getActivity());
        contact_rv.setAdapter(contactAdapter);
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