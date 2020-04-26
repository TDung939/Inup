package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FamilyNewActivity extends AppCompatActivity {


    private Button Button_Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_new);

        Button_Next = (Button) findViewById(R.id.button_survey_new_next);
        Button_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FamilyNewActivity.this, FeedDeliveryActivity.class);
                startActivity(intent);
            }
        });
    }
}
