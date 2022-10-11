package com.prapser.prapser.home.consultant;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.prapser.prapser.R;

public class PaymentBottomDialog extends BottomSheetDialogFragment {
    private AppCompatButton okBtn;
    private Dialog dialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.bootom_sheet_item,container,false);

        dialog=new Dialog(getActivity());
        okBtn=view.findViewById(R.id.okBtn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  dismiss();
                openDilaog();
            }
        });

        return view;
    }

    @Override
    public int getTheme() {

        return R.style.CustomBottomSheetDialog;
    }

    public void openDilaog(){

        final AlertDialog.Builder dialogBuilder1 = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.paymnet_confirmed_dialog, null);
        dialogBuilder1.setView(dialogView);
         AppCompatButton thanks_btn = dialogView.findViewById(R.id.thanks_btn);
        final AlertDialog alertDialog1 = dialogBuilder1.create();
        alertDialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog1.show();

                thanks_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog1.dismiss();
            }
        });



//        dialog.setContentView(R.layout.paymnet_confirmed_dialog);
//        AppCompatButton thanks_btn=dialog.findViewById(R.id.thanks_btn);
//        thanks_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                dialog.dismiss();
//            }
//        });
//        dialog.show();

    }

}
