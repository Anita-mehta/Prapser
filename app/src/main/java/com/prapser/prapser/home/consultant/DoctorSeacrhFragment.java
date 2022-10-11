package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.DoctorSearchAdapter;
import com.prapser.prapser.util.App;
import com.prapser.prapser.util.AppConstants;

public class DoctorSeacrhFragment extends Fragment implements View.OnClickListener {

   private View view;
   private RecyclerView specialist_rv;
   private DoctorSearchAdapter searchAdapter;
   private ImageView back_arrow;
    private BottomNavigationView bottom_navigation1;
    private String consType="";
    private EditText searchEt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_doctor_seacrh, container, false);
        bottom_navigation1=getActivity().findViewById(R.id.bottom_navigation1);
        bottom_navigation1.setVisibility(View.GONE);

        Bundle bundle=getArguments();
        consType=bundle.getString(AppConstants.CONS_TYPE);
        findId();
        setConsType();
        setAdapter();
        return view;
    }

    private void findId() {
        searchEt=view.findViewById(R.id.searchEt);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        specialist_rv=view.findViewById(R.id.specialist_rv);
    }

    private void setAdapter(){
        searchAdapter=new DoctorSearchAdapter(getActivity(), new DoctorSearchAdapter.Select() {
            @Override
            public void onClick(int position) {
                if (consType.equalsIgnoreCase("consultant")){
                    Navigation.findNavController(view).navigate(R.id.consultantFragment);
                }
                else if (consType.equalsIgnoreCase("laywer")){
                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_laywerConsultFragment);
                }
                else if (consType.equalsIgnoreCase("accountant")){
                    Navigation.findNavController(view).navigate(R.id.accountantConsultantFragment);
                }
                else if (consType.equalsIgnoreCase("electrician")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_electricainFragment);
                }

                else if (consType.equalsIgnoreCase("mechanics")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_mechanicFragment);

                }
                else if (consType.equalsIgnoreCase("plumber")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_plumberFragment);

                }
                else if (consType.equalsIgnoreCase("teacher")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_teacherFragment);

                }
                else if (consType.equalsIgnoreCase("pshyclogist")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_teacherFragment);

                }
                else if (consType.equalsIgnoreCase("architecture")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_architectureFragment);

                }
                else if (consType.equalsIgnoreCase("notairs")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_notairsFragment);

                }
                else if (consType.equalsIgnoreCase("physician")){

                    Navigation.findNavController(view).navigate(R.id.action_doctorSeacrhFragment_to_therapistFragment);

                }
                else if (consType.equalsIgnoreCase("doctor")){

                    Navigation.findNavController(view).navigate(R.id.doctorConsultFragment);

                }
                else if (consType.equalsIgnoreCase("lab")){

                    Navigation.findNavController(view).navigate(R.id.labFragment);

                }
            }
        });
        specialist_rv.setAdapter(searchAdapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        bottom_navigation1.setVisibility(View.GONE);
    }
    private void setConsType(){
        if (consType.equalsIgnoreCase("consultant")){
            searchEt.setHint("Search Consultant");

        }
        else if (consType.equalsIgnoreCase("laywer")){
            searchEt.setHint("Search Lawyer");

        }
        else if (consType.equalsIgnoreCase("accountant")){
            searchEt.setHint("Search Accountant");
        }

        else if (consType.equalsIgnoreCase("electrician")){

            searchEt.setHint("Search Electrician");
        }
        else if (consType.equalsIgnoreCase("mechanics")){
            searchEt.setHint("Search mechanic");
        }
        else if (consType.equalsIgnoreCase("plumber")){
            searchEt.setHint("Search Plumber");
        }
        else if (consType.equalsIgnoreCase("teacher")){
            searchEt.setHint("Search Teacher");
        }
        else if (consType.equalsIgnoreCase("pshyclogist")){
            searchEt.setHint("Search Psychologist");
        }
        else if (consType.equalsIgnoreCase("architecture")){
            searchEt.setHint("Search Architecture");
        }
        else if (consType.equalsIgnoreCase("notairs")){
            searchEt.setHint("Search Notairs");
        }
        else if (consType.equalsIgnoreCase("physician")){
            searchEt.setHint("Search Specialist");
        }
        else if (consType.equalsIgnoreCase("doctor")){
            searchEt.setHint("Search Doctor");
        }
        else if (consType.equalsIgnoreCase("lab")){
            searchEt.setHint("Blood test,Haemoglobin, TLC ");
        }


    }
}