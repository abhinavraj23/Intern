package com.daiict.developers.intern;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class Home_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle toggle;
    android.support.v7.widget.Toolbar toolbar;

    private GoogleApiClient mGoogleApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        setNavigationViewListener();

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail().build();
        mGoogleApi = new GoogleApiClient.Builder(this).addApi(Auth.GOOGLE_SIGN_IN_API,gso).build();
        mGoogleApi.connect();

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    private void setNavigationViewListener() {

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageView profileImg = navigationView.getHeaderView(0).findViewById(R.id.profile_pic);
        TextView name = navigationView.getHeaderView(0).findViewById(R.id.user_name);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();
            Picasso.with(this).load(personPhoto).into(profileImg);
            String upperStringFname = personGivenName.substring(0, 1).toUpperCase() + personGivenName.substring(1);
            String upperStringLname = personFamilyName.substring(0, 1).toUpperCase() + personFamilyName.substring(1);
            name.setText(upperStringFname + " " + upperStringLname);
        }
    }

    @Override
    public void onStart() {
        mGoogleApi.connect();
        super.onStart();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.nav_signout:{
                Toast.makeText(this,"Logged Out",Toast.LENGTH_SHORT).show();
                FirebaseAuth.getInstance().signOut();
                Auth.GoogleSignInApi.signOut(mGoogleApi).setResultCallback(
                        new ResultCallback<Status>() {
                            @Override
                            public void onResult(Status status) {
                                Intent i = new Intent(Home_Activity.this, LoginActivity.class);
                                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(i);
                            }
                        });
                break;
            }
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
