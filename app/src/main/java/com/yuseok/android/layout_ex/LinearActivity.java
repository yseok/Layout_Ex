package com.yuseok.android.layout_ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LinearActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnConstraint, btnRelative;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        btnConstraint = (Button) findViewById(R.id.btnConstraint);
        btnRelative = (Button) findViewById(R.id.btnRelative);

        btnConstraint.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnConstraint:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnRelative:
                intent = new Intent(this, RelativeActivity.class);
                startActivity(intent);
                break;
        }
    }
}
