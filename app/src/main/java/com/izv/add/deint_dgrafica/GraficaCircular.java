package com.izv.add.deint_dgrafica;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class GraficaCircular extends View {
    private final int DEFAULT_SIZE = 50;
    private int width, height;
    private int graphColor = Color.YELLOW;
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public GraficaCircular(Context context) {
        super(context);
    }



    // usado para inflar la vista desde xml
    public GraficaCircular(Context context, @Nullable
            AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        /*
        -
        */

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width=DEFAULT_SIZE;
        height=DEFAULT_SIZE;
        //llamada obligatoria con el tamaño del componente
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*paint.setColor(graphColor);
        paint.setStyle(Paint.Style.FILL);
        float radius = width / 2f;
        canvas.drawCircle(width / 2f, height / 2f, radius, paint);
        */

        Rect rec = canvas.getClipBounds();
// Parte positiva del porcentaje (en rojo)
        float anguloprev = (360 * 60)/(float)100.0;
        Paint p1 = new Paint();
        p1.setStyle(Paint.Style.FILL);
        p1.setColor(Color.RED);
//canvas.drawArc(new RectF(rec), 0, anguloprev, true, p1);
        canvas.drawArc(new RectF(rec.top, rec.left, rec.right, rec.bottom ),
                0, anguloprev, true, p1);
// Parte negativa del porcentaje (en azul)
        float angulopost = (360 *(100 - 30))/(float)100.0;
        p1.setColor(Color.BLUE);
//canvas.drawArc(new RectF(rec), anguloprev, angulopost, true, p2);
        canvas.drawArc(new RectF(rec.top, rec.left, rec.right, rec.bottom),
                anguloprev, angulopost, true, p1);

    }



}
