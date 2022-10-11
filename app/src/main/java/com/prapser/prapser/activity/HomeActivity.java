package com.prapser.prapser.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.prapser.prapser.R;
import com.prapser.prapser.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding homeBinding;
    private BottomNavigationView bottom_navigation1;
    AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homeBinding= DataBindingUtil.setContentView(this,R.layout.activity_home);

         bottom_navigation1 = findViewById(R.id.bottom_navigation1);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
         appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.homeFragmnet,R.id.myAppoitnmentFragment, R.id.EHRFragment,R.id.settingFragment)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.activity_main_nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottom_navigation1, navController);

//        bottom_navigation1 = findViewById(R.id.bottom_navigation1);
////        appBarConfiguration = new AppBarConfiguration.Builder(R.id.groupTabFragment).build();
//        appBarConfiguration = new AppBarConfiguration.Builder(R.id.homeFragmnet).build();
//        appBarConfiguration = new AppBarConfiguration.Builder(R.id.messageFragment).build();
//        NavController navController = Navigation.findNavController(this, R.id.activity_main_nav_host_fragment);
//        NavigationUI.setupWithNavController(bottom_navigation1, navController);


    }
}