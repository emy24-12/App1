package com.hotmail.emy24_12.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clic(View v) {
        Toast.makeText(this, getString(R.string.mensaje_x), Toast.LENGTH_LONG).show();
    }
}
