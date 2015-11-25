package com.sclee.android.hello;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sclee.android.hellojni.HelloJni;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView helloTextView = (TextView) rootView.findViewById(R.id.helloTextView);

        // Use hello-jni
        HelloJni helloJni = new HelloJni();
        helloTextView.setText(helloJni.helloFromNative());

        return rootView;
    }
}
