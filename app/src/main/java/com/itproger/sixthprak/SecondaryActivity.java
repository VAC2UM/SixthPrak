package com.itproger.sixthprak;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Главная");

            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
            bottomNavigationView.setOnNavigationItemReselectedListener(item -> {
                if (item.getItemId() == R.id.home) {
                    actionBar.setTitle("Главная");
//                    Intent intent = new Intent(SecondaryActivity.this, MainActivity.class);
//                    startActivity(intent);
//                    Toast.makeText(MainActivity.this, "Домой", Toast.LENGTH_LONG).show();
                } else if (item.getItemId() == R.id.settings) {
                    actionBar.setTitle("Настройки");
//                    Intent intent = new Intent(SecondaryActivity.this, Settings.class);
//                    startActivity(intent);
//                    Toast.makeText(SecondaryActivity.this, "Настройки", Toast.LENGTH_LONG).show();
                } else if (item.getItemId() == R.id.notification) {
                    actionBar.setTitle("Уведомления");
//                    Intent intent = new Intent(MainActivity.this, Notifications.class);
//                    startActivity(intent);
//                    Toast.makeText(MainActivity.this, "Уведомления", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu ){
        getMenuInflater().inflate(R.menu.bottom_nav_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}