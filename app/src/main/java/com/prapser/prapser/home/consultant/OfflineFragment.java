package com.prapser.prapser.home.consultant;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.OfflineConsultAdapter;


public class OfflineFragment extends Fragment {

private View view;
private RecyclerView offlineConsult_rv;
private OfflineConsultAdapter offlineConsultAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_offline, container, false);
        findId();
        setAdapter();

        return view;
    }

    private void findId() {
        offlineConsult_rv=view.findViewById(R.id.offlineConsult_rv);
    }
    private void setAdapter(){
        offlineConsultAdapter=new OfflineConsultAdapter(getActivity(), new OfflineConsultAdapter.Select() {
            @Override
            public void onClick(int position) {
                Navigation.findNavController(view).navigate(R.id.offlineConsultProfileFragment);

             //   openDilaog();
            }
        });
        offlineConsult_rv.setAdapter(offlineConsultAdapter);
    }
    public void openDilaog(){

        final AlertDialog.Builder dialogBuilder1 = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.book_ofice_dialog, null);
        dialogBuilder1.setView(dialogView);
        AppCompatButton cancel_btn = dialogView.findViewById(R.id.cancel_btn);
        final AlertDialog alertDialog1 = dialogBuilder1.create();
        alertDialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog1.show();

        cancel_btn.setOnClickListener(new View.OnClickListener() {
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