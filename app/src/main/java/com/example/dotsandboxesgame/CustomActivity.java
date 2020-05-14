package com.example.dotsandboxesgame;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class CustomActivity extends View {




    Animation a = AnimationUtils.loadAnimation(getContext(),R.anim.rotate);

//    CustomViewActivity customViewActivity=(CustomViewActivity)getContext();
//    ImageView img = (ImageView) customViewActivity.findViewById(R.id.imageView);





    MediaPlayer mp;


    Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);


    private Context mcontext;

    public boolean flag = false;

    public int countPlayer1 = 0;
    public int countPlayer2 = 0;


    private String str1="";
    private String str2="";
    private String str3="";
    private String str4="";
    private String str="";
    private String strstr="";


    private Paint paintwinner;
    private Paint paintwinner1;
    private Paint paintText;
    private Paint paintCircle;
    private Paint paintRectR11;
    private Paint paintRectR12;
    private Paint paintRectR21;
    private Paint paintRectR22;
    private Paint paintRectR31;
    private Paint paintRectR32;
    private Paint paintRectC11;
    private Paint paintRectC12;
    private Paint paintRectC21;
    private Paint paintRectC22;
    private Paint paintRectC31;
    private Paint paintRectC32;

    private Paint paintSquare1;
    private Paint paintSquare2;
    private Paint paintSquare3;
    private Paint paintSquare4;

    private int circleRadius = 40;

    private Rect rect;
    private Point point;

    private boolean player1turn = true;
    private int count1 = 0;
    private int count2 = 0;


    public CustomActivity(Context context) {
        super(context);


        init(null);
    }

    public CustomActivity(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }


    private void init(@Nullable AttributeSet set) {



//        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View Custmv = inflater.inflate(R.layout.activity_custom , null );
//
//        ImageView img = (ImageView) findViewById(R.id.imageView) ;
//
//        img.setVisibility(INVISIBLE);


        paintCircle = new Paint();
        paintCircle.setAntiAlias(true);
        paintCircle.setColor(Color.BLACK);

        paintwinner = new Paint();
        paintwinner.setAntiAlias(true);
        paintwinner.setTextSize(175);

        paintwinner1 = new Paint();
        paintwinner1.setAntiAlias(true);
        paintwinner1.setTextSize(98);
        paintwinner1.setStyle(Paint.Style.FILL_AND_STROKE);
        paintText = new Paint() ;
        paintText.setTextSize(255);

        paintSquare1 = new Paint();
        paintSquare2 = new Paint();
        paintSquare3 = new Paint();
        paintSquare4 = new Paint();

        paintSquare1.setColor(Color.WHITE);
        paintSquare2.setColor(Color.WHITE);
        paintSquare3.setColor(Color.WHITE);
        paintSquare4.setColor(Color.WHITE);


        paintRectR11 = new Paint();
        paintRectR12 = new Paint();
        paintRectR21 = new Paint();
        paintRectR22 = new Paint();
        paintRectR31 = new Paint();
        paintRectR32 = new Paint();
        paintRectC11 = new Paint();
        paintRectC12 = new Paint();
        paintRectC21 = new Paint();
        paintRectC22 = new Paint();
        paintRectC31 = new Paint();
        paintRectC32 = new Paint();

        paintRectR11.setAntiAlias(true);
        paintRectR12.setAntiAlias(true);
        paintRectR21.setAntiAlias(true);
        paintRectR22.setAntiAlias(true);
        paintRectR31.setAntiAlias(true);
        paintRectR32.setAntiAlias(true);
        paintRectC11.setAntiAlias(true);
        paintRectC12.setAntiAlias(true);
        paintRectC21.setAntiAlias(true);
        paintRectC22.setAntiAlias(true);
        paintRectC31.setAntiAlias(true);
        paintRectC32.setAntiAlias(true);


        paintRectR11.setColor(Color.WHITE);
        paintRectR12.setColor(Color.WHITE);
        paintRectR21.setColor(Color.WHITE);
        paintRectR22.setColor(Color.WHITE);
        paintRectR31.setColor(Color.WHITE);
        paintRectR32.setColor(Color.WHITE);
        paintRectC11.setColor(Color.WHITE);
        paintRectC12.setColor(Color.WHITE);
        paintRectC21.setColor(Color.WHITE);
        paintRectC22.setColor(Color.WHITE);
        paintRectC31.setColor(Color.WHITE);
        paintRectC32.setColor(Color.WHITE);


    }


    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);


//        img.setVisibility(INVISIBLE);

        canvas.drawColor(Color.WHITE);

        canvas.drawRect(getWidth() / 4, getHeight() / 3, getWidth() / 2, getHeight() / 3 + getWidth() / 4, paintSquare1);
        canvas.drawRect(getWidth() / 2, getHeight() / 3, 3 * getWidth() / 4, getHeight() / 3 + getWidth() / 4, paintSquare2);
        canvas.drawRect(getWidth() / 4, getHeight() / 3 + getWidth() / 4, getWidth() / 2, getHeight() / 3 + getWidth() / 2, paintSquare3);
        canvas.drawRect(getWidth() / 2, getHeight() / 3 + getWidth() / 4, 3 * getWidth() / 4, getHeight() / 3 + getWidth() / 2, paintSquare4);




        canvas.drawRect(getWidth() / 4 - circleRadius, getHeight() / 3, getWidth() / 4 + circleRadius, getHeight() / 3 + (getWidth() / 4), paintRectR11);
        canvas.drawRect(getWidth() / 2 - circleRadius, getHeight() / 3, getWidth() / 2 + circleRadius, getHeight() / 3 + (getWidth() / 4), paintRectR21);
        canvas.drawRect(3 * (getWidth() / 4) - circleRadius, getHeight() / 3, 3 * (getWidth() / 4) + circleRadius, getHeight() / 3 + (getWidth() / 4), paintRectR31);

        canvas.drawRect(getWidth() / 4 - circleRadius, getHeight() / 3 + (getWidth() / 4), getWidth() / 4 + circleRadius, getHeight() / 3 + (getWidth() / 2), paintRectR12);
        canvas.drawRect(getWidth() / 2 - circleRadius, getHeight() / 3 + (getWidth() / 4), getWidth() / 2 + circleRadius, getHeight() / 3 + (getWidth() / 2), paintRectR22);
        canvas.drawRect(3 * (getWidth() / 4) - circleRadius, getHeight() / 3 + (getWidth() / 4), 3 * (getWidth() / 4) + circleRadius, getHeight() / 3 + (getWidth() / 2), paintRectR32);




        canvas.drawRect(getWidth() / 4, getHeight() / 3 - circleRadius, getWidth() / 4 + getWidth() / 4, getHeight() / 3 + circleRadius, paintRectC11);
        canvas.drawRect(getWidth() / 4, (getHeight() / 3 + getWidth() / 4) - circleRadius, getWidth() / 4 + getWidth() / 4, (getHeight() / 3 + getWidth() / 4) + circleRadius, paintRectC21);
        canvas.drawRect(getWidth() / 4, (getHeight() / 3 + getWidth() / 2) - circleRadius, getWidth() / 4 + getWidth() / 4, (getHeight() / 3 + getWidth() / 2) + circleRadius, paintRectC31);

        canvas.drawRect(getWidth() / 2, getHeight() / 3 - circleRadius, getWidth() / 2 + getWidth() / 4, getHeight() / 3 + circleRadius, paintRectC12);
        canvas.drawRect(getWidth() / 2, (getHeight() / 3 + getWidth() / 4) - circleRadius, getWidth() / 2 + getWidth() / 4, (getHeight() / 3 + getWidth() / 4) + circleRadius, paintRectC22);
        canvas.drawRect(getWidth() / 2, (getHeight() / 3 + getWidth() / 2) - circleRadius, getWidth() / 2 + getWidth() / 4, (getHeight() / 3 + getWidth() / 2) + circleRadius, paintRectC32);




        for (int j = getWidth() / 4; j < getWidth(); j += getWidth() / 4) {
            canvas.drawCircle(j, getHeight() / 3, circleRadius, paintCircle);
            canvas.drawCircle(j, (getHeight() / 3) + (getWidth() / 4), circleRadius, paintCircle);
            canvas.drawCircle(j, (getHeight() / 3) + (getWidth() / 2), circleRadius, paintCircle);
        }
































        canvas.drawText(str1 , getWidth()/4+60, getHeight()/3 + getWidth()/4-35 , paintText);
        canvas.drawText(str2 , getWidth()/2+60, getHeight()/3 + getWidth()/4-35 , paintText);
        canvas.drawText(str3, getWidth()/4+60, getHeight()/3 + getWidth()/2-35 , paintText);
        canvas.drawText(str4 , getWidth()/2+60, getHeight()/3 + getWidth()/2-35 , paintText);

        canvas.drawText(str,400,getHeight()/3+getWidth()/2+getWidth()/12+170,paintwinner);
        canvas.drawText(strstr,35,getHeight()-100,paintwinner1);



















    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean value = super.onTouchEvent(event);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                float x = event.getX();
                float y = event.getY();

                if (player1turn) {

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
                            paintRectC11.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }

                    }

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= getHeight() / 3 + getWidth() / 4 + circleRadius) {
                            paintRectC21.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }

                    }

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= getHeight() / 3 + getWidth() / 2 + circleRadius) {
                            paintRectC31.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }

                    }


                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
                            paintRectC12.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }
                    }

                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= (getHeight() / 3 + getWidth() / 4) + circleRadius) {
                            paintRectC22.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }

                    }

                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= (getHeight() / 3 + getWidth() / 2) + circleRadius) {
                            paintRectC32.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }

                    }


                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR11.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }
                    }

                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR21.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }
                    }

                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR31.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }
                    }

                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR12.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }
                    }

                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR22.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }
                    }

                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR32.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;

                        }
                    }

                }


                else {

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
                            paintRectC11.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;}

                    }

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= getHeight() / 3 + getWidth() / 4 + circleRadius) {
                            paintRectC21.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                        }

                    }

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= getHeight() / 3 + getWidth() / 2 + circleRadius) {
                            paintRectC31.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }

                    }


                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
                            paintRectC12.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }
                    }

                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= (getHeight() / 3 + getWidth() / 4) + circleRadius) {
                            paintRectC22.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }

                    }

                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= (getHeight() / 3 + getWidth() / 2) + circleRadius) {
                            paintRectC32.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }

                    }


                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR11.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }
                    }

                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR21.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }
                    }

                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR31.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }
                    }

                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR12.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }
                    }

                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR22.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }
                    }

                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR32.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;

                        }
                    }

                }


                if (paintSquare1.getColor() == Color.WHITE) {
                    if (paintRectR11.getColor() != Color.WHITE && paintRectR21.getColor() != Color.WHITE && paintRectC11.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare1.setColor(Color.RED);
                            str1="1";
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);

                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();


//                            img.setVisibility(VISIBLE);
////                            Animation a = AnimationUtils.loadAnimation(CustomActivity.this,R.anim.fadein);
//                            img.startAnimation(a);

//                            postInvalidate();
//




                            count1++;
//                            player1turn = true;
                        } else {
                            paintSquare1.setColor(Color.YELLOW);
                            str1="2";
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);

                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count2++;
//                            player1turn = false;

                        }
                    }
                }

                if (paintSquare3.getColor() == Color.WHITE) {
                    if (paintRectR12.getColor() != Color.WHITE && paintRectR22.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE && paintRectC31.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare3.setColor(Color.RED);
                            str3="1";
                            postInvalidate();


                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);

                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                        player1turn = true;

                        } else {
                            paintSquare3.setColor(Color.YELLOW);
                            str3="2";
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count2++;
//                        player1turn = false;

                        }
                    }
                }

                if (paintSquare4.getColor() == Color.WHITE) {
                    if (paintRectR22.getColor() != Color.WHITE && paintRectR32.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE && paintRectC32.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare4.setColor(Color.RED);
                            str4="1";
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;

                        } else {
                            paintSquare4.setColor(Color.YELLOW);
                            str4="2";
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count2++;
//                            player1turn = false;

                        }
                    }
                }

                if (paintSquare2.getColor() == Color.WHITE) {
                    if (paintRectR21.getColor() != Color.WHITE && paintRectR31.getColor() != Color.WHITE && paintRectC12.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare2.setColor(Color.RED);
                            str2="1";
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare2.setColor(Color.YELLOW);
                            str2="2";
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count2++;
//                            player1turn = false;

                        }
                    }
                }

                if (count1 > 0)
                    player1turn = true;
                if (count2 > 0)
                    player1turn = false;
                count1 = 0;
                count2 = 0;



                return true;
            }

            case MotionEvent.ACTION_UP: {

                if (paintSquare1.getColor() != Color.WHITE && paintSquare2.getColor() != Color.WHITE &&
                        paintSquare3.getColor() != Color.WHITE && paintSquare4.getColor() != Color.WHITE) {
                    flag = true;
                    if (paintSquare1.getColor() == Color.RED) {
                        countPlayer1++;
                    } else
                        countPlayer2++;

                    if (paintSquare2.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare3.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare4.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;



                    if(countPlayer1>countPlayer2)
                    {
                        str=countPlayer1 + "-" + countPlayer2;
                        strstr="Winner:\nPlayer1";
                    }
                    else if (countPlayer1==countPlayer2)
                    {
                        str = countPlayer1 + "-" + countPlayer2 ;
                        strstr = "It's a Draw" ;
                    }
                   else {
                        str=countPlayer1 + "-" + countPlayer2  ;
                       strstr="Winner:\nPlayer2";}

                   postInvalidate();
                   countPlayer1=0;
                   countPlayer2=0;
                }

                return true;
            }

        }

        return value;
    }



    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mp != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mp.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mp = null;

//            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener) ;
        }
    }


}

