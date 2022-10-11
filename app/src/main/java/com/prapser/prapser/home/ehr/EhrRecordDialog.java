package com.prapser.prapser.home.ehr;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.prapser.prapser.R;

public class EhrRecordDialog extends BottomSheetDialogFragment implements View.OnClickListener {

    private View view;
    private RelativeLayout new_rec_rl,add_prev_record;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view =inflater.inflate(R.layout.ehr_record_dialog,container,false);
        findId();
        return view;

    }

    private void findId() {

        add_prev_record=view.findViewById(R.id.add_prev_record);
        add_prev_record.setOnClickListener(this);
        new_rec_rl=view.findViewById(R.id.new_rec_rl);
        new_rec_rl.setOnClickListener(this);
    }

    @Override
    public int getTheme() {

        return R.style.CustomBottomSheetDialog;
    }


    public void openDilaog(){


        TextView gallery_tv;
        final AlertDialog.Builder dialogBuilder1 = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.add_record_dialog, null);
        dialogBuilder1.setView(dialogView);
        final AlertDialog alertDialog1 = dialogBuilder1.create();
        alertDialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        gallery_tv=dialogView.findViewById(R.id.gallery_tv);
        gallery_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog1.dismiss();

            }
        });
                  alertDialog1.show();

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.new_rec_rl:
                openDilaog();
                dismiss();
                break;

            case R.id.add_prev_record:
                openDilaog();
                dismiss();
                break;
        }
    }
}
