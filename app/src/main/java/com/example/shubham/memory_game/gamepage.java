package com.example.shubham.memory_game;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class gamepage extends AppCompatActivity {
    TextView tv_1 , tv_2;
    ImageView iv_11 , iv_12 , iv_13 , iv_14 , iv_2 , iv_1 , iv_3 , iv_4 ,iv_5 , iv_6 , iv_7 , iv_8 , iv_9 , iv_10 , iv_15 , iv_16;
    Integer[] cardsarray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    int image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15,image16;
    int firstcard , secondcard;
    int cardnumber = 1;
    int turn=1;
    int playpoints=0 , cpupoints=0;
    int clickedfirst , clickedsecond;
    AnimatorSet set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepage);
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
        tv_2.setText(getIntent().getExtras().getString("b") +" "+ cpupoints);
        tv_1.setText(getIntent().getExtras().getString("a") +" "+ playpoints);
        iv_1 = findViewById(R.id.iv_1);
        iv_2 = findViewById(R.id.iv_2);
        iv_3 = findViewById(R.id.iv_3);
        iv_4 = findViewById(R.id.iv_4);
        iv_5 = findViewById(R.id.iv_5);
        iv_6 = findViewById(R.id.iv_6);
        iv_7 = findViewById(R.id.iv_7);
        iv_8 = findViewById(R.id.iv_8);
        iv_9 = findViewById(R.id.iv_9);
        iv_10 = findViewById(R.id.iv_10);
        iv_11 = findViewById(R.id.iv_11);
        iv_12 = findViewById(R.id.iv_12);
        iv_13 = findViewById(R.id.iv_13);
        iv_14 = findViewById(R.id.iv_14);
        iv_15 = findViewById(R.id.iv_15);
        iv_16 = findViewById(R.id.iv_16);
        iv_1.setTag("0");
        iv_2.setTag("1");
        iv_3.setTag("2");
        iv_4.setTag("3");
        iv_5.setTag("4");
        iv_6.setTag("5");
        iv_7.setTag("6");
        iv_8.setTag("7");
        iv_9.setTag("8");
        iv_10.setTag("9");
        iv_11.setTag("10");
        iv_12.setTag("11");
        iv_13.setTag("12");
        iv_14.setTag("13");
        iv_15.setTag("14");
        iv_16.setTag("15");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsarray));
        tv_2.setTextColor(Color.GRAY);
        iv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());

                doStuff(iv_1 , thecard);
            }
        });
        iv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_2 , thecard);
            }
        });
        iv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_3 , thecard);
            }
        });
        iv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_4 , thecard);
            }
        });
        iv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_5 , thecard);
            }
        });
        iv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_6 , thecard);
            }
        });
        iv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_7 , thecard);
            }
        });
        iv_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_8 , thecard);
            }
        });
        iv_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_9 , thecard);
            }
        });
        iv_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_10 , thecard);
            }
        });
        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11 , thecard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12 , thecard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13 , thecard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14 , thecard);
            }
        });
        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_15 , thecard);
            }
        });
        iv_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_16 , thecard);
            }
        });
    }

    @SuppressLint("ResourceType")
    private void doStuff(ImageView iv, int card) {

        if (cardsarray[card] == 1)
        {
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image1);
        }
        else if(cardsarray[card] == 2){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image2);
        }
        else if(cardsarray[card] == 3){set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image3);
        }
        else if(cardsarray[card] == 4){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image4);
        }
        else if(cardsarray[card] == 5){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image5);
        }else if(cardsarray[card] == 6){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image6);
        }
        else if(cardsarray[card] == 7){

            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image7);
        }
        else if(cardsarray[card] == 8){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image8);
        }
        else if(cardsarray[card] == 9){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image9);
        }
        else if(cardsarray[card] == 10){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image10);
        }
        else if(cardsarray[card] == 11){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image11);
        }
        else if(cardsarray[card] == 12){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image12);
        }
        else if(cardsarray[card] == 13){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image13);
        }
        else if(cardsarray[card] == 14){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image14);
        }
        else if(cardsarray[card] == 15){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image15);
        }
        else if(cardsarray[card] == 16){
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip);
            set.setTarget(iv);
            set.start();
            iv.setImageResource(image16);
        }
        if (cardnumber == 1)
        {
            firstcard = cardsarray[card];
            if (firstcard > 8)
            {
                firstcard = firstcard - 8;
            }
            cardnumber =2;
            clickedfirst = card;
            iv.setEnabled(false);
        }

        else if (cardnumber == 2)
        {
            secondcard = cardsarray[card];
            if (secondcard > 8)
            {
                secondcard = secondcard - 8;
            }
            cardnumber =1;
            clickedsecond = card;
            iv_1.setEnabled(false);
            iv_2.setEnabled(false);
            iv_3.setEnabled(false);
            iv_4.setEnabled(false);
            iv_5.setEnabled(false);
            iv_6.setEnabled(false);
            iv_7.setEnabled(false);
            iv_8.setEnabled(false);
            iv_9.setEnabled(false);
            iv_10.setEnabled(false);
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_16.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }

    }
    @SuppressLint("ResourceType")
    private void calculate() {
        if (firstcard == secondcard) {
            if (clickedfirst == 0) {
                iv_1.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 1) {
                iv_2.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 2) {
                iv_3.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 3) {
                iv_4.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 4) {
                iv_5.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 5) {
                iv_6.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 6) {
                iv_7.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 7) {
                iv_8.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 8) {
                iv_9.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 9) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 10) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 11) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 12) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 13) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 14) {
                iv_15.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 15) {
                iv_16.setVisibility(View.INVISIBLE);
            }

            if (clickedsecond == 0) {
                iv_1.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 1) {
                iv_2.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 2) {
                iv_3.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 3) {
                iv_4.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 4) {
                iv_5.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 5) {
                iv_6.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 6) {
                iv_7.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 7) {
                iv_8.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 8) {
                iv_9.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 9) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 10) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 11) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 12) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 13) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 14) {
                iv_15.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 15) {
                iv_16.setVisibility(View.INVISIBLE);
            }
            if (turn == 1) {
                playpoints++;
                tv_1.setText(getIntent().getExtras().getString("a") + playpoints);

            } else if (turn == 2) {
                cpupoints++;
                tv_2.setText(getIntent().getExtras().getString("b") + cpupoints);

            } }


        else {
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_1);
            set.start();
            iv_1.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_2);
            set.start();
            iv_2.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_3);
            set.start();
            iv_3.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_4);
            set.start();
            iv_4.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_5);
            set.start();
            iv_5.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_6);
            set.start();
            iv_6.setImageResource(R.drawable.imback);

            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_7);
            set.start();
            iv_7.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_8);
            set.start();
            iv_8.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_9);
            set.start();
            iv_9.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_10);
            set.start();
            iv_10.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_11);
            set.start();
            iv_11.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_12);
            set.start();
            iv_12.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_13);
            set.start();
            iv_13.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_14);
            set.start();
            iv_14.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_15);
            set.start();
            iv_15.setImageResource(R.drawable.imback);
            set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.anim.flip1);
            set.setTarget(iv_16);
            set.start();
            iv_16.setImageResource(R.drawable.imback);
            if (turn == 1) {
                turn = 2;
                tv_1.setTextColor(Color.GRAY);
                tv_2.setTextColor(Color.BLACK);

            } else if (turn == 2) {
                turn = 1;
                tv_2.setTextColor(Color.GRAY);
                tv_1.setTextColor(Color.BLACK);

            }

        }

        iv_1.setEnabled(true);
        iv_2.setEnabled(true);
        iv_3.setEnabled(true);
        iv_4.setEnabled(true);
        iv_5.setEnabled(true);
        iv_6.setEnabled(true);
        iv_7.setEnabled(true);
        iv_8.setEnabled(true);
        iv_9.setEnabled(true);
        iv_10.setEnabled(true);
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);
        iv_16.setEnabled(true);

        checkEnd();
    }
    private void frontOfCardsResources() {

        image1 = R.drawable.ic1;
        image2 = R.drawable.ic2;
        image3 = R.drawable.ic3;
        image4 = R.drawable.ic4;
        image5 = R.drawable.ic5;
        image6 = R.drawable.ic6;
        image7 = R.drawable.ic7;
        image8 = R.drawable.ic8;
        image9 = R.drawable.ic9;
        image10 = R.drawable.ic10;
        image11 = R.drawable.ic11;
        image12 = R.drawable.ic12;
        image13 = R.drawable.ic13;
        image14 = R.drawable.ic14;
        image15 = R.drawable.ic15;
        image16 = R.drawable.ic16;
    }



    private void checkEnd() {
        if(iv_1.getVisibility()==View.INVISIBLE &&
                iv_2.getVisibility()==View.INVISIBLE &&
                iv_3.getVisibility()==View.INVISIBLE &&
                iv_4.getVisibility()==View.INVISIBLE &&
                iv_5.getVisibility()==View.INVISIBLE &&
                iv_6.getVisibility()==View.INVISIBLE &&
                iv_7.getVisibility()==View.INVISIBLE &&
                iv_8.getVisibility()==View.INVISIBLE &&
                iv_9.getVisibility()==View.INVISIBLE &&
                iv_10.getVisibility()==View.INVISIBLE &&
                iv_11.getVisibility()==View.INVISIBLE &&
                iv_12.getVisibility()==View.INVISIBLE &&
                iv_13.getVisibility()==View.INVISIBLE &&
                iv_14.getVisibility()==View.INVISIBLE &&
                iv_15.getVisibility()==View.INVISIBLE &&
                iv_16.getVisibility()== View.INVISIBLE
                ) {
            AlertDialog.Builder alert= new AlertDialog.Builder(gamepage.this);
            alert.setMessage("GAME OVER\n"+getIntent().getExtras().getString("a")+":"+playpoints+"\n"+getIntent().getExtras().getString("b")+":"+cpupoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent=new Intent(getApplicationContext(),gamepage.class);
                            intent.putExtra("a",getIntent().getExtras().getString("a"));
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();

                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }
    }

}
