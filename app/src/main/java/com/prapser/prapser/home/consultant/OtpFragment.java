package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;


public class OtpFragment extends Fragment implements View.OnClickListener {

   private View view;
   private AppCompatButton otp_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_otp, container, false);
        findId();
        return view;
    }

    private void findId() {
        otp_button=view.findViewById(R.id.otp_button);
        otp_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.otp_button:
                Navigation.findNavController(view).navigate(R.id.action_otpFragment_to_completeProfileFragment);
                break;
        }
    }
}