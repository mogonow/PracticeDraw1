package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

Paint textPaint = new Paint() ;
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(13);
        canvas.drawText("lolipop",160,80,textPaint);

        Path path =  new Path();
        Paint linepaint =  new Paint();
        linepaint.setColor(Color.WHITE);
        linepaint.setStyle(Paint.Style.STROKE);
        path.moveTo(170,90);
        path.rLineTo(180,0);HenCoder 绘制 1 练习项目
        path.rLineTo(30,30);
        canvas.drawPath(path,linepaint);


        Paint drawPaint = new Paint();
        drawPaint.setColor(Color.RED);
        canvas.drawArc(280,80,780,580,180,120,true,drawPaint);


        Paint drawYellowPaint = new Paint();
        drawYellowPaint.setColor(Color.YELLOW);
        canvas.drawArc(300,80,800,600,300,50,true,drawYellowPaint);

        Paint drawBluePaint = new Paint();
        drawBluePaint.setColor(Color.BLUE);
        canvas.drawArc(300,80,800,600,-10,10,true,drawBluePaint);



        Paint drawGPaint = new Paint();
        drawGPaint.setColor(Color.BLACK);
        canvas.drawArc(300,80,800,600,10,10,true,drawGPaint);

        Paint drawJPaint = new Paint();
        drawJPaint.setColor(Color.parseColor("#aa33ff"));
        canvas.drawArc(300,80,800,600,10,50,true,drawJPaint);


        Paint drawKPaint = new Paint();
        drawKPaint.setColor(Color.parseColor("#0000ff"));
        canvas.drawArc(300,80,800,600,60,120,true,drawKPaint);

    }
}
