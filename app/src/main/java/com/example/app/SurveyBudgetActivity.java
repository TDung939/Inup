package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class SurveyBudgetActivity extends AppCompatActivity {

    private Button Button_Next_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_budget);

        Button_Next_2 = (Button) findViewById(R.id.button_survey_next_2);
        Button_Next_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SurveyBudgetActivity.this, FeedActivity.class);
                startActivity(intent);
            }
        });
    }
}
