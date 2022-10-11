package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.OfflineConsultAdapter;


public class MechanicFragment extends Fragment implements View.OnClickListener {

      private View view;
    private RecyclerView offlineConsult_rv;
    private OfflineConsultAdapter offlineConsultAdapter;
    private TextView iv_filters_et;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_mechanic, container, false);
        findId();
        setAdapter();
        return view;
    }

    private void findId() {

        iv_filters_et=view.findViewById(R.id.iv_filters_et);
        iv_filters_et.setOnClickListener(this);
        offlineConsult_rv=view.findViewById(R.id.offlineConsult_rv);

    }

    private void setAdapter(){
        offlineConsultAdapter=new OfflineConsultAdapter(getActivity(), new OfflineConsultAdapter.Select() {
            @Override
            public void onClick(int position) {
                Navigation.findNavController(view).navigate(R.id.offlineConsultProfileFragment);

                //   openDilaog();
            }
        });
        offlineConsult_rv.setAdapter(offlineConsultAdapter);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.iv_filters_et:
                Navigation.findNavController(view).navigate(R.id.action_mechanicFragment_to_filtersFragment);

                break;
        }
    }
}