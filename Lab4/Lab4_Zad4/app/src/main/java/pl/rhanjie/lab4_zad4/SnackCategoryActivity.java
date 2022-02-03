package pl.rhanjie.lab4_zad4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SnackCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_category);

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