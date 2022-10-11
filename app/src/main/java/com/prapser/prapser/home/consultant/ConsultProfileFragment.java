package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.prapser.prapser.R;
import com.prapser.prapser.util.App;
import com.prapser.prapser.util.AppConstants;


public class ConsultProfileFragment extends Fragment implements View.OnClickListener {

      private  View view;
      private RelativeLayout call_ll,mes_ll,book_ll,video_ll;
      private ImageView back_arrow;
      private TextView consult_name,con_work,education_tv,about_tv,like_tv_edu,language_tv,language_tv1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_consult_profile, container, false);
        findId();
        setConTypeData();
        return view;
    }

    private void findId() {

        language_tv1=view.findViewById(R.id.language_tv1);
        language_tv=view.findViewById(R.id.language_tv);
        like_tv_edu=view.findViewById(R.id.like_tv_edu);
        about_tv=view.findViewById(R.id.about_tv);
        education_tv=view.findViewById(R.id.education_tv);
        con_work=view.findViewById(R.id.con_work);
        consult_name=view.findViewById(R.id.consult_name);
        video_ll=view.findViewById(R.id.video_ll);
        video_ll.setOnClickListener(this);
        book_ll=view.findViewById(R.id.book_ll);
        book_ll.setOnClickListener(this);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        mes_ll=view.findViewById(R.id.mes_ll);
        call_ll=view.findViewById(R.id.call_ll);
        call_ll.setOnClickListener(this);
        mes_ll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.call_ll:
                Navigation.findNavController(view).navigate(R.id.action_consultProfileFragment_to_callFragment);
                break;

            case R.id.mes_ll:
                Navigation.findNavController(view).navigate(R.id.action_consultProfileFragment_to_messageFragment2);
                break;

            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.book_ll:
                Navigation.findNavController(view).navigate(R.id.action_consultProfileFragment_to_consultBookFragment);
                break;

            case R.id.video_ll:
                Navigation.findNavController(view).navigate(R.id.action_consultProfileFragment_to_videoCallFragment);
                break;
        }
    }

    public void setConTypeData(){

        if (App.getSingleTonModel().getConsType().equalsIgnoreCase(AppConstants.CONSULTATION_TYPE)){
            consult_name.setText("Jot Bhullar");
            con_work.setText("Strategy Const Speaciality");
            education_tv.setText("MSC,PHD");
            about_tv.setText("ABOUT CONSULTANT");
        }
        else if (App.getSingleTonModel().getConsType().equalsIgnoreCase(AppConstants.LAWYER)){
            consult_name.setText("Adv. Jass Virk");
            con_work.setText("Property Cases Specialist");
            education_tv.setText("B.A, LLB");
            about_tv.setText("ABOUT LAWYER");

        }
        else if (App.getSingleTonModel().getConsType().equalsIgnoreCase(AppConstants.Accountant)){
            consult_name.setText(" Jass Virk");
            con_work.setText("Financial  Accounting Specialist");
            education_tv.setText("M.Com");
            about_tv.setText("ABOUT ACCOUNTANT");

        }
        else if (App.getSingleTonModel().getConsType().equalsIgnoreCase(AppConstants.DOCTOR)){
            consult_name.setText("DR.  Alia Sharam");
            con_work.setText("Elicite dys Specialist");
            language_tv.setText("Reviews");
            language_tv1.setText("230");
            education_tv.setText("150(8%)");
            like_tv_edu.setText("Likes");
            about_tv.setText("ABOUT DOCTOR");

        }
    }
}