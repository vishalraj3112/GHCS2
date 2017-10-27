package com.example.android.ghcs2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar=(Toolbar) findViewById(R.id.toolbarTitle);
        setSupportActionBar(myToolbar);

         Button button = (Button) findViewById(R.id.noticeButton);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent intent = new Intent(MainActivity.this,
                        NoticeActivity.class);
                startActivity(intent);
            }
        });
    }
}
