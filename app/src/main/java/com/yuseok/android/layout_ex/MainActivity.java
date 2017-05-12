package com.yuseok.android.layout_ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNomal, btnRealative, btnLinear;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNomal = (Button) findViewById(R.id.btnConstraint);
        btnRealative = (Button) findViewById(R.id.btnRelative);
        btnLinear = (Button) findViewById(R.id.btnLinear);

        btnRealative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intent);
            }
        });

        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(intent);
            }
        });
    }
}
