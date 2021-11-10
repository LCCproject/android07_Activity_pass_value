package com.example.a07_activity_pass_value;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class testH7_2 extends AppCompatActivity {

    private EditText BText;
    private TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h72);
        BText = (EditText)findViewById(R.id.BText);
        word = (TextView)findViewById(R.id.word);
        Intent intent =this.getIntent();
        String AText = intent.getStringExtra("AText");
        word.setText(AText);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(testH7_2.this,testH7.class);
        intent.putExtra("BText",BText.getText().toString());
        startActivity(intent);
        testH7_2.this.finish();
    }
}