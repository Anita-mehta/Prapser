package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.prapser.prapser.R;
import com.prapser.prapser.home.consultant.OfflineFragment;
import com.prapser.prapser.home.consultant.OnlineFragment;

public class ArchitectureFragment extends Fragment implements View.OnClickListener {

   private View view;
    private LinearLayout offline_consult,online_consult;
    private FrameLayout frameLayout;
    private ImageView back_arrow;
    private ImageView video_btn;
    private TextView iv_filters_et;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_architecture, container, false);
         findId();
        if (savedInstanceState == null) {
            loadFragment(new OfflineFragment());
        }

        return view;
    }

    private void findId() {
        iv_filters_et = view.findViewById(R.id.iv_filters_et);
        iv_filters_et.setOnClickListener(this);
        video_btn=view.findViewById(R.id.video_btn);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        frameLayout=view.findViewById(R.id.frameLayout);
        online_consult=view.findViewById(R.id.online_consult);
        online_consult.setOnClickListener(this);
        offline_consult=view.findViewById(R.id.offline_consult);
        offline_consult.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.offline_consult:
                online_consult.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.grey));
                offline_consult.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.appcolor));
                loadFragment(new OfflineFragment());
                break;

            case R.id.online_consult:
                online_consult.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.appcolor));
                offline_consult.setBackgroundColor(ContextCompat.getColor(getActivity(),R.color.grey));
                loadFragment(new OnlineFragment());
                break;


            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.iv_filters_et:
                Navigation.findNavController(view).navigate(R.id.action_architectureFragment_to_filtersFragment);
                break;


        }


    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }

}