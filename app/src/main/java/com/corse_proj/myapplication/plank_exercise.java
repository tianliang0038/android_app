package com.corse_proj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;

public class plank_exercise extends Activity {

    private Button forearem_plank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.plank_exercise);
        forearem_plank = (Button) findViewById(R.id.forearem_plank);
        forearem_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForearmPlank();
            }
        });
    }

    public void openForearmPlank() {
        Intent intent = new Intent(this, plank_content.class);
        startActivity(intent);
    }
}
