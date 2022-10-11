
package com.prapser.prapser.home.consultant;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.prapser.prapser.R;
import com.prapser.prapser.activity.HomeActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CompleteProfileFragment extends Fragment implements View.OnClickListener {

   private View view;
   private ImageView back_arrow,cal_image;
    private int mYear, mDay, mMonth;
    private TextView calender_tv;
    private AppCompatButton update_pro_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_complete_profile, container, false);
        findId();
        return view;
    }

    private void findId() {

        update_pro_btn=view.findViewById(R.id.update_pro_btn);
        update_pro_btn.setOnClickListener(this);
        calender_tv=view.findViewById(R.id.calender_tv);
        cal_image=view.findViewById(R.id.cal_image);
        cal_image.setOnClickListener(this);

        back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.back_arrow:
                getActivity().onBackPressed();
                break;

            case R.id.cal_image:
                getDobCalendar();
                break;

            case R.id.update_pro_btn:
                Intent intent=new Intent(getActivity(), HomeActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void getDobCalendar() {
        // Get Current Date
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Date myDate = new Date();
                myDate.setMonth(i1);
                myDate.setYear(i - 1900);
                myDate.setDate(i2);
//                        date=dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd");
                // Format the date to Strings
                String mdy = dmyFormat.format(myDate);
                // Toast.makeText(getActivity(), "Date--" + mdy, Toast.LENGTH_SHORT).show();
                calender_tv.setText(mdy);

            }
        }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

}