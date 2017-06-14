package com.example.user.seconddiabetesapp.Onboarding;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by User on 14.06.2017..
 */

public class OnboardingManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    public OnboardingManager(Context context){
        this.context=context;
        pref=context.getSharedPreferences("first",0);
        editor=pref.edit();
    }

    public void setFirst(boolean isFirst){
        editor.putBoolean("check",isFirst);
        editor.commit();
    }

    public boolean Check(){
        return pref.getBoolean("check",true);
    }
}
