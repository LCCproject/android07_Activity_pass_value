package com.example.a07_activity_pass_value;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class testH7 extends AppCompatActivity {

    private EditText AText;
    private TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h7);
        AText = (EditText)findViewById(R.id.AText);
        word = (TextView)findViewById(R.id.word);
        Intent intent =this.getIntent();
        String AText = intent.getStringExtra("BText");
        word.setText(AText);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(testH7.this, testH7_2.class);
        intent.putExtra("AText",AText.getText().toString());
        startActivity(intent);
        testH7.this.finish();
    }
}