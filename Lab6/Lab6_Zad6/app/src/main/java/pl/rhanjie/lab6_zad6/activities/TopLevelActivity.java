package pl.rhanjie.lab6_zad6.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.widget.Toolbar;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.R;

public class TopLevelActivity extends CustomAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        contentView = R.layout.activity_top_level;

        super.onCreate(savedInstanceState);

        AdapterView.OnItemClickListener itemClickListener = (listView, v, position, id) -> {
            Intent intent;
            switch (position) {
                case 0: {
                    intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                case 1: {
                    intent = new Intent(TopLevelActivity.this, SnackCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                case 2: {
                    intent = new Intent(TopLevelActivity.this, CafeCategoryActivity.class);

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