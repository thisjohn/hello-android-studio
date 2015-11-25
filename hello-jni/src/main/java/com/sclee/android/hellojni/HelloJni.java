package com.sclee.android.hellojni;

/**
 * Created by sclee on 15/11/26.
 */
public class HelloJni {
    static {
        System.loadLibrary("hello-jni");
    }

    public native String helloFromNative();
}
