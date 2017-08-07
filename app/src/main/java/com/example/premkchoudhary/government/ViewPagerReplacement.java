package com.example.premkchoudhary.government;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class ViewPagerReplacement extends AppCompatActivity {

    private WebView webView;
    private Button btnStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpagerreplacement);

        webView = (WebView) findViewById(R.id.wvgif);
        webView.loadUrl("file:///android_asset/squaregif.gif" );
        webView.clearCache(false);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setJavaScriptEnabled(true);

        btnStarted = (Button) findViewById(R.id.btnStarted);

        btnStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPagerReplacement.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
