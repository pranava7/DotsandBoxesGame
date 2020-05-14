package com.example.dotsandboxesgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer3x3 extends View {

    Animation a = AnimationUtils.loadAnimation(getContext(), R.anim.rotate);

//    CustomViewActivity customViewActivity=(CustomViewActivity)getContext();
//    ImageView img = (ImageView) customViewActivity.findViewById(R.id.imageView);





    ArrayList<Paint> paintArrayList;
    ArrayList<Integer> indexArrayList ;


    MediaPlayer mp;


    Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);



    public boolean flag = false;

    public int countPlayer1 = 0;
    public int countPlayer2 = 0;


    private String str1 = "";
    private String str2 = "";
    private String str3 = "";
    private String str4 = "";
    private String str = "";
    private String strstr = "";


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



    private boolean player1turn = false ;
    private int count1 = 0;
    private int count2 = 0;


    public Computer3x3(Context context) {
        super(context);


        init(null);
    }

    public Computer3x3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }



    private void init(@Nullable AttributeSet set) {


        indexArrayList = new ArrayList<Integer>() ;
        indexArrayList.add(0) ;
        indexArrayList.add(1) ;
        indexArrayList.add(2) ;
        indexArrayList.add(3) ;
        indexArrayList.add(4) ;
        indexArrayList.add(5) ;
        indexArrayList.add(6) ;
        indexArrayList.add(7) ;
        indexArrayList.add(8) ;
        indexArrayList.add(9) ;
        indexArrayList.add(10) ;
        indexArrayList.add(11) ;

        paintArrayList = new ArrayList<Paint>();

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
        paintText = new Paint();
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


        paintArrayList.add(paintRectR11); //0
        paintArrayList.add(paintRectR12);  //1
        paintArrayList.add(paintRectR21);//2
        paintArrayList.add(paintRectR22);//3
        paintArrayList.add(paintRectR31);//4
        paintArrayList.add(paintRectR32);//5
        paintArrayList.add(paintRectC11);//6
        paintArrayList.add(paintRectC12);//7
        paintArrayList.add(paintRectC21);//8
        paintArrayList.add(paintRectC22);//9
        paintArrayList.add(paintRectC31);//10
        paintArrayList.add(paintRectC32);//11

//        indexArrayList.add(0) ;
//        indexArrayList.add(1) ;
//        indexArrayList.add(2) ;
//        indexArrayList.add(3) ;
//        indexArrayList.add(4) ;
//        indexArrayList.add(5) ;
//        indexArrayList.add(6) ;
//        indexArrayList.add(7) ;
//        indexArrayList.add(8) ;
//        indexArrayList.add(9) ;
//        indexArrayList.add(10) ;
//        indexArrayList.add(11) ;

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


        canvas.drawText(str1, getWidth() / 4 + 60, getHeight() / 3 + getWidth() / 4 - 35, paintText);
        canvas.drawText(str2, getWidth() / 2 + 60, getHeight() / 3 + getWidth() / 4 - 35, paintText);
        canvas.drawText(str3, getWidth() / 4 + 60, getHeight() / 3 + getWidth() / 2 - 35, paintText);
        canvas.drawText(str4, getWidth() / 2 + 60, getHeight() / 3 + getWidth() / 2 - 35, paintText);

        canvas.drawText(str, 400, getHeight() / 3 + getWidth() / 2 + getWidth() / 12 + 170, paintwinner);
        canvas.drawText(strstr, 35, getHeight() - 100, paintwinner1);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean value = super.onTouchEvent(event);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                float x = event.getX();
                float y = event.getY();

                if (!player1turn) {

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
                            paintRectC11.setColor(Color.BLUE);
                            postInvalidate();

                            player1turn = true;

                            Object object = 6 ;
                            indexArrayList.remove(object) ;
//                            int index = getRandomElement(indexArrayList) ;
//                            Paint p = paintArrayList.get(index) ;
//                            p.setColor(Color.GREEN) ;
//                            postInvalidate();
//                            Object o = index ;
//                            indexArrayList.remove(o) ;


                        }


                    }


                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= getHeight() / 3 + getWidth() / 4 + circleRadius) {
                            paintRectC21.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 8 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }

                    }

                    if (x > getWidth() / 4 && x < getWidth() / 2) {
                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= getHeight() / 3 + getWidth() / 2 + circleRadius) {
                            paintRectC31.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 10 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }

                    }


                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
                            paintRectC12.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 7 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }
                    }

                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= (getHeight() / 3 + getWidth() / 4) + circleRadius) {
                            paintRectC22.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 9 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }

                    }

                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= (getHeight() / 3 + getWidth() / 2) + circleRadius) {
                            paintRectC32.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 11 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }

                    }


                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR11.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 0 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }
                    }

                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR21.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 2 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }
                    }

                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
                            paintRectR31.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 4 ;
                            indexArrayList.remove(object) ;
                            player1turn = true;

                        }
                    }

                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR12.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 1 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;

                        }
                    }

                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR22.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 3 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }
                    }

                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
                            paintRectR32.setColor(Color.BLUE);
                            postInvalidate();

                            Object object = 5 ;
                            indexArrayList.remove(object) ;

                            player1turn = true;


                        }
                    }


//                else {
//
//                    if (x > getWidth() / 4 && x < getWidth() / 2) {
//                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
//                            paintRectC11.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;}
//
//                    }
//
//                    if (x > getWidth() / 4 && x < getWidth() / 2) {
//                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= getHeight() / 3 + getWidth() / 4 + circleRadius) {
//                            paintRectC21.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//                        }
//
//                    }
//
//                    if (x > getWidth() / 4 && x < getWidth() / 2) {
//                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= getHeight() / 3 + getWidth() / 2 + circleRadius) {
//                            paintRectC31.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//
//                    }
//
//
//                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
//                        if (y >= getHeight() / 3 - circleRadius && y <= getHeight() / 3 + circleRadius) {
//                            paintRectC12.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//                    }
//
//                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
//                        if (y >= (getHeight() / 3 + getWidth() / 4) - circleRadius && y <= (getHeight() / 3 + getWidth() / 4) + circleRadius) {
//                            paintRectC22.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//
//                    }
//
//                    if (x > getWidth() / 2 && x < 3 * (getWidth() / 4)) {
//                        if (y >= (getHeight() / 3 + getWidth() / 2) - circleRadius && y <= (getHeight() / 3 + getWidth() / 2) + circleRadius) {
//                            paintRectC32.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//
//                    }
//
//
//                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
//                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
//                            paintRectR11.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//                    }
//
//                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
//                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
//                            paintRectR21.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//                    }
//
//                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
//                        if (y > getHeight() / 3 && y < getHeight() / 3 + getWidth() / 4) {
//                            paintRectR31.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//                    }
//
//                    if (x > getWidth() / 4 - circleRadius && x < getWidth() / 4 + circleRadius) {
//                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
//                            paintRectR12.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//                    }
//
//                    if (x > getWidth() / 2 - circleRadius && x < getWidth() / 2 + circleRadius) {
//                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
//                            paintRectR22.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//                    }
//
//                    if (x > 3 * getWidth() / 4 - circleRadius && x < 3 * getWidth() / 4 + circleRadius) {
//                        if (y > (getHeight() / 3 + getWidth() / 4) && y < getHeight() / 3 + getWidth() / 2) {
//                            paintRectR32.setColor(Color.GREEN);
//                            postInvalidate();
//                            player1turn = true;
//
//                        }
//                    }
//
//                }


                    if (paintSquare1.getColor() == Color.WHITE) {
                        if (paintRectR11.getColor() != Color.WHITE && paintRectR21.getColor() != Color.WHITE && paintRectC11.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE) {
                            if (player1turn) {
                                paintSquare1.setColor(Color.RED);
                                str1 = "1";
                                postInvalidate();

                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);

                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();

                                count1++;
                            }
                        }
                    }

                    if (paintSquare3.getColor() == Color.WHITE) {
                        if (paintRectR12.getColor() != Color.WHITE && paintRectR22.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE && paintRectC31.getColor() != Color.WHITE) {
                            if (player1turn) {
                                paintSquare3.setColor(Color.RED);
                                str3 = "1";
                                postInvalidate();


                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);

                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();
                                count1++;

                            }
                        }
                    }

                    if (paintSquare4.getColor() == Color.WHITE) {
                        if (paintRectR22.getColor() != Color.WHITE && paintRectR32.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE && paintRectC32.getColor() != Color.WHITE) {
                            if (player1turn) {
                                paintSquare4.setColor(Color.RED);
                                str4 = "1";
                                postInvalidate();

                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);
                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();
                                count1++;
//                            player1turn = true;

                            }
                        }
                    }

                    if (paintSquare2.getColor() == Color.WHITE) {
                        if (paintRectR21.getColor() != Color.WHITE && paintRectR31.getColor() != Color.WHITE && paintRectC12.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE) {
                            if (player1turn) {
                                paintSquare2.setColor(Color.RED);
                                str2 = "1";
                                postInvalidate();

                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);
                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();
                                count1++;
//                            player1turn = true;


                            }
                        }
                    }


                    if (count1 > 0)
                        player1turn = false;
                    if (count2 > 0)
                        player1turn = false;
                    count1 = 0;
                    count2 = 0;


//                    if (paintSquare1.getColor() != Color.WHITE && paintSquare2.getColor() != Color.WHITE &&
//                            paintSquare3.getColor() != Color.WHITE && paintSquare4.getColor() != Color.WHITE) {
//
//                        break;}

                    if (paintSquare1.getColor() != Color.WHITE && paintSquare2.getColor() != Color.WHITE &&
                            paintSquare3.getColor() != Color.WHITE && paintSquare4.getColor() != Color.WHITE) {

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


                        if (countPlayer1 > countPlayer2) {
                            str = countPlayer1 + "-" + countPlayer2;
                            strstr = "YOU WON😊😊😊😊😊";
                        } else if (countPlayer1 == countPlayer2) {
                            str = countPlayer1 + "-" + countPlayer2;
                            strstr = "It's a Draw";
                        } else {
                            str = countPlayer1 + "-" + countPlayer2;
                            strstr = "YOU LOST😢😢😢😢";
                        }

                        postInvalidate();
                        countPlayer1 = 0;
                        countPlayer2 = 0;
                    }


                }


                for (int i = 0 ; i < 3 ; i++) {
                if (player1turn) {
                    int index = getRandomElement(indexArrayList);
                    Paint p = paintArrayList.get(index);
                    p.setColor(Color.GREEN);
                    postInvalidate();
                    Object o = index;
                    indexArrayList.remove(o);
                    player1turn = false;


                    if (paintSquare1.getColor() == Color.WHITE) {
                        if (paintRectR11.getColor() != Color.WHITE && paintRectR21.getColor() != Color.WHITE && paintRectC11.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE) {
                            if (!player1turn) {
                                paintSquare1.setColor(Color.YELLOW);
                                str1 = "2";
                                postInvalidate();
                                flag = true;

                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);

                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();


                                count1++;
//                            player1turn = true;
                            }
                        }
                    }

                    if (paintSquare3.getColor() == Color.WHITE) {
                        if (paintRectR12.getColor() != Color.WHITE && paintRectR22.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE && paintRectC31.getColor() != Color.WHITE) {
                            if (!player1turn) {
                                paintSquare3.setColor(Color.YELLOW);
                                str3 = "2";
                                postInvalidate();
                                flag = true;


                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);

                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();
                                count1++;
//                        player1turn = true;

                            }
                        }
                    }

                    if (paintSquare4.getColor() == Color.WHITE) {
                        if (paintRectR22.getColor() != Color.WHITE && paintRectR32.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE && paintRectC32.getColor() != Color.WHITE) {
                            if (!player1turn) {
                                paintSquare4.setColor(Color.YELLOW);
                                str4 = "2";
                                postInvalidate();
                                flag = true;

                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);
                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();
                                count1++;
//                            player1turn = true;

                            }
                        }
                    }

                    if (paintSquare2.getColor() == Color.WHITE) {
                        if (paintRectR21.getColor() != Color.WHITE && paintRectR31.getColor() != Color.WHITE && paintRectC12.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE) {
                            if (!player1turn) {
                                paintSquare2.setColor(Color.YELLOW);
                                str2 = "2";
                                postInvalidate();
                                flag = true;

                                Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                                v.vibrate(200);
                                mp = MediaPlayer.create(getContext(), R.raw.audio);

                                mp.start();
                                count1++;
//                            player1turn = true;


                            }
                        }
                    }

                    if (count1 > 0)
                        player1turn = true;

                    count1 = 0;
                    count2 = 0;

                    if(!flag) {
                        break;
                    }
//                    if (paintSquare1.getColor() == Color.WHITE && paintSquare2.getColor() == Color.WHITE &&
//                            paintSquare3.getColor() == Color.WHITE && paintSquare4.getColor() == Color.WHITE) {
//                    break;
//                    }

                    if (paintSquare1.getColor() != Color.WHITE && paintSquare2.getColor() != Color.WHITE &&
                            paintSquare3.getColor() != Color.WHITE && paintSquare4.getColor() != Color.WHITE) {

                        break ;}


                    }
                    if (paintSquare1.getColor() != Color.WHITE && paintSquare2.getColor() != Color.WHITE &&
                            paintSquare3.getColor() != Color.WHITE && paintSquare4.getColor() != Color.WHITE) {

                        break ;}

            }

return true;
            }








            case MotionEvent.ACTION_UP: {

                if (paintSquare1.getColor() != Color.WHITE && paintSquare2.getColor() != Color.WHITE &&
                        paintSquare3.getColor() != Color.WHITE && paintSquare4.getColor() != Color.WHITE) {

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


                    if (countPlayer1 > countPlayer2) {
                        str = countPlayer1 + "-" + countPlayer2;
                        strstr = "YOU WON😊😊😊😊😊";
                    } else if (countPlayer1 == countPlayer2) {
                        str = countPlayer1 + "-" + countPlayer2;
                        strstr = "It's a Draw";
                    } else {
                        str = countPlayer1 + "-" + countPlayer2;
                        strstr = "YOU LOST😢😢😢😢";
                    }

                    postInvalidate();
                    countPlayer1 = 0;
                    countPlayer2 = 0;
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

    public int getRandomElement(List<Integer> divisors) {
        Random rand = new Random();
        return divisors.get(rand.nextInt(divisors.size()));
    }
}

