package com.izv.add.deint_dgrafica;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TypedArray ta = this.getContext().obtainStyledAttributes(attrs,
                R.styleable.GraficaCircular);
        this.percentage = ta.getInt(R.styleable.GraficaCircular_percentage,
                0);
                0);

        setContentView(R.layout.activity_main);
// Si hemos incluido el componente en xml
      //  GraficaCircular graph=
             //   findViewById(R.id.);
//o programaticamente
        GraficaCircular graph1 = new GraficaCircular(this);
    }

    // Texto con el porcentaje
  /*  Paint ptexto = new Paint();
ptexto.setTypeface(Typeface.SANS_SERIF);
ptexto.setTextAlign(Paint.Align.CENTER);
ptexto.setAntiAlias(true);
ptexto.setColor(Color.BLACK);
ptexto.setTextSize(TEXT_SIZE);
canvas.drawText(percentage + "%", width / 2, height - 2, ptexto);
*/


}
