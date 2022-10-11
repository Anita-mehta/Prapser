
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


public class PlumberProfileFragment extends Fragment implements View.OnClickListener {

  private View view;
    private RelativeLayout call_ll,mes_ll,book_ll;
    private ImageView back_arrow;
    private TextView consult_name,con_work,education_tv,about_tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_plumber_profile, container, false);
         findId();
         setData();
        return view;
    }

    private void findId() {

        about_tv=view.findViewById(R.id.about_tv);
        education_tv=view.findViewById(R.id.education_tv);
        con_work=view.findViewById(R.id.con_work);
        consult_name=view.findViewById(R.id.consult_name);
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

            case R.id.back_arrow:

                getActivity().onBackPressed();
                break;

            case R.id.mes_ll:

                Navigation.findNavController(view).navigate(R.id.action_plumberProfileFragment_to_messageFragment2);
                break;
            case R.id.call_ll:

                Navigation.findNavController(view).navigate(R.id.action_plumberProfileFragment_to_callFragment);
                break;

            case R.id.book_ll:

                Navigation.findNavController(view).navigate(R.id.action_plumberProfileFragment_to_consultBookFragment);
                break;
        }

    }

    public void setData(){

        if (App.getSingleTonModel().getConsType().equalsIgnoreCase(AppConstants.SALON)){

            about_tv.setText("ABOUT SALON");
        }
    }
}