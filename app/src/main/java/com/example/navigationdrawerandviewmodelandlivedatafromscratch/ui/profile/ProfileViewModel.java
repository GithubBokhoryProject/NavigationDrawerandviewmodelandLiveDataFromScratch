package com.example.navigationdrawerandviewmodelandlivedatafromscratch.ui.profile;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {
  private MutableLiveData<String> stringMutableLiveData=new MutableLiveData<>();
    public MutableLiveData<String> getdata(){
        stringMutableLiveData.setValue("Profile Fragment");
        return stringMutableLiveData;
    }
}
