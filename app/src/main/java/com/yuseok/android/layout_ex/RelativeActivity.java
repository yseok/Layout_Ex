package com.yuseok.android.layout_ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RelativeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnConstraint, btnLinear;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        btnConstraint = (Button) findViewById(R.id.btnConstraint);
        btnLinear = (Button) findViewById(R.id.btnLinear);

        btnConstraint.setOnClickListener(this);
        btnLinear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
           switch (v.getId()) {
               case R.id.btnConstraint:
                   intent = new Intent(this, MainActivity.class);
                   startActivity(intent);
                   break;
               case R.id.btnLinear:
                   intent= new Intent(this, LinearActivity.class);
                   startActivity(intent);
                   break;
           }
    }
}
