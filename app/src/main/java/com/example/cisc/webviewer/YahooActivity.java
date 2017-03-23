package com.example.cisc.webviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YahooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);

        WebView myWebView = (WebView) findViewById(R.id.webViewYahoo);
        myWebView.setWebViewClient(new WebViewClient()); //stay within webviewer app
        myWebView.loadUrl("http://www.yahoo.com");
    }
}
