package com.prapser.prapser.home.setting;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.prapser.prapser.R;
import com.prapser.prapser.home.setting.adapter.WalletAdapter;

public class WalletFragment extends Fragment implements View.OnClickListener {

  private View view;
  private WalletAdapter walletAdapter;
  private RecyclerView wallet_rv;
  private ImageView back_arrow;
    private BottomNavigationView bottom_navigation1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_wallet, container, false);
         findId();
         setWalletAdapter();
        return view;
    }

    private void findId() {
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        wallet_rv=view.findViewById(R.id.wallet_rv);

        bottom_navigation1=getActivity().findViewById(R.id.bottom_navigation1);
        bottom_navigation1.setVisibility(View.GONE);
    }

    private void setWalletAdapter(){

        walletAdapter=new WalletAdapter(getActivity());

        wallet_rv.setAdapter(walletAdapter);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.back_arrow:
            getActivity().onBackPressed();
            break;

    }
    }
}