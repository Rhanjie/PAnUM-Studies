package pl.rhanjie.lab5_zad5;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class TopLevelActivity extends CustomAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        Button sendButton = findViewById(R.id.buttonSendMessageTop);
        sendButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, OrderActivity.class);

            startActivity(intent);
        });
    }
}