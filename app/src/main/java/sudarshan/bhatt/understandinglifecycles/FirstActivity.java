package sudarshan.bhatt.understandinglifecycles;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends AppCompatActivity {
    private static final String tag = FirstActivity.class.getSimpleName();


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.i(tag, " protected onRestoreInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);

        Log.i(tag, " public onRestoreInstanceState");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.i(tag, "onCreate");
//        popup();
//        startActivity(new Intent(this, SecondActivity.class));
    }

    public void popup(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(FirstActivity.this);
        builder.setPositiveButton("Hello There", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });
        builder.setMessage("hiii");
        builder.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(tag, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, "onRestart");
    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.i(tag, "onResume");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(tag, "protected onSaveInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        Log.i(tag, "public onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(tag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(tag, "onDestroy");
    }
}
