package com.daiict.developers.intern;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
        //not useful
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //  Gson gson =new Gson();
        //  String[][] array = gson.fromJson(JSoN,String[][].class);
        View view =inflater.inflate(R.layout.fragment_one, container, false);

        return view;
    }

}
