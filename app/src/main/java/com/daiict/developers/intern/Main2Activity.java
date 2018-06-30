package com.daiict.developers.intern;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Boolean Clicked;
    int count=0;
    Button[] btn = new Button[16];
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn[0] =  findViewById(R.id.buttton1);
        btn[1] =  findViewById(R.id.buttton2);
        btn[2] =  findViewById(R.id.buttton3);
        btn[3] =  findViewById(R.id.buttton4);
        btn[4] =  findViewById(R.id.buttton5);
        btn[5] =  findViewById(R.id.buttton6);
        btn[6] =  findViewById(R.id.buttton7);
        btn[7] =  findViewById(R.id.buttton8);
        btn[8] =  findViewById(R.id.buttton9);
        btn[9] =  findViewById(R.id.buttton10);
        btn[10] =  findViewById(R.id.buttton11);
        btn[11] =  findViewById(R.id.buttton12);
        btn[12] =  findViewById(R.id.buttton13);
        btn[13] =  findViewById(R.id.buttton14);
        btn[14] =  findViewById(R.id.buttton15);
        btn[15] =  findViewById(R.id.buttton16);

        Clicked = false;

        btn[0].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[1].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[2].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[3].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[4].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[5].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[6].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[7].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[8].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[9].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[10].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[11].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[12].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[13].setBackground(getDrawable(R.drawable.non_colored_button));
        btn[14].setBackground(getDrawable(R.drawable.non_colored_button));


     btn[1].setOnClickListener(new View.OnClickListener() {
         @SuppressLint("NewApi")
         @Override
         public void onClick(View view) {
             if(!Clicked) {
                 btn[1].setBackground(getDrawable(R.drawable.colored_button));
                 btn[1].setTextColor(Color.BLUE);
                 Clicked = true;
                 count++;
             }
             else{
                 btn[1].setBackground(getDrawable(R.drawable.non_colored_button));
                 btn[1].setTextColor(Color.BLACK);
                 Clicked = false;
                 count--;
             }
         }
     });
        btn[0].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                btn[0].setBackground(getDrawable(R.drawable.colored_button));
                btn[0].setTextColor(Color.BLUE);
                Clicked = true;
                    count++;
            }
            else{
                btn[0].setBackground(getDrawable(R.drawable.non_colored_button));
                btn[0].setTextColor(Color.BLACK);
                Clicked = false;
                    count--;
            }
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[2].setBackground(getDrawable(R.drawable.colored_button));
                    btn[2].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[2].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[2].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[3].setBackground(getDrawable(R.drawable.colored_button));
                    btn[3].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[3].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[3].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[4].setBackground(getDrawable(R.drawable.colored_button));
                    btn[4].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[4].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[4].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[5].setBackground(getDrawable(R.drawable.colored_button));
                    btn[5].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[5].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[5].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[6].setBackground(getDrawable(R.drawable.colored_button));
                    btn[6].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[6].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[6].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[7].setBackground(getDrawable(R.drawable.colored_button));
                    btn[7].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[7].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[7].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[8].setBackground(getDrawable(R.drawable.colored_button));
                    btn[8].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[8].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[8].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[9].setBackground(getDrawable(R.drawable.colored_button));
                    btn[9].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[9].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[9].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[10].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[10].setBackground(getDrawable(R.drawable.colored_button));
                    btn[10].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[10].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[10].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;

                }

            }
        });
        btn[11].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[11].setBackground(getDrawable(R.drawable.colored_button));
                    btn[11].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[11].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[11].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[12].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[12].setBackground(getDrawable(R.drawable.colored_button));
                    btn[12].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[12].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[12].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[13].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[13].setBackground(getDrawable(R.drawable.colored_button));
                    btn[13].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[13].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[13].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });
        btn[14].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                if(!Clicked) {
                    btn[14].setBackground(getDrawable(R.drawable.colored_button));
                    btn[14].setTextColor(Color.BLUE);
                    Clicked = true;
                    count++;
                }
                else{
                    btn[14].setBackground(getDrawable(R.drawable.non_colored_button));
                    btn[14].setTextColor(Color.BLACK);
                    Clicked = false;
                    count--;
                }

            }
        });

        if(count>0){
            btn[15].setBackgroundColor(Color.RED);
        }

        btn[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        if(!Clicked) {
            Toast.makeText(getApplicationContext(), "Please select atleast one", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(i);
            finish();
        }
        }
        });
    }
}
