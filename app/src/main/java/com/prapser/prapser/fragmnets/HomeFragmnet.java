package com.prapser.prapser.fragmnets;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.prapser.prapser.R;
import com.prapser.prapser.home.adapter.CategoryListAdapter;
import com.prapser.prapser.home.adapter.ImageAdapter;
import com.prapser.prapser.util.App;
import com.prapser.prapser.util.AppConstants;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragmnet extends Fragment implements View.OnClickListener {
     private View view;
     private ViewPager viewPager;
     private CircleIndicator indicator;
     private CategoryListAdapter catAdapter;
     private RecyclerView category_rv;
     private TextView profile_tv;
     private BottomNavigationView bottom_navigation1;
    private int[] mImageIds = new int[]{R.drawable.doc_img, R.drawable.teacher_img,
            R.drawable.doc_img, R.drawable.teacher_img, R.drawable.doc_img};

    private int[] catImage = new int[]{R.drawable.doctor,R.drawable.laywer, R.drawable.accountant,
            R.drawable.psyclogist, R.drawable.teacher, R.drawable.arthitects, R.drawable.notairs, R.drawable.lab,R.drawable.consultant,R.drawable.barber,R.drawable.car,R.drawable.mechanic,R.drawable.plumber,R.drawable._electtrician,R.drawable.physical};

    private String[] catName={"Doctors","Lawyers","Accountants","Psycologists","Teachers", "Architects", "Notaires Public", "Laboratories", "Consultants", "Salon/Barber Shops","Car Wash", "Mechanics", "Plumbers","Electricians","Physical Therapist Kinesiologists"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home_fragmnet, container, false);

        bottom_navigation1=getActivity().findViewById(R.id.bottom_navigation1);
        bottom_navigation1.setVisibility(View.VISIBLE);
        findId();
        setViewPager();
        setCatAdapter();
        return view;
    }

    private void findId() {

        profile_tv=view.findViewById(R.id.profile_tv);
        profile_tv.setOnClickListener(this);
        category_rv=view.findViewById(R.id.category_rv);
        viewPager=view.findViewById(R.id.viewPager);
        indicator=view.findViewById(R.id.indicator);

    }
    private void setCatAdapter(){
        catAdapter=new CategoryListAdapter(getActivity(), catImage, catName, new CategoryListAdapter.Select() {
            @Override
            public void onClick(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"consultant");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.CONSULTATION_TYPE);

            }

            @Override
            public void onLawyerClick(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"laywer");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.LAWYER);

            }

            @Override
            public void onAccountant(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"accountant");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.Accountant);

            }

            @Override
            public void onElectrician(int position) {

                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"electrician");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.ELECTRICIAN);


            }

            @Override
            public void onMechanics(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"mechanics");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.MECHANICS);

            }

            @Override
            public void onPlumber(int position) {

                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"plumber");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.PLUMBER);

            }

            @Override
            public void onTeacher(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"teacher");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.TEACHER);

            }

            @Override
            public void onCarWash(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"carWash");
                Navigation.findNavController(view).navigate(R.id.action_homeFragmnet_to_carWashFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.CARWASH);


            }

            @Override
            public void onPsyclogist(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"pshyclogist");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.PSYCHLOGIST);

            }

            @Override
            public void onArchitecture(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"architecture");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.ARCHITECUTRE);

            }

            @Override
            public void onNotrais(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"notairs");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.NOTRAIS);

            }

            @Override
            public void onSalon(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"salon");
                Navigation.findNavController(view).navigate(R.id.action_homeFragmnet_to_salonFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.SALON);

            }

            @Override
            public void onPhysician(int position) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"physician");
                Navigation.findNavController(view).navigate(R.id.action_homeFragmnet_to_salonFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.PHYSICIAN);

            }

            @Override
            public void onDoctor(int position) {

                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"doctor");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.DOCTOR);
            }

            @Override
            public void onLab(int position) {

                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.CONS_TYPE,"lab");
                Navigation.findNavController(view).navigate(R.id.doctorSeacrhFragment,bundle);
                App.getSingleTonModel().setConsType(AppConstants.LAB);


            }
        });
        category_rv.setAdapter(catAdapter);
    }

    public void setViewPager(){
        ImageAdapter adapter1 = new ImageAdapter(getActivity(), mImageIds);
        viewPager.setAdapter(adapter1);
        indicator = (CircleIndicator)view.findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
    }

    @Override
    public void onResume() {
        super.onResume();
        bottom_navigation1.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.profile_tv:
                Navigation.findNavController(view).navigate(R.id.action_homeFragmnet_to_profileFragment);
                break;
        }
    }
}