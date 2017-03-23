package com.example.cisc.webviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonMesa;
    Button buttonYahoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMesa = (Button) findViewById(R.id.buttonMesa);
        buttonMesa.setOnClickListener(this);

        buttonYahoo = (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.buttonMesa:
                Intent m;
                m = new Intent(this, MesaActivity.class);
                startActivity(m);
                break;
            case R.id.buttonYahoo:
                Intent y;
                y = new Intent(this, YahooActivity.class);
                startActivity(y);
                break;
        }

    }
}
