package spurs.cafesoft.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/12/15.
 */
public class Fragment_versity  extends Fragment {
    WebView webview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_versity, container, false);
        this.webview = (WebView) rootview.findViewById(R.id.mapview);

        //getWindow().requestFeature(Window.FEATURE_PROGRESS);

        webview.getSettings().setJavaScriptEnabled(true);

        final Activity activity = getActivity();
        webview.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                // Activities and WebViews measure progress with different scales.
                // The progress meter will automatically disappear when we reach 100%
                activity.setProgress(progress * 1000);
            }
        });
        webview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }
        });

        webview.loadUrl("https://www.google.com.bd/maps/place/Daffodil+International+University/@23.7547554,90.376389,17z/data=!4m2!3m1!1s0x0000000000000000:0x6b488f3a62a7d185");

        return rootview;
    }
}