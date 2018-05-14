package com.daiict.developers.intern;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class FragmentOne extends Fragment {

   // private DatabaseReference mDataBase;
    private static int count = 0;
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

        /*GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(getActivity());

        if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            final String personEmail = acct.getEmail();
            String personId = acct.getId();
            count++;



                mDataBase = FirebaseDatabase.getInstance().getReference();

                DatabaseReference mDataBaseChildN = mDataBase.child("Users").push();
                mDataBaseChildN.child("Name").setValue(personName);
                //DatabaseReference mDataBaseChildE = mDataBase.child("Users").child(userID).child("Email");
                mDataBaseChildN.child("Email").setValue(personEmail);
        }*/

        return view;
    }

}
