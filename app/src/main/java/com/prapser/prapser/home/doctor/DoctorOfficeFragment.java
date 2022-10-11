package com.prapser.prapser.home.doctor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;
import com.prapser.prapser.home.doctor.doc_adapter.DoctorOfficeAdapter;


public class DoctorOfficeFragment extends Fragment {

    private View view;
    private DoctorOfficeAdapter officeAdapter;
    private RecyclerView doc_office_consult;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_doctor_office, container, false);

        findID();
        setOfficeAdapter();
        return  view;
    }

    private void findID() {
        doc_office_consult=view.findViewById(R.id.doc_office_consult);

    }
    private void setOfficeAdapter(){
        officeAdapter=new DoctorOfficeAdapter(getActivity(), new DoctorOfficeAdapter.Select() {
            @Override
            public void onClick(int position) {
                Navigation.findNavController(view).navigate(R.id.offlineConsultProfileFragment);

            }

            @Override
            public void onMoreClick(int position) {
                Navigation.findNavController(view).navigate(R.id.offlineConsultProfileFragment);


            }
        });
        doc_office_consult.setAdapter(officeAdapter);

    }
}