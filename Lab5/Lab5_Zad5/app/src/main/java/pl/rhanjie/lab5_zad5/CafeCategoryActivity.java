package pl.rhanjie.lab5_zad5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class CafeCategoryActivity extends CustomAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayAdapter<Cafe> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Cafe.cafes);
        ListView listCafes = findViewById(R.id.list_cafes);
        listCafes.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = (listCafes1, itemView, position, id) -> {
            Intent intent = new Intent(CafeCategoryActivity.this, CafeActivity.class);
            intent.putExtra(CafeActivity.EXTRA_CAFE, (int) id);

            startActivity(intent);
        };

        listCafes.setOnItemClickListener(itemClickListener);
    }
}