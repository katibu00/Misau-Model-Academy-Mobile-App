package com.katibu.misaumodelacademy;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class WebsiteActivity extends AppCompatActivity {


    RelativeLayout layout_forum;
    WebView wv_forum;
    ProgressBar mProgressBar_forum;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        wv_forum = findViewById(R.id.wv_forum);
        layout_forum = findViewById(R.id.layout_forum);
        mProgressBar_forum = findViewById(R.id.progressbar_forum);
        mProgressBar_forum.setMax(1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if( getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }






        wv_forum.getSettings().setLoadWithOverviewMode(true);
        wv_forum.getSettings().setUseWideViewPort(true);
        //improve performance

        wv_forum.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv_forum.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        wv_forum.getSettings().setAppCacheEnabled(true);
        wv_forum.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv_forum.getSettings().setDomStorageEnabled(true);
        wv_forum.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        wv_forum.getSettings().setSaveFormData(true);
        wv_forum.getSettings().setSaveFormData(true);

        wv_forum.loadUrl("http://misaumodelschool.com");
        wv_forum.setWebViewClient(new HelloWebViewClient());


        wv_forum.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                mProgressBar_forum.setVisibility(View.VISIBLE);
                setTitle("Loading...");

            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mProgressBar_forum.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }
        });



        if (connectionManager.checkConnection(getBaseContext())) {
            wv_forum.setVisibility(View.VISIBLE);
            layout_forum.setVisibility(View.INVISIBLE);


        } else {

            wv_forum.setVisibility(View.INVISIBLE);
            layout_forum.setVisibility(View.VISIBLE);
            mProgressBar_forum.setVisibility(View.INVISIBLE);
            toolbar.setVisibility(View.INVISIBLE);

        }
    }

    @Override
    public void onBackPressed() {
        if (wv_forum.canGoBack()){
            wv_forum.goBack();
        }else {
            finish();
        }
    }

}
