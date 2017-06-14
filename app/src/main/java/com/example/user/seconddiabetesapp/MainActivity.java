package com.example.user.seconddiabetesapp;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.user.seconddiabetesapp.Fragments.Calendar;
import com.example.user.seconddiabetesapp.Fragments.Doctor;
import com.example.user.seconddiabetesapp.Fragments.Home;
import com.example.user.seconddiabetesapp.Fragments.Settings;

public class MainActivity extends AppCompatActivity implements
        Doctor.OnFragmentInteractionListener,Home.OnFragmentInteractionListener,
        Calendar.OnFragmentInteractionListener, Settings.OnFragmentInteractionListener{

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item){
                        Fragment selectedFragment=null;
                        switch(item.getItemId()){
                            case R.id.menu_home:
                                selectedFragment=Home.newInstance("vrh","ocm");
                                break;
                            case R.id.menu_calender:
                                selectedFragment=Calendar.newInstance("promjeniti","u kalendar");
                                break;
                            case R.id.menu_doctor:
                                selectedFragment=Doctor.newInstance("p","u doktore");
                                break;
                            case R.id.menu_settings:
                                selectedFragment=Settings.newInstance("p","u settings");
                                break;
                            default:
                                selectedFragment=Home.newInstance("p","u eksepsn");
                                break;

                        }
                        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container,selectedFragment);
                        transaction.commit();
                        return true;
                    }
        });
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, Home.newInstance("p","u eksepsn"));
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
