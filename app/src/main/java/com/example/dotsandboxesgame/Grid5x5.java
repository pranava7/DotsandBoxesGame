package com.example.dotsandboxesgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Grid5x5 extends View {

    private int index = 0;
    private int count1 = 0;
    private int count2 = 0;
    private int countPlayer1 = 0;
    private int countPlayer2 = 0;
    private boolean flag = false;
    private String str="";
    private String strstr="";

    private MediaPlayer mp;

    private Paint paintwinner;
    private Paint paintwinner1;

    private int circleradius = 20;
    private Paint paintcircle;
    private Paint paintRectR11;
    private Paint paintRectR12;
    private Paint paintRectR13;
    private Paint paintRectR14;
    private Paint paintRectR21;
    private Paint paintRectR22;
    private Paint paintRectR23;
    private Paint paintRectR24;
    private Paint paintRectR31;
    private Paint paintRectR32;
    private Paint paintRectR33;
    private Paint paintRectR34;
    private Paint paintRectR41;
    private Paint paintRectR42;
    private Paint paintRectR43;
    private Paint paintRectR44;
    private Paint paintRectR51;
    private Paint paintRectR52;
    private Paint paintRectR53;
    private Paint paintRectR54;
    private Paint paintRectC11;
    private Paint paintRectC12;
    private Paint paintRectC13;
    private Paint paintRectC14;
    private Paint paintRectC21;
    private Paint paintRectC22;
    private Paint paintRectC23;
    private Paint paintRectC24;
    private Paint paintRectC31;
    private Paint paintRectC32;
    private Paint paintRectC33;
    private Paint paintRectC34;
    private Paint paintRectC41;
    private Paint paintRectC42;
    private Paint paintRectC43;
    private Paint paintRectC44;
    private Paint paintRectC51;
    private Paint paintRectC52;
    private Paint paintRectC53;
    private Paint paintRectC54;

    private Paint paintSquare1;
    private Paint paintSquare2;
    private Paint paintSquare3;
    private Paint paintSquare4;
    private Paint paintSquare5;
    private Paint paintSquare6;
    private Paint paintSquare7;
    private Paint paintSquare8;
    private Paint paintSquare9;
    private Paint paintSquare10;
    private Paint paintSquare11;
    private Paint paintSquare12;
    private Paint paintSquare13;
    private Paint paintSquare14;
    private Paint paintSquare15;
    private Paint paintSquare16;

    private boolean player1turn = true;


    private Paint paintRect;
    private ArrayList<Paint> paintrectlist;


    public Grid5x5(Context context) {
        super(context);
        init(null);
    }

    public Grid5x5(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {
        paintcircle = new Paint();
        paintcircle.setAntiAlias(true);
        paintcircle.setColor(Color.BLACK);
        paintrectlist = new ArrayList<Paint>();

        paintwinner= new Paint();
        paintwinner1= new Paint();
        paintwinner.setTextSize(170);

        paintwinner1.setTextSize(98);
        paintwinner1.setStyle(Paint.Style.STROKE);


        paintRectR11 = new Paint();
        paintRectR12 = new Paint();
        paintRectR13 = new Paint();
        paintRectR14 = new Paint();
        paintRectR21 = new Paint();
        paintRectR22 = new Paint();
        paintRectR23 = new Paint();
        paintRectR24 = new Paint();
        paintRectR31 = new Paint();
        paintRectR32 = new Paint();
        paintRectR33 = new Paint();
        paintRectR34 = new Paint();
        paintRectR41 = new Paint();
        paintRectR42 = new Paint();
        paintRectR43 = new Paint();
        paintRectR44 = new Paint();
        paintRectR51 = new Paint();
        paintRectR52 = new Paint();
        paintRectR53 = new Paint();
        paintRectR54 = new Paint();
        paintRectC51 = new Paint();
        paintRectC52 = new Paint();
        paintRectC53 = new Paint();
        paintRectC54 = new Paint();
        paintRectC11 = new Paint();
        paintRectC12 = new Paint();
        paintRectC13 = new Paint();
        paintRectC14 = new Paint();
        paintRectC21 = new Paint();
        paintRectC22 = new Paint();
        paintRectC23 = new Paint();
        paintRectC24 = new Paint();
        paintRectC31 = new Paint();
        paintRectC32 = new Paint();
        paintRectC33 = new Paint();
        paintRectC34 = new Paint();
        paintRectC41 = new Paint();
        paintRectC42 = new Paint();
        paintRectC43 = new Paint();
        paintRectC44 = new Paint();


        paintSquare1 = new Paint();
        paintSquare2 = new Paint();
        paintSquare3 = new Paint();
        paintSquare4 = new Paint();
        paintSquare5 = new Paint();
        paintSquare6 = new Paint();
        paintSquare7 = new Paint();
        paintSquare8 = new Paint();
        paintSquare9 = new Paint();
        paintSquare10 = new Paint();
        paintSquare11 = new Paint();
        paintSquare12 = new Paint();
        paintSquare13 = new Paint();
        paintSquare14 = new Paint();
        paintSquare15 = new Paint();
        paintSquare16 = new Paint();


        paintSquare1.setColor(Color.WHITE);
        paintSquare2.setColor(Color.WHITE);
        paintSquare3.setColor(Color.WHITE);
        paintSquare4.setColor(Color.WHITE);
        paintSquare5.setColor(Color.WHITE);
        paintSquare6.setColor(Color.WHITE);
        paintSquare7.setColor(Color.WHITE);
        paintSquare8.setColor(Color.WHITE);
        paintSquare9.setColor(Color.WHITE);
        paintSquare10.setColor(Color.WHITE);
        paintSquare11.setColor(Color.WHITE);
        paintSquare12.setColor(Color.WHITE);
        paintSquare13.setColor(Color.WHITE);
        paintSquare14.setColor(Color.WHITE);
        paintSquare15.setColor(Color.WHITE);
        paintSquare16.setColor(Color.WHITE);


        paintRectR11.setColor(Color.WHITE);
        paintRectR12.setColor(Color.WHITE);
        paintRectR13.setColor(Color.WHITE);
        paintRectR14.setColor(Color.WHITE);
        paintRectR21.setColor(Color.WHITE);
        paintRectR22.setColor(Color.WHITE);
        paintRectR23.setColor(Color.WHITE);
        paintRectR24.setColor(Color.WHITE);
        paintRectR31.setColor(Color.WHITE);
        paintRectR32.setColor(Color.WHITE);
        paintRectR33.setColor(Color.WHITE);
        paintRectR34.setColor(Color.WHITE);
        paintRectR41.setColor(Color.WHITE);
        paintRectR42.setColor(Color.WHITE);
        paintRectR43.setColor(Color.WHITE);
        paintRectR44.setColor(Color.WHITE);
        paintRectC11.setColor(Color.WHITE);
        paintRectC12.setColor(Color.WHITE);
        paintRectC13.setColor(Color.WHITE);
        paintRectC14.setColor(Color.WHITE);
        paintRectC21.setColor(Color.WHITE);
        paintRectC22.setColor(Color.WHITE);
        paintRectC23.setColor(Color.WHITE);
        paintRectC24.setColor(Color.WHITE);
        paintRectC31.setColor(Color.WHITE);
        paintRectC32.setColor(Color.WHITE);
        paintRectC33.setColor(Color.WHITE);
        paintRectC34.setColor(Color.WHITE);
        paintRectC41.setColor(Color.WHITE);
        paintRectC42.setColor(Color.WHITE);
        paintRectC43.setColor(Color.WHITE);
        paintRectC44.setColor(Color.WHITE);
        paintRectC51.setColor(Color.WHITE);
        paintRectC52.setColor(Color.WHITE);
        paintRectC53.setColor(Color.WHITE);
        paintRectC54.setColor(Color.WHITE);
        paintRectR51.setColor(Color.WHITE);
        paintRectR52.setColor(Color.WHITE);
        paintRectR53.setColor(Color.WHITE);
        paintRectR54.setColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        // canvas.drawCircle(getWidth()/6,getHeight()/6,circleradius,paintcircle);

        paintrectlist.add(paintRectR11);
        paintrectlist.add(paintRectR12);
        paintrectlist.add(paintRectR13);
        paintrectlist.add(paintRectR14);
        paintrectlist.add(paintRectR21);
        paintrectlist.add(paintRectR22);
        paintrectlist.add(paintRectR23);
        paintrectlist.add(paintRectR24);
        paintrectlist.add(paintRectR31);
        paintrectlist.add(paintRectR32);
        paintrectlist.add(paintRectR33);
        paintrectlist.add(paintRectR34);
        paintrectlist.add(paintRectR41);
        paintrectlist.add(paintRectR42);
        paintrectlist.add(paintRectR43);
        paintrectlist.add(paintRectR44);

        paintrectlist.add(paintRectR51);
        paintrectlist.add(paintRectR52);
        paintrectlist.add(paintRectR53);
        paintrectlist.add(paintRectR54);


        paintrectlist.add(paintRectC11);
        paintrectlist.add(paintRectC12);
        paintrectlist.add(paintRectC13);
        paintrectlist.add(paintRectC14);
        paintrectlist.add(paintRectC21);
        paintrectlist.add(paintRectC22);
        paintrectlist.add(paintRectC23);
        paintrectlist.add(paintRectC24);
        paintrectlist.add(paintRectC31);
        paintrectlist.add(paintRectC32);
        paintrectlist.add(paintRectC33);
        paintrectlist.add(paintRectC34);
        paintrectlist.add(paintRectC41);
        paintrectlist.add(paintRectC42);
        paintrectlist.add(paintRectC43);
        paintrectlist.add(paintRectC44);


        paintrectlist.add(paintRectC51);
        paintrectlist.add(paintRectC52);
        paintrectlist.add(paintRectC53);
        paintrectlist.add(paintRectC54);


        canvas.drawRect(getWidth() / 6, getHeight() / 6, getWidth() / 3, getHeight() / 6 + getWidth() / 6, paintSquare1);
        canvas.drawRect(getWidth() / 3, getHeight() / 6, getWidth() / 2, getHeight() / 6 + getWidth() / 6, paintSquare2);
        canvas.drawRect(getWidth() / 2, getHeight() / 6, 4 * getWidth() / 6, getHeight() / 6 + getWidth() / 6, paintSquare3);
        canvas.drawRect(4 * getWidth() / 6, getHeight() / 6, 5 * getWidth() / 6, getHeight() / 6 + getWidth() / 6, paintSquare4);


        canvas.drawRect(getWidth() / 6, getHeight() / 6 + getWidth() / 6, getWidth() / 3, getHeight() / 6 + getWidth() / 3, paintSquare5);
        canvas.drawRect(getWidth() / 3, getHeight() / 6 + getWidth() / 6, getWidth() / 2, getHeight() / 6 + getWidth() / 3, paintSquare6);
        canvas.drawRect(getWidth() / 2, getHeight() / 6 + getWidth() / 6, 4 * getWidth() / 6, getHeight() / 6 + getWidth() / 3, paintSquare7);
        canvas.drawRect(4 * getWidth() / 6, getHeight() / 6 + getWidth() / 6, 5 * getWidth() / 6, getHeight() / 6 + getWidth() / 3, paintSquare8);

        canvas.drawRect(getWidth() / 6, getHeight() / 6 + getWidth() / 3, getWidth() / 3, getHeight() / 6 + getWidth() / 2, paintSquare9);
        canvas.drawRect(getWidth() / 3, getHeight() / 6 + getWidth() / 3, getWidth() / 2, getHeight() / 6 + getWidth() / 2, paintSquare10);
        canvas.drawRect(getWidth() / 2, getHeight() / 6 + getWidth() / 3, 4 * getWidth() / 6, getHeight() / 6 + getWidth() / 2, paintSquare11);
        canvas.drawRect(4 * getWidth() / 6, getHeight() / 6 + getWidth() / 3, 5 * getWidth() / 6, getHeight() / 6 + getWidth() / 2, paintSquare12);

        canvas.drawRect(getWidth() / 6, getHeight() / 6 + getWidth() / 2, getWidth() / 3, getHeight() / 6 + 4 * getWidth() / 6, paintSquare13);
        canvas.drawRect(getWidth() / 3, getHeight() / 6 + getWidth() / 2, getWidth() / 2, getHeight() / 6 + 4 * getWidth() / 6, paintSquare14);
        canvas.drawRect(getWidth() / 2, getHeight() / 6 + getWidth() / 2, 4 * getWidth() / 6, getHeight() / 6 + 4 * getWidth() / 6, paintSquare15);
        canvas.drawRect(4 * getWidth() / 6, getHeight() / 6 + getWidth() / 2, 5 * getWidth() / 6, getHeight() / 6 + 4 * getWidth() / 6, paintSquare16);


        for (int j = getWidth() / 6; j <= 5 * getWidth() / 6; j += getWidth() / 6) {
            for (int i = getHeight() / 6; i <= getHeight() / 6 + getWidth() / 2; i += getWidth() / 6) {
                canvas.drawRect(j - circleradius, i, j + circleradius, i + getWidth() / 6, paintrectlist.get(index++));

            }
        }


        for (int i = getHeight() / 6; i <= getHeight() / 6 + 2 * getWidth() / 3; i += getWidth() / 6) {
            for (int j = getWidth() / 6; j < 5 * getWidth() / 6; j += getWidth() / 6) {
                canvas.drawRect(j, i - circleradius, j + getWidth() / 6, i + circleradius, paintrectlist.get(index++));


            }
        }
        index = 0;

        for (int j = getWidth() / 6; j < getWidth(); j += getWidth() / 6) {
            for (int i = getHeight() / 6; i < (getHeight() / 2 + getWidth() / 6); i += getWidth() / 6) {
                canvas.drawCircle(j, i, circleradius, paintcircle);
            }
        }





        canvas.drawText(str,getWidth()/2,getHeight()/6+5*getWidth()/6,paintwinner);
        canvas.drawText(strstr,0,getHeight(),paintwinner1);









    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean value = super.onTouchEvent(event);

        switch (event.getAction()) {
            case (MotionEvent.ACTION_DOWN): {
                float x = event.getX();
                float y = event.getY();

                if (player1turn) {
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR11.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR12.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR13.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR14.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR21.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR22.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR23.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR24.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR31.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR32.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR33.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR34.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }


                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR41.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR42.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR43.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR44.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }


                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR51.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR52.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR53.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR54.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC11.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC12.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > getWidth() / 2 && x < 4 * getWidth() / 6) {
                            paintRectC13.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC14.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC21.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC22.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 2 && x < 4 * getWidth() / 6) {
                            paintRectC23.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC24.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC31.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC32.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > getWidth() / 2 && x < 4 * getWidth() / 6) {
                            paintRectC33.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC34.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC41.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC42.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > getWidth() / 2 && x < 2 * getWidth() / 3) {
                            paintRectC43.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC44.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC51.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC52.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 2 && x < 2 * getWidth() / 3) {
                            paintRectC53.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC54.setColor(Color.BLUE);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }

                }


                if (!player1turn) {
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR11.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR12.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR13.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 6 - circleradius && x < getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR14.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR21.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR22.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR23.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 3 - circleradius && x < getWidth() / 3 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR24.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR31.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR32.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR33.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (x > getWidth() / 2 - circleradius && x < getWidth() / 2 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR34.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }


                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR41.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR42.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR43.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                    if (x > 4 * getWidth() / 6 - circleradius && x < 4 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR44.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }


                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 && y < getHeight() / 6 + getWidth() / 6) {
                            paintRectR51.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 6 && y < getHeight() / 6 + getWidth() / 3) {
                            paintRectR52.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 3 && y < getHeight() / 6 + getWidth() / 2) {
                            paintRectR53.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                    if (x > 5 * getWidth() / 6 - circleradius && x < 5 * getWidth() / 6 + circleradius) {
                        if (y > getHeight() / 6 + getWidth() / 2 && y < getHeight() / 6 + 4 * getWidth() / 6) {
                            paintRectR54.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC11.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC12.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > getWidth() / 2 && x < 4 * getWidth() / 6) {
                            paintRectC13.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 - circleradius && y < getHeight() / 6 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC14.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC21.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC22.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 2 && x < 4 * getWidth() / 6) {
                            paintRectC23.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 6 - circleradius && y < getHeight() / 6 + getWidth() / 6 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC24.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC31.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC32.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > getWidth() / 2 && x < 4 * getWidth() / 6) {
                            paintRectC33.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 3 - circleradius && y < getHeight() / 6 + getWidth() / 3 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC34.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC41.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC42.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > getWidth() / 2 && x < 2 * getWidth() / 3) {
                            paintRectC43.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + getWidth() / 2 - circleradius && y < getHeight() / 6 + getWidth() / 2 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC44.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = false;
                            return true;
                        }
                    }


                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 6 && x < getWidth() / 3) {
                            paintRectC51.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 3 && x < getWidth() / 2) {
                            paintRectC52.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > getWidth() / 2 && x < 2 * getWidth() / 3) {
                            paintRectC53.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }
                    if (y > getHeight() / 6 + 4 * getWidth() / 6 - circleradius && y < getHeight() / 6 + 4 * getWidth() / 6 + circleradius) {
                        if (x > 4 * getWidth() / 6 && x < 5 * getWidth() / 6) {
                            paintRectC54.setColor(Color.GREEN);
                            postInvalidate();
                            player1turn = true;
                            return true;
                        }
                    }

                }
            }

            case (MotionEvent.ACTION_UP): {
                float x = event.getX();
                float y = event.getY();


                if (paintSquare1.getColor() == Color.WHITE) {
                    if (paintRectR11.getColor() != Color.WHITE && paintRectR21.getColor() != Color.WHITE && paintRectC11.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare1.setColor(Color.RED);
                            postInvalidate();
                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);

                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;


                        } else {
                            paintSquare1.setColor(Color.YELLOW);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count2++;

                        }
                    }
                }

                if (paintSquare2.getColor() == Color.WHITE) {
                    if (paintRectR21.getColor() != Color.WHITE && paintRectR31.getColor() != Color.WHITE && paintRectC12.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare2.setColor(Color.RED);
                            postInvalidate();
                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare2.setColor(Color.YELLOW);
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
                    if (paintRectR31.getColor() != Color.WHITE && paintRectR41.getColor() != Color.WHITE && paintRectC13.getColor() != Color.WHITE && paintRectC23.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare3.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare3.setColor(Color.YELLOW);
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

                if (paintSquare4.getColor() == Color.WHITE) {
                    if (paintRectR41.getColor() != Color.WHITE && paintRectR51.getColor() != Color.WHITE && paintRectC14.getColor() != Color.WHITE && paintRectC24.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare4.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare4.setColor(Color.YELLOW);
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

                if (paintSquare5.getColor() == Color.WHITE) {
                    if (paintRectR12.getColor() != Color.WHITE && paintRectR22.getColor() != Color.WHITE && paintRectC21.getColor() != Color.WHITE && paintRectC31.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare5.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare5.setColor(Color.YELLOW);
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

                if (paintSquare6.getColor() == Color.WHITE) {
                    if (paintRectR22.getColor() != Color.WHITE && paintRectR32.getColor() != Color.WHITE && paintRectC22.getColor() != Color.WHITE && paintRectC32.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare6.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare6.setColor(Color.YELLOW);
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

                if (paintSquare7.getColor() == Color.WHITE) {
                    if (paintRectR42.getColor() != Color.WHITE && paintRectR32.getColor() != Color.WHITE && paintRectC23.getColor() != Color.WHITE && paintRectC33.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare7.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare7.setColor(Color.YELLOW);
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

                if (paintSquare8.getColor() == Color.WHITE) {
                    if (paintRectR42.getColor() != Color.WHITE && paintRectR52.getColor() != Color.WHITE && paintRectC24.getColor() != Color.WHITE && paintRectC34.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare8.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare8.setColor(Color.YELLOW);
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

                if (paintSquare9.getColor() == Color.WHITE) {
                    if (paintRectR13.getColor() != Color.WHITE && paintRectR23.getColor() != Color.WHITE && paintRectC31.getColor() != Color.WHITE && paintRectC41.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare9.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare9.setColor(Color.YELLOW);
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

                if (paintSquare10.getColor() == Color.WHITE) {
                    if (paintRectR33.getColor() != Color.WHITE && paintRectR23.getColor() != Color.WHITE && paintRectC32.getColor() != Color.WHITE && paintRectC42.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare10.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare10.setColor(Color.YELLOW);
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

                if (paintSquare11.getColor() == Color.WHITE) {
                    if (paintRectR33.getColor() != Color.WHITE && paintRectR43.getColor() != Color.WHITE && paintRectC33.getColor() != Color.WHITE && paintRectC43.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare11.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare11.setColor(Color.YELLOW);
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
                if (paintSquare12.getColor() == Color.WHITE) {
                    if (paintRectR43.getColor() != Color.WHITE && paintRectR53.getColor() != Color.WHITE && paintRectC34.getColor() != Color.WHITE && paintRectC44.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare12.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare12.setColor(Color.YELLOW);
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

                if (paintSquare13.getColor() == Color.WHITE) {
                    if (paintRectR14.getColor() != Color.WHITE && paintRectR24.getColor() != Color.WHITE && paintRectC41.getColor() != Color.WHITE && paintRectC51.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare13.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare13.setColor(Color.YELLOW);
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

                if (paintSquare14.getColor() == Color.WHITE) {
                    if (paintRectR34.getColor() != Color.WHITE && paintRectR24.getColor() != Color.WHITE && paintRectC42.getColor() != Color.WHITE && paintRectC52.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare14.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare14.setColor(Color.YELLOW);
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
                if (paintSquare15.getColor() == Color.WHITE) {
                    if (paintRectR34.getColor() != Color.WHITE && paintRectR44.getColor() != Color.WHITE && paintRectC43.getColor() != Color.WHITE && paintRectC53.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare15.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare15.setColor(Color.YELLOW);
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

                if (paintSquare16.getColor() == Color.WHITE) {
                    if (paintRectR44.getColor() != Color.WHITE && paintRectR54.getColor() != Color.WHITE && paintRectC44.getColor() != Color.WHITE && paintRectC54.getColor() != Color.WHITE) {
                        if (!player1turn) {
                            paintSquare16.setColor(Color.RED);
                            postInvalidate();

                            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

                            v.vibrate(200);
                            mp = MediaPlayer.create(getContext() , R.raw.audio ) ;

                            mp.start();
                            count1++;
//                            player1turn = true;


                        } else {
                            paintSquare16.setColor(Color.YELLOW);
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



















                if (paintSquare1.getColor() != Color.WHITE && paintSquare2.getColor() != Color.WHITE &&
                        paintSquare3.getColor() != Color.WHITE && paintSquare4.getColor() != Color.WHITE&&paintSquare5.getColor() != Color.WHITE &&
                        paintSquare6.getColor() != Color.WHITE&&paintSquare7.getColor() != Color.WHITE && paintSquare8.getColor() != Color.WHITE&&
                        paintSquare9.getColor() != Color.WHITE && paintSquare10.getColor() != Color.WHITE&&
                        paintSquare11.getColor() != Color.WHITE&&paintSquare12.getColor() != Color.WHITE && paintSquare13.getColor() != Color.WHITE&&
                        paintSquare14.getColor() != Color.WHITE&&paintSquare15.getColor() != Color.WHITE && paintSquare16.getColor() != Color.WHITE) {
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

                    if (paintSquare5.getColor() == Color.RED) {
                        countPlayer1++;
                    } else
                        countPlayer2++;

                    if (paintSquare6.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare7.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare8.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare9.getColor() == Color.RED) {
                        countPlayer1++;
                    } else
                        countPlayer2++;

                    if (paintSquare10.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare11.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare12.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare13.getColor() == Color.RED) {
                        countPlayer1++;
                    } else
                        countPlayer2++;

                    if (paintSquare14.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare15.getColor() == Color.RED)
                        countPlayer1++;
                    else
                        countPlayer2++;

                    if (paintSquare16.getColor() == Color.RED)
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

                    countPlayer1=0;
                    countPlayer2=0;

                }


            }

        }
            return value;
        }
    }

