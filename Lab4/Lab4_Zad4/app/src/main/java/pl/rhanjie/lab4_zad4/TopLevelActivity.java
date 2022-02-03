package pl.rhanjie.lab4_zad4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        AdapterView.OnItemClickListener itemClickListener = (listView, v, position, id) -> {
            switch (position) {
                case 0: {
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                case 1: {
                    Intent intent = new Intent(TopLevelActivity.this, SnackCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                case 2: {
                    Intent intent = new Intent(TopLevelActivity.this, CafeCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                default: {
                    System.out.println("Unknown option!");
                    break;
                }
            }
        };

        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}