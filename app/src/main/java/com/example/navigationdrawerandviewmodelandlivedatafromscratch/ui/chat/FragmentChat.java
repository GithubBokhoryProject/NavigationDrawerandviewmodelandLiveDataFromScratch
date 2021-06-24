package com.example.navigationdrawerandviewmodelandlivedatafromscratch.ui.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawerandviewmodelandlivedatafromscratch.R;
import com.example.navigationdrawerandviewmodelandlivedatafromscratch.databinding.FragmentChatBinding;

public class FragmentChat extends Fragment {
    private FragmentChatBinding binding;
    ChatViewModel chatViewModel;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentChat() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentChat newInstance(String param1, String param2) {
        FragmentChat fragment = new FragmentChat();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding=FragmentChatBinding.inflate(inflater,container,false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
        chatViewModel= ViewModelProviders.of(this).get(ChatViewModel.class);
        chatViewModel.stringMutableLiveData.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.txtChatId.setText(s);
            }
        });
        chatViewModel.getData();
        return root;
    }
}