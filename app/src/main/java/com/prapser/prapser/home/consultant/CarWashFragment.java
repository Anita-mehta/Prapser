package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.OfflineConsultAdapter;


public class CarWashFragment extends Fragment implements View.OnClickListener {

  private View view;
  private RecyclerView car_wash_rv;
    private OfflineConsultAdapter offlineConsultAdapter;
    private ImageView back_arrow;
    private TextView iv_filters_et;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_car_wash, container, false);
         findId();
         setAdapter();
        return view;
    }

    private void findId() {

        iv_filters_et=view.findViewById(R.id.iv_filters_et);
        iv_filters_et.setOnClickListener(this);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        car_wash_rv=view.findViewById(R.id.car_wash_rv);
    }

    private void setAdapter(){
        offlineConsultAdapter=new OfflineConsultAdapter(getActivity(), new OfflineConsultAdapter.Select() {
            @Override
            public void onClick(int position) {
                Navigation.findNavController(view).navigate(R.id.plumberProfileFragment);

                //   openDilaog();
            }
        });
        car_wash_rv.setAdapter(offlineConsultAdapter);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.iv_filters_et:
                Navigation.findNavController(view).navigate(R.id.action_carWashFragment_to_filtersFragment);
                break;

        }
    }
}