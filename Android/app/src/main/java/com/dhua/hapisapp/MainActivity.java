package com.dhua.hapisapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;

public class MainActivity extends Activity {
    Button mButton;
    EditText latText;
    EditText lonText;
    EditText ip;
    Osc osc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showChibi(View view){
        ip   = (EditText)findViewById(R.id.ip);
        osc.oscRequest(ip.getText().toString(), "chibi");

    }
    public void showScooby(View view){
        ip   = (EditText)findViewById(R.id.ip);
        osc.oscRequest(ip.getText().toString(), "scooby");

    }
    public void showMario(View view){
        ip   = (EditText)findViewById(R.id.ip);
        osc.oscRequest(ip.getText().toString(), "mario");

    }
    public void showLego(View view){
        ip   = (EditText)findViewById(R.id.ip);
        osc.oscRequest(ip.getText().toString(), "lego");

    }
    public void showMerci(View view){
        ip   = (EditText)findViewById(R.id.ip);
        osc.oscRequest(ip.getText().toString(), "merci");

    }
}
