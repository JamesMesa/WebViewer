package com.example.cisc.webviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MesaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa);

        WebView myWebView = (WebView) findViewById(R.id.webViewMesa);
        myWebView.loadUrl("http://www.sdmesa.edu");
    }
}
