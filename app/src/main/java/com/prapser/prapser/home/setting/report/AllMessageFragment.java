package com.prapser.prapser.home.setting.report;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.prapser.prapser.R;
import com.prapser.prapser.home.setting.adapter.ChatMessageAdapter;
import com.prapser.prapser.home.setting.adapter.UserOnlineAdapter;

public class AllMessageFragment extends Fragment implements View.OnClickListener {

   private View view;
   private RecyclerView rv_online_user,rv_user_message;
   private UserOnlineAdapter userOnlineAdapter;
   private ChatMessageAdapter messageAdapter;
   private ImageView back_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_all_message, container, false);

        findID();
        setAdapterOnlineUser();
        setMessageAdapter();
        return view;
    }

    private void findID() {
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        rv_user_message=view.findViewById(R.id.rv_user_message);
        rv_online_user=view.findViewById(R.id.rv_online_user);

    }

    private void setAdapterOnlineUser() {
        userOnlineAdapter=new UserOnlineAdapter(getActivity());
          rv_online_user.setAdapter(userOnlineAdapter);
    }

    private void setMessageAdapter(){
        messageAdapter=new ChatMessageAdapter(getActivity(), new ChatMessageAdapter.Select() {
            @Override
            public void onClick(int position) {

                Navigation.findNavController(view).navigate(R.id.action_allMessageFragment_to_messageFragment2);

            }
        });

        rv_user_message.setAdapter(messageAdapter);


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