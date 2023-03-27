package ru.mirea.chernovaa.activitylifecycle;

import static android.content.ContentValues.TAG;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onCreate()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onStart()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onSaveInstanceState()");
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        editText = findViewById(R.id.edit_text);
        Log.i(TAG, "onRestoreInstanceState()");
        editText.setText("onRestoreInstanceState()");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.i(TAG, "onPostCreate()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onPostCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onResume()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "onPostResume()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onPostResume()");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onAttachedToWindow()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onDestroy()");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onDetachedFromWindow()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
        editText = findViewById(R.id.edit_text);
        editText.setText("onRestart()");
    }

}
