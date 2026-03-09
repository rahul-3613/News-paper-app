package com.rahul.newsapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("https://www.prothomalo.com/");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String url = "";
        int id = item.getItemId();

        if (id == R.id.action_prothomalo) {
            url = "https://www.prothomalo.com/";
        } else if (id == R.id.action_kalerkontho) {
            url = "https://www.kalerkantho.com/";
        } else if (id == R.id.action_dailystar) {
            url = "https://www.thedailystar.net/";
        } else if (id == R.id.action_jugantor) {
            url = "https://www.jugantor.com/";
        } else if (id == R.id.action_bdpratidin) {
            url = "https://www.bd-pratidin.com/";
        } else if (id == R.id.action_independent) {
            url = "https://www.theindependentbd.com/";
        } else if (id == R.id.action_dhakattribune) {
            url = "https://www.dhakatribune.com/";
        } else if (id == R.id.action_samakal) {
            url = "https://samakal.com/";
        } else if (id == R.id.action_ittefaq) {
            url = "https://www.ittefaq.com.bd/";
        } else if (id == R.id.action_businessstandard) {
            url = "https://www.tbsnews.net/";
        }

        if (!url.isEmpty()) {
            webView.loadUrl(url);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}