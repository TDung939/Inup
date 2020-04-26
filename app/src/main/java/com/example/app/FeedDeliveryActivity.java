package com.example.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FeedDeliveryActivity extends AppCompatActivity {
    private Button Button_buy;
    private Button Button_family;
    private Button Button_budget;
    private Button Oval;
    Animation anim_oval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_delivery);
        //Initialize and assign variables
        /*BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.shop:
                        startActivity(new Intent(getApplicationContext(), ShopActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.home:
                        return true;

                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext(), NotificationActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });*/

        //Next to location
        Button_buy = (Button) findViewById(R.id.main_0);
        Button_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeedDeliveryActivity.this, ShopActivity.class);
                startActivity(intent);
            }
        });

        //Go to family
        Button_family = (Button) findViewById(R.id.main_2);
        Button_family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeedDeliveryActivity.this, FamilyNewActivity.class);
                startActivity(intent);
            }
        });

        //Go to budget
        Button_budget = (Button) findViewById(R.id.main_3);
        Button_budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeedDeliveryActivity.this, BudgetNewActivity.class);
                startActivity(intent);
            }
        });

        Oval = findViewById(R.id.oval_butt);
        anim_oval = AnimationUtils.loadAnimation(this, R.anim.animoval);
        Oval.startAnimation(anim_oval);

    }
}
