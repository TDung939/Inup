package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class SurveyFamilyActivity extends AppCompatActivity {

    private Button Button_Next;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_family);

        Button_Next = (Button) findViewById(R.id.button_survey_next);
        Button_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SurveyFamilyActivity.this, SurveyBudgetActivity.class);
                startActivity(intent);
            }
        });
    }
}

