package com.prapser.prapser.home.ehr;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;
import com.prapser.prapser.home.consultant.PaymentBottomDialog;
import com.prapser.prapser.home.ehr.EhrAddRecordDialog;
import com.prapser.prapser.util.AppConstants;


public class EHRFragment extends Fragment implements View.OnClickListener {

   private View view;
   private AppCompatButton add_record_btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_e_h_r, container, false);
        findId();
        return view;
    }

    private void findId() {
        add_record_btn=view.findViewById(R.id.add_record_btn);
        add_record_btn.setOnClickListener(this);
    }

    public void initBottomFragmnet(){
        EhrAddRecordDialog fragment=new EhrAddRecordDialog();
        fragment.show(getChildFragmentManager(), fragment.getTag());
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.add_record_btn:
                initBottomFragmnet();
                break;
        }

    }
}