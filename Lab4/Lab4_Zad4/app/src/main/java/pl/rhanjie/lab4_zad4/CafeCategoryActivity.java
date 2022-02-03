package pl.rhanjie.lab4_zad4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CafeCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_category);
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