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


public class NotairsFragment extends Fragment {

    private View view;
    private RecyclerView plumber_rv;
    private OfflineConsultAdapter offlineConsultAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_notairs, container, false);
         findID();
         setAdapter();
        return view;
    }

    private void findID() {
        plumber_rv=view.findViewById(R.id.plumber_rv);

    }
    private void setAdapter(){
        offlineConsultAdapter=new OfflineConsultAdapter(getActivity(), new OfflineConsultAdapter.Select() {
            @Override
            public void onClick(int position) {
                Navigation.findNavController(view).navigate(R.id.plumberProfileFragment);

                //   openDilaog();
            }
        });
        plumber_rv.setAdapter(offlineConsultAdapter);
    }

}