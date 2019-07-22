package com.example.dsc_android_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mNumber = 10;
    private TextView showNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showNumber = (TextView) findViewById(R.id.msgText);
    }

    public void toast_Button(View view) {
        Toast.makeText(getApplicationContext(), "First task Completed xD", Toast.LENGTH_SHORT).show();

    }

    public void minus_Button(View view) {
        if (mNumber > 1) {
            mNumber=mNumber-1;
            showNumber.setText(Integer.toString(mNumber));
        } else {
            Toast toastMinus = Toast.makeText(this, "min. limit Reached", Toast.LENGTH_SHORT);
            toastMinus.show();
        }
    }

    public void reset_Button(View view) {
        mNumber = 10;
        showNumber.setText(Integer.toString(mNumber));
    }

    public void add_Button(View view) {
        if (mNumber < 30) {
            mNumber=mNumber+1;
            showNumber.setText(Integer.toString(mNumber));
        } else {
            Toast toastAdd= Toast.makeText(this, "Max. limit Reached",Toast.LENGTH_SHORT);
            toastAdd.show();
        }
    }
}
