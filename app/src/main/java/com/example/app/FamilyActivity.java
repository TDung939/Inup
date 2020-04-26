package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FamilyActivity extends AppCompatActivity {

    private Button Button_Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        Button_Next = (Button) findViewById(R.id.button_survey_next);
        Button_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FamilyActivity.this, FeedActivity.class);
                startActivity(intent);
            }
        });
    }
}
