package com.example.navigationdrawerandviewmodelandlivedatafromscratch.ui.chat;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChatViewModel extends ViewModel {
    MutableLiveData<String> stringMutableLiveData = new MutableLiveData<>();
    public void getData(){
    stringMutableLiveData.setValue("Chat Fragment");
    }
}
