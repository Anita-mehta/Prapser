package com.prapser.prapser.home.setting;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.prapser.prapser.R;

public class SettingFragment extends Fragment implements View.OnClickListener {

    private View view;
    private RelativeLayout message_rl,appointment_rl,report_rl,refer_friend_rl,wallet_rl,term_condition_rl,log_out_rl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_setting, container, false);

        findId();
        return view;
    }

    private void findId() {

        log_out_rl=view.findViewById(R.id.log_out_rl);
        log_out_rl.setOnClickListener(this);
        term_condition_rl=view.findViewById(R.id.term_condition_rl);
        term_condition_rl.setOnClickListener(this);
        wallet_rl=view.findViewById(R.id.wallet_rl);
        wallet_rl.setOnClickListener(this);
        refer_friend_rl=view.findViewById(R.id.refer_friend_rl);
        refer_friend_rl.setOnClickListener(this);
        report_rl=view.findViewById(R.id.report_rl);
        report_rl.setOnClickListener(this);
        appointment_rl=view.findViewById(R.id.appointment_rl);
        appointment_rl.setOnClickListener(this);
        message_rl=view.findViewById(R.id.message_rl);
        message_rl.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.message_rl:
                Navigation.findNavController(view).navigate(R.id.allMessageFragment);
                break;

            case R.id.appointment_rl:
                Navigation.findNavController(view).navigate(R.id.myAppoitnmentFragment);
                break;

            case R.id.report_rl:
                Navigation.findNavController(view).navigate(R.id.reportFragment);
                break;

            case R.id.refer_friend_rl:
                Navigation.findNavController(view).navigate(R.id.referFriendFragment);
                break;

            case R.id.wallet_rl:
                Navigation.findNavController(view).navigate(R.id.walletFragment);
                break;
            case R.id.term_condition_rl:
                Navigation.findNavController(view).navigate(R.id.termAndConditionFragment);
                break;

            case R.id.log_out_rl:
                break;
        }
    }
}