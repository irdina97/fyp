package com.example.fyp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    //GridLayout mainGrid;
    //private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*button = findViewById(R.id.btnAdd1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencalendar();
            }
        });*/


        //mainGrid = findViewById(R.id.mainGrid);
        CardView cardView = findViewById(R.id.card_view);
        CardView cardView1 = findViewById(R.id.card_view1);
        CardView cardView2 = findViewById(R.id.card_view2);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Expenses.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "income", Toast.LENGTH_SHORT).show();
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Income.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "income", Toast.LENGTH_SHORT).show();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Income.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "income", Toast.LENGTH_SHORT).show();
            }
        });

        //set event
        //setSingleEvent (mainGrid);

        //Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.nagivation_drawer_open, R.string.nagivation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ChartFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_piechart);
        }

    }


   // private void setSingleEvent(GridLayout mainGrid) {
    //Loop all child item of main grid
    // for (int i = 0; i < mainGrid.getChildCount(); i++) {
    // CardView cardView = (CardView) mainGrid.getChildAt(i);
    // final int finalI1 = i;
    //cardView.setOnClickListener(new View.OnClickListener() {
    // @Override

    // public void onClick(View v) {
    //if(finalI1 == 0) //open activity income
    // {
    // Intent intent = new Intent(MainActivity.this, Income.class);
    //  startActivity(intent);
    // Toast.makeText(MainActivity.this, "income", Toast.LENGTH_SHORT).show();
    //}
    // else  if(finalI1 == 1) //open activity Expenses
    // {
    // Toast.makeText(MainActivity.this, "expense", Toast.LENGTH_SHORT).show();
    //Intent intent = new Intent(MainActivity.this, Income.class);
    //intent.setClass(MainActivity.this, Income.class);
    //startActivity(intent);
    //  }
    // else
    //  {
    // Toast.makeText(MainActivity.this, "Please set activity for this card", Toast.LENGTH_SHORT).show();
    // }
    // }
    // });
    // }
    // }

    //Navigation menu
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_piechart:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ChartFragment()).commit();
                break;
            case R.id.nav_category:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CategoryFragment()).commit();
                break;
            case R.id.nav_settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_rate:
                Toast.makeText(this, "Rate", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_info:
                Toast.makeText(this, "Info", Toast.LENGTH_SHORT).show();
                break;

        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

   /* public void opencalendar() {
        Intent intent = new Intent(this, calendar.class);
        startActivity(intent);
    }*/

}

