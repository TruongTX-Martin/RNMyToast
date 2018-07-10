
package com.reactlibrary;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;

public class RNMyToastModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNMyToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNMyToast";
    }

    @ReactMethod
    public void showToast(final String message) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getCurrentActivity(), message, Toast.LENGTH_LONG);
            }
        });
    }
}