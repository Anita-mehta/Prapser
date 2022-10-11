package com.prapser.prapser;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.home.adapter.LabConsultAdapter;
import com.prapser.prapser.home.doctor.doc_adapter.DoctorOfficeAdapter;

public class LabConsultFragment extends Fragment {

    private View view;
    private LabConsultAdapter labConsultAdapter;
    private RecyclerView lab_con_rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_lab_consult, container, false);
        findId();
        setOfficeAdapter();
        return view;
    }

    private void findId() {
        lab_con_rv=view.findViewById(R.id.lab_con_rv);

    }

        private void setOfficeAdapter(){
            labConsultAdapter=new LabConsultAdapter(getActivity(), new LabConsultAdapter.Select() {
                @Override
                public void onClick(int position) {

                    Navigation.findNavController(view).navigate(R.id.offlineConsultProfileFragment);
                }
            });

            lab_con_rv.setAdapter(labConsultAdapter);

    }

}