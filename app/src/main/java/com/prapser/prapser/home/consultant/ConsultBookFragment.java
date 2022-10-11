package com.prapser.prapser.home.consultant;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.applandeo.materialcalendarview.listeners.OnDayClickListener;
import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.BookAppConAdapter;

import java.util.Calendar;


public class ConsultBookFragment extends Fragment implements View.OnClickListener {

    private View view;
    private RecyclerView time_rv;
    private BookAppConAdapter bookAppConAdapter;
    private ImageView back_arrow;
    private AppCompatButton contnue_btn;
    private CalendarView calendarView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_consult_book, container, false);

        findId();
        setAdapter();

        return view;
    }

    private void findId() {
        calendarView=view.findViewById(R.id.calendarView);
        contnue_btn=view.findViewById(R.id.contnue_btn);
        contnue_btn.setOnClickListener(this);
        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);
        time_rv=view.findViewById(R.id.time_rv);
    }
    private void setAdapter(){

        bookAppConAdapter=new BookAppConAdapter(getActivity(), new BookAppConAdapter.Select() {
            @Override
            public void onclick(int position) {

               // Toast.makeText(requireActivity(), ""+position, Toast.LENGTH_SHORT).show();
            }
        });
        time_rv.setAdapter(bookAppConAdapter);
        bookAppConAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;
            case R.id.contnue_btn:
                Navigation.findNavController(view).navigate(R.id.action_consultBookFragment_to_bookAppoitmentFragment);
                break;
        }
    }
}