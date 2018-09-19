package sudarshan.bhatt.understandinglifecycles;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String tag = SecondActivity.class.getSimpleName();


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);

        Log.d(tag, "onRestoreInsatanceState");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(tag, "onCreate");

    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.d(tag, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume");
    }


    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        Log.d(tag, "onSavedInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }
}
