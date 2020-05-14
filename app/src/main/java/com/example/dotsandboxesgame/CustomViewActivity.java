package com.example.dotsandboxesgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomViewActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);




    }
}




//        TextView winner = (TextView) findViewById(R.id.winner_text_view);
//        View customview = findViewById(R.id.customview) ;
//        final CustomActivity c = new CustomActivity(this);
//        customview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!c.isFlag()) {
//
//                    int countplayer1 = c.getCountPlayer1();
//                    int countplayer2 = c.getCountPlayer2();
//
//                    TextView winner = (TextView) findViewById(R.id.winner_text_view);
//
//
//                    if(countplayer1>countplayer2)
//                        winner.setText("The Winner is Player 1");
//                    if(countplayer1==countplayer2)
//                        winner.setText("It's a draw");
//                    else
//                        winner.setText("The Winner is Player 2");
//                }
//
//            }
//        });



//
//
//                    if(d>f) {
//                        winner.setText(R.string.winner);
//                    }
//                    else if (d==f) {
//                        winner.setText("It's a draw");
//                    }
//                    else {
//                        winner.setText("The Winner is Player 2");
//                    }
//                    return true;

//        Intent intent = new Intent(CustomViewActivity.this , CustomViewActivity.class) ;
//   startActivity(intent);









//    public void onClick(View v) {
//
//
//        final CustomActivity c = new CustomActivity(this);
//
//        sh = getSharedPreferences("winner" , Context.MODE_PRIVATE);
//
//        int countplayer1 = sh.getInt("player1count" , 1) ;
//        int countplayer2 = sh.getInt("player2count" , 0) ;
//
//        TextView winner = (TextView) findViewById(R.id.winner_text_view);
//
//        if(countplayer1>countplayer2)
//            winner.setText("The Winner is Player 1");
//        else if(countplayer1==countplayer2)
//            winner.setText("It's a draw");
//        else {
//            winner.setText("The Winner is Player 2");
//        }
//
//
//
////        CountDownTimer timer1 = new CountDownTimer(3000 , 10000) {
////            @Override
////            public void onTick(long millisUntilFinished) {
////
////            }
////
////            @Override
////            public void onFinish() {
////                final boolean flag = c.isFlag();
////                if(flag) {
////
////                    final int countplayer1 = c.getCountPlayer1();
////                    final int countplayer2 = c.getCountPlayer2() ;
////                    TextView winner = (TextView) findViewById(R.id.winner_text_view);
////                    if(countplayer1>countplayer2)
////                        winner.setText("The Winner is Player 1");
////                    else if(countplayer1==countplayer2)
////                        winner.setText("It's a draw");
////                    else winner.setText("The Winner is Player 2");
////                }
////
////            }
////        }.start();
//
//
//
//
//
//    }



