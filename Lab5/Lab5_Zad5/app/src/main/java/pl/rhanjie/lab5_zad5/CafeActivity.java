package pl.rhanjie.lab5_zad5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class CafeActivity extends CustomAppCompatActivity
{
    public static final String EXTRA_CAFE = "cafeId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int cafeId = (Integer)getIntent().getExtras().get(EXTRA_CAFE);
        Cafe cafe = Cafe.cafes[cafeId];

        TextView name = findViewById(R.id.name);
        name.setText(cafe.getName());

        TextView adress = findViewById(R.id.adress);
        adress.setText(cafe.getAddress());

        TextView openingHours = findViewById(R.id.openingHours);
        openingHours.setText(cafe.getOpeningHours());
    }
}