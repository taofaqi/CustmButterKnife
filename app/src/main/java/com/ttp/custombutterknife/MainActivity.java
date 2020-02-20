package com.ttp.custombutterknife;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.ttp.annotation.BindView;
import com.ttp.annotation.OnClick;
import com.ttp.butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bindView(this);
    }

    @OnClick(R.id.btn1)
    public void onClick(View v) {
        Log.d(TAG, "onClick: " + ((Button) v).getText().toString());
    }

    @OnClick(R.id.btn2)
    public void onClick2(View v) {
        Log.d(TAG, "onClick: " + ((Button) v).getText().toString());
    }
}
