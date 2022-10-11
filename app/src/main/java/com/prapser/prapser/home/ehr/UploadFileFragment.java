package com.prapser.prapser.home.ehr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.prapser.prapser.R;
import com.prapser.prapser.home.ehr.EhrAddRecordDialog;
import com.prapser.prapser.home.ehr.EhrRecordDialog;

public class UploadFileFragment extends Fragment implements View.OnClickListener {

   private View view;
   private FloatingActionButton fab_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_upload_file, container, false);
        findId();
        return view;
    }

    private void findId() {
        fab_btn=view.findViewById(R.id.fab_btn);
        fab_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.fab_btn:
                initBottomFragmnet();
                break;
        }
    }

    public void initBottomFragmnet(){
        EhrRecordDialog fragment=new EhrRecordDialog();
        fragment.show(getChildFragmentManager(), fragment.getTag());
    }

}