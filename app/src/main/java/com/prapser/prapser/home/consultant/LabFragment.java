package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.prapser.prapser.LabConsultFragment;
import com.prapser.prapser.R;
import com.prapser.prapser.home.doctor.DoctorOfficeFragment;
import com.prapser.prapser.home.doctor.DoctorOnlineConsultFragment;
import com.prapser.prapser.home.doctor.doc_adapter.DoctorOfficeAdapter;

public class LabFragment extends Fragment implements View.OnClickListener {

    private View view;
    private DoctorOfficeAdapter officeAdapter;
    private RecyclerView doc_office_consult;
    private LinearLayout offline_consult, online_consult;
    private TextView iv_filters_et;
    private ImageView back_arrow;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_lab, container, false);
        findId();
        //setOfficeAdapter();
        loadFragment(new LabConsultFragment());

        return view;
    }

    private void findId() {

      //  doc_office_consult=view.findViewById(R.id.doc_office_consult);

        back_arrow = view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        online_consult = view.findViewById(R.id.online_consult);
        online_consult.setOnClickListener(this);
        offline_consult = view.findViewById(R.id.offline_consult);
        offline_consult.setOnClickListener(this);
        iv_filters_et=view.findViewById(R.id.iv_filters_et);
        iv_filters_et.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.offline_consult:
                online_consult.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.grey));
                offline_consult.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.appcolor));
                loadFragment(new LabConsultFragment());
                break;

            case R.id.online_consult:
                online_consult.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.appcolor));
                offline_consult.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.grey));
                loadFragment(new LabConsultFragment());
                break;


            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.iv_filters_et:
                Toast.makeText(getActivity(), "filter-----------------", Toast.LENGTH_SHORT).show();
                Navigation.findNavController(view).navigate(R.id.action_labFragment_to_filtersFragment);
                break;


        }

    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }

}