package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
canvas.drawArc(400,50,600,200,240,100,true,paint);
canvas.drawArc(400,50,600,200,10,160,false,paint);
Paint paint1 = new Paint();
        paint1 .setStyle(Paint.Style.STROKE);
        canvas.drawArc(400,50,600,200,180,70,false,paint1);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
