package com.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.ConsoleMessage;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkHttpAuthHandler;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkUIClient;
import org.xwalk.core.XWalkView;


public class MainActivity extends XWalkActivity {
    private XWalkView xWalkWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        xWalkWebView = (XWalkView) findViewById(R.id.xwalkWebView);
    }

    @Override
    protected void onXWalkReady() {
        xWalkWebView.load("https://crosswalk-project.org/documentation/shared_mode.html", null);

    }
}

       /* // turn on debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
        xWalkWebView.setUIClient(new XWalkUIClient(xWalkWebView) {
            public boolean onConsoleMessage(ConsoleMessage cm) {
                Log.e("MyApplication", cm.message() + " -- From line "
                        + cm.lineNumber() + " of "
                        + cm.sourceId());
                return true;
            }

            @Override
            public void onPageLoadStarted(XWalkView view, String url) {
                System.out.println("onPageLoadStarted  " + url);
            }

            @Override
            public void onPageLoadStopped(XWalkView view, String url,
                                          XWalkUIClient.LoadStatus status) {
                System.out.println("onPageLoadStopped  " + status);
            }
        });
        xWalkWebView.setResourceClient(new XWalkResourceClient(xWalkWebView) {
            @Override
            public void onReceivedHttpAuthRequest(XWalkView view, XWalkHttpAuthHandler handler, String host, String realm) {
                System.out.println("onReceivedHttpAuthRequest");
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        if (xWalkWebView != null) {
            xWalkWebView.pauseTimers();
            xWalkWebView.onHide();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (xWalkWebView != null) {
            xWalkWebView.resumeTimers();
            xWalkWebView.onShow();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (xWalkWebView != null) {
            xWalkWebView.onDestroy();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (xWalkWebView != null) {
            xWalkWebView.onActivityResult(requestCode, resultCode, data);
        }
    }

    protected void onNewIntent(Intent intent) {
        if (xWalkWebView != null) {
            xWalkWebView.onNewIntent(intent);
        }
    }*/



