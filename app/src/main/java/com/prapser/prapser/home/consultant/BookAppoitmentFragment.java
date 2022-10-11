package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.UserAdapter;


public class BookAppoitmentFragment extends Fragment implements View.OnClickListener {

   private View view;
   private ImageView back_arrow;
   private UserAdapter userAdapter;
   private RecyclerView user_rv;
   private AppCompatButton contnue_btn;
   private RelativeLayout add_ehr_rl_tv;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_book_appoitment, container, false);
         findIs();
         setAdapter();
        return view;
    }

    private void findIs() {

        add_ehr_rl_tv=view.findViewById(R.id.add_ehr_rl_tv);
        add_ehr_rl_tv.setOnClickListener(this);
        contnue_btn=view.findViewById(R.id.contnue_btn);
        contnue_btn.setOnClickListener(this);
        user_rv=view.findViewById(R.id.user_rv);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.contnue_btn:
                Navigation.findNavController(view).navigate(R.id.action_bookAppoitmentFragment_to_consultPaymentFragment);
                break;

            case R.id.add_ehr_rl_tv:
                  Navigation.findNavController(view).navigate(R.id.action_bookAppoitmentFragment_to_EHRFragment);
                break;
        }
    }
    private void setAdapter(){

        userAdapter=new UserAdapter(getActivity());
        user_rv.setAdapter(userAdapter);


    }
}