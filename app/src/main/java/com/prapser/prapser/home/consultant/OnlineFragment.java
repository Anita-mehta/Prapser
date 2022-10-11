package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.OfflineConsultAdapter;
import com.prapser.prapser.home.adapter.OnlineConsultAdapter;

public class OnlineFragment extends Fragment {

    private View view;
    private RecyclerView onlineConsult_rv;
    private OnlineConsultAdapter onlineConsultAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_online, container, false);
        findID();
        setAdapter();
        return view;
    }

    private void findID() {
        onlineConsult_rv=view.findViewById(R.id.onlineConsult_rv);

    }
    private void setAdapter(){
        onlineConsultAdapter=new OnlineConsultAdapter(getActivity(), new OnlineConsultAdapter.Select() {
            @Override
            public void onClick(int position) {

                Navigation.findNavController(view).navigate(R.id.consultProfileFragment);
            }
        });
        onlineConsult_rv.setAdapter(onlineConsultAdapter);
    }

}