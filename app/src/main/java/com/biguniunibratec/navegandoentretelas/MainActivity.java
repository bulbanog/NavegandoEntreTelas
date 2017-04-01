package com.biguniunibratec.navegandoentretelas;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSecondActivity;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","onCreate")

        btnSecondActivity= (Button)findViewById(R.id.btnSecondActivity);
        btnSecondActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i= new Intent(MainActivity.this, Second_Activity.class);
                startActivity(i);
            }
        }};

    }
    @Override
    protected Void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart");
    }
    @Override
    protected Void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop");
    }
    @Override
    protected Void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy");
    }@Override
    protected Void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart");
    }
    @Override
    protected Void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume");
    }
    @Override
    protected Void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause");
    }
