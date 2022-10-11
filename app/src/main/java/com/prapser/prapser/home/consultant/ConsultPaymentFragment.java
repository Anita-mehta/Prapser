package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.prapser.prapser.R;
import com.prapser.prapser.home.consultant.PaymentBottomDialog;

public class ConsultPaymentFragment extends Fragment implements View.OnClickListener {

 private ImageView back_arrow;
 private View view;
 private AppCompatButton pay_btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_consult_payment, container, false);
        findId();
        return view;
    }

    private void findId() {
        pay_btn=view.findViewById(R.id.pay_btn);
        pay_btn.setOnClickListener(this);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.pay_btn:
                initBottomFragmnet();
                break;
        }
    }
    public void initBottomFragmnet(){
        PaymentBottomDialog fragment=new PaymentBottomDialog();
        fragment.show(getChildFragmentManager(), fragment.getTag());
    }
}