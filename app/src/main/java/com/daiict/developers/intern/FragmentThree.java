package com.daiict.developers.intern;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import java.util.Arrays;


public class FragmentThree extends Fragment {
    public FragmentThree() {
        // Required empty public constructor
    }

    Button signout;
    TextView Name;
    TextView Email;
    GoogleApiClient mGoogleApiClient;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_three, container, false);
        TextView email = (TextView) view.findViewById(R.id.email);
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(getActivity());
        ImageView profileImg = (ImageView) view.findViewById(R.id.profile_img);
        TextView name = (TextView) view.findViewById(R.id.name);
        if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();
            Picasso.with(getContext()).load(personPhoto).into(profileImg);
            String upperStringFname = personGivenName.substring(0, 1).toUpperCase() + personGivenName.substring(1);
            String upperStringLname = personFamilyName.substring(0, 1).toUpperCase() + personFamilyName.substring(1);
            name.setText(upperStringFname + " " + upperStringLname);
            email.setText(personEmail);
        }

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // Name, email address, and profile photo Url
            String personName = user.getDisplayName();
            //String personGivenName = user.getGivenName();
            //String personFamilyName = user.getFamilyName();
            String personEmail = user.getEmail();
            //String personId = user.getId();
            Uri personPhoto = user.getPhotoUrl();
            Picasso.with(getContext()).load(personPhoto).into(profileImg);
            String upperStringFname = personName.substring(0, 1).toUpperCase() + personName.substring(1);
            //String upperStringLname = personFamilyName.substring(0, 1).toUpperCase() + personFamilyName.substring(1);
            name.setText(upperStringFname);
            email.setText(personEmail);

            // Check if user's email is verified
            boolean emailVerified = user.isEmailVerified();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getIdToken() instead.
            String uid = user.getUid();
        }

        signout = (Button) view.findViewById(R.id.signout_button);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Logged Out",Toast.LENGTH_SHORT).show();
                Name = (TextView) view.findViewById(R.id.name);
                Email = (TextView) view.findViewById(R.id.email);
                Email.setHint("Email address");
                Name.setHint("Person Name");
                Email.setText("");
                Name.setText("");
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(getActivity(), LoginActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
                //Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(
                        /*new ResultCallback<Status>() {
                            @Override
                            public void onResult(Status status) {
                                Toast.makeText(getContext(),"Logged Out",Toast.LENGTH_SHORT).show();
                                Name = (TextView) view.findViewById(R.id.name);
                                Email = (TextView) view.findViewById(R.id.email);
                                Email.setHint("Email address");
                                Name.setHint("Person Name");
                                Email.setText("");
                                Name.setText("");
                                FirebaseAuth.getInstance().signOut();
                                Intent i = new Intent(getActivity(), LoginActivity.class);
                                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(i);
                            }
                        };*/
            }
        });
        return view;
    }
}