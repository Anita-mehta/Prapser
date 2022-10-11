package com.prapser.prapser.home.ehr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.prapser.prapser.R;

public class EhrAddRecordDialog extends BottomSheetDialogFragment implements View.OnClickListener {

    private TextView upload_file_tv;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         view =inflater.inflate(R.layout.ehr_dialog,container,false);
        upload_file_tv=view.findViewById(R.id.upload_file_tv);
        upload_file_tv.setOnClickListener(this);
        return view;

    }

    @Override
    public int getTheme() {

        return R.style.CustomBottomSheetDialog;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.upload_file_tv:

                Intent intent=new Intent(getActivity(),FileUploadActivity.class);
                startActivity(intent);

                break;
        }
    }


}
