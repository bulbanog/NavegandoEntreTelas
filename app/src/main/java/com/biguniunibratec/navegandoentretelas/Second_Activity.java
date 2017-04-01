package com.biguniunibratec.navegandoentretelas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Rayssa&Thiago on 01/04/2017.
 */

public class Second_Activity extends AppCompatActivity {
    @Override
    protected Void onCreat(@Nullable Bundle SavedIstanceState) {
        super.onCreate(SavedIstanceState);
        setContentView(R.layout.activity_second);
        Log.i("SecondActivity", "onCreat");
    }
    @Override
    protected Void onStart() {
        super.onStart();
        Log.i("SecondActivity", "onStart");
    }
    @Override
    protected Void onStop() {
        super.onStop();
        Log.i("SecondActivity", "onStop");
    }
    @Override
    protected Void onDestroy() {
        super.onDestroy();
        Log.i("SecondActivity", "onDestroy");
    }@Override
    protected Void onRestart() {
        super.onRestart();
        Log.i("SecondActivity", "onRestart");
    }
    @Override
    protected Void onResume() {
        super.onResume();
        Log.i("SecondActivity", "onResume");
    }
    @Override
    protected Void onPause() {
        super.onPause();
        Log.i("SecondActivity", "onPause");
    }

