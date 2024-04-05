package com.itproger.sixthprak;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home){
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
//                    Toast.makeText(MainActivity.this, "Домой", Toast.LENGTH_LONG).show();
                }
                else if (item.getItemId() == R.id.settings) {
                    Intent intent = new Intent(MainActivity.this, Settings.class);
                    startActivity(intent);
//                    Toast.makeText(MainActivity.this, "Настройки", Toast.LENGTH_LONG).show();
                }
                else if (item.getItemId() == R.id.notification) {
                    Intent intent = new Intent(MainActivity.this, Notifications.class);
                    startActivity(intent);
//                    Toast.makeText(MainActivity.this, "Уведомления", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}