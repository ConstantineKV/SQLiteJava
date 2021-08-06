package com.konstantin_romashenko.sqllitejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.konstantin_romashenko.sqllitejava.db.MyDBManager;

public class MainActivity extends AppCompatActivity {
    private MyDBManager myDBManager;
    private EditText edTitle, edDesc;
    private TextView tvTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDBManager = new MyDBManager(this);
        edTitle = findViewById(R.id.edTitle);
        edDesc = findViewById(R.id.edDesc);
        tvTest = findViewById(R.id.tvTest);
    }

    @Override
    protected void onResume() {
        super.onResume();
        myDBManager.openDB();
    }

    public void onClickSave(View view)
    {
        tvTest.setText("");
        myDBManager.insertToDB(edTitle.getText().toString(), edDesc.getText().toString());
        for(String title : myDBManager.getFromDB())
        {

            tvTest.setText(tvTest.getText() + title + "\n");
        }
    }
}