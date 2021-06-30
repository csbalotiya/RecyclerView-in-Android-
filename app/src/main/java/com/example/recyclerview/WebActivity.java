package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    TextView pageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webview1);
        pageName = findViewById(R.id.pagename);

        Intent intent = getIntent();
        String urlPage = intent.getStringExtra("url");
        String pageheading = intent.getStringExtra("pageHeading");
        webView.setWebViewClient(new WebViewClient());
        pageName.setText(pageheading);

        Toast.makeText(this, pageheading, Toast.LENGTH_SHORT).show();
        webView.loadUrl(urlPage);

    }
}