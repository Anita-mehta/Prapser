package com.prapser.prapser.home.doctor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;
import com.prapser.prapser.home.doctor.doc_adapter.DoctorOnlineAdapter;

public class DoctorOnlineConsultFragment extends Fragment {

    private View view;
    private DoctorOnlineAdapter onlineAdapter;
    private RecyclerView onlineConsult_rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_doctor_online_consult, container, false);
        findId();
        setOnlineAdapter();
        return view;
    }

    private void findId() {
        onlineConsult_rv=view.findViewById(R.id.onlineConsult_rv);

    }

    public void setOnlineAdapter(){
        onlineAdapter=new DoctorOnlineAdapter(getContext(), new DoctorOnlineAdapter.Select() {
            @Override
            public void onclick(int position) {
                Navigation.findNavController(view).navigate(R.id.consultProfileFragment);
            }
        });

        onlineConsult_rv.setAdapter(onlineAdapter);
    }
}