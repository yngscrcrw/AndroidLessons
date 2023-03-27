package ru.mirea.chernovaa.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGetToast(View view) {
        TextView textView = findViewById(R.id.editTextTextPersonName);
        int count = textView.getText().length();
        Toast toast = Toast.makeText(getApplicationContext(),
                "студент №24 БСБО-17-20 Количество символов - " + count,
                Toast.LENGTH_SHORT);
        toast.setGravity(0, 0, 0);
        toast.show();
    }
}