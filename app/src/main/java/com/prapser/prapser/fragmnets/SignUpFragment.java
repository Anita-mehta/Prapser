package com.prapser.prapser.fragmnets;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prapser.prapser.R;


public class SignUpFragment extends Fragment implements View.OnClickListener {

  private View view;
  private AppCompatButton btn_login;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_sign_up, container, false);
        findId();
        return view;

    }

    private void findId() {
        btn_login=view.findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_login:
                Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_otpFragment);
                break;
        }
    }
}