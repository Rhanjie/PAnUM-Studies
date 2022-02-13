package pl.rhanjie.lab6_zad6.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.models.Snack;

public class SnackCategoryActivity extends CustomAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayAdapter<Snack> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Snack.snacks);
        ListView listSnacks = findViewById(R.id.list_snacks);
        listSnacks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = (listSnacks1, itemView, position, id) -> {
            Intent intent = new Intent(SnackCategoryActivity.this, SnackActivity.class);
            intent.putExtra(SnackActivity.EXTRA_ITEM, (int) id);

            startActivity(intent);
        };

        listSnacks.setOnItemClickListener(itemClickListener);
    }
}