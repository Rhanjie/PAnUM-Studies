package pl.rhanjie.lab6_zad6.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.fragments.FoodFragment;
import pl.rhanjie.lab6_zad6.fragments.ItemListFragment;
import pl.rhanjie.lab6_zad6.models.Drink;
import pl.rhanjie.lab6_zad6.R;


public class DrinkCategoryActivity extends CustomAppCompatActivity {
    public static final String EXTRA_CATEGORY = "categoryId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        contentView = R.layout.activity_drink_category;

        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, ItemListFragment.class, null)
                    .commit();
        }
    }
}