package com.katibu.misaumodelacademy;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class HelloWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        view.loadUrl(url);
        return true;
    }
}