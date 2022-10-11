package com.prapser.prapser.home.ehr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.prapser.prapser.R;

public class FileUploadActivity extends AppCompatActivity implements View.OnClickListener {
    private FloatingActionButton fab_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_upload);
        findId();
    }

    private void findId() {

        fab_btn=findViewById(R.id.fab_btn);
        fab_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab_btn:
                initBottomFragmnet();
                break;
        }

    }

    public void initBottomFragmnet(){
        EhrRecordDialog fragment=new EhrRecordDialog();
        fragment.show(getSupportFragmentManager(), fragment.getTag());
    }

}