package com.ankur.searchit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    TextView SV;
    WebView wv;
    String Data;
    Button B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Data = getIntent().getStringExtra("data");
        SV = (TextView) findViewById(R.id.T2);
        SV.setText(Data);
    }

    public void confSearch(View view){
        B = (Button) findViewById(R.id.B2);
        B.setVisibility(View.INVISIBLE);
        SV.setVisibility(View.INVISIBLE);
        wv = (WebView) findViewById(R.id.WV);
        wv.setVisibility(View.VISIBLE);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://www.google.com/search?q="+Data);

    }
}
