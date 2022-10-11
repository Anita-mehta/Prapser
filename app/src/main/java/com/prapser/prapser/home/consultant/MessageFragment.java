package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.prapser.prapser.R;
import com.prapser.prapser.home.consultant.MessageAdapter;


public class MessageFragment extends Fragment implements View.OnClickListener {

   private View view;
   private MessageAdapter messageAdapter;
   private RecyclerView msg_rv;
   private ImageView back_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_message, container, false);
        findId();
        setAdapter();

        return view;
    }

    private void findId() {
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        msg_rv=view.findViewById(R.id.msg_rv);

    }
    public void setAdapter(){
        messageAdapter=new MessageAdapter(getActivity());
        msg_rv.setAdapter(messageAdapter);


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