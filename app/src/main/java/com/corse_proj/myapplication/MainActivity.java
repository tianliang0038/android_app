package com.corse_proj.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.app.Activity;



public class MainActivity extends Activity {

    private TextView mTextMessage;

    private Button start_planking;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_workout:
                    mTextMessage.setText("Workout");
                    return true;
                case R.id.navigation_challenge:
                    mTextMessage.setText("Challenge");
                    return true;
                case R.id.navigation_account:
                    mTextMessage.setText("Account");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        start_planking = (Button) findViewById(R.id.button_start_planking);
        start_planking.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openStartPlanking();
           }
        });
    }

    public void openStartPlanking() {
        Intent intent = new Intent(this, plank_exercise.class);
        startActivity(intent);
    }

}
