package pl.rhanjie.lab6_zad6.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.models.Drink;
import pl.rhanjie.lab6_zad6.R;


public class DrinkCategoryActivity extends CustomAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Drink.drinks);
        ListView listDrinks = findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = (listDrinks1, itemView, position, id) -> {
            Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
            intent.putExtra(DrinkActivity.EXTRA_ITEM, (int) id);

            startActivity(intent);
        };

        listDrinks.setOnItemClickListener(itemClickListener);
    }
}