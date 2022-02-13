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
            intent.putExtra(SnackActivity.EXTRA_SNACK, (int) id);

            startActivity(intent);
        };

        listSnacks.setOnItemClickListener(itemClickListener);
    }
}