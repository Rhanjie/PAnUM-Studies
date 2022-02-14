package pl.rhanjie.lab6_zad6.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.fragments.CafeFragment;
import pl.rhanjie.lab6_zad6.fragments.FoodFragment;


public class DrinkActivity extends CustomAppCompatActivity
{
    public static final String EXTRA_ITEM = "itemId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        contentView = R.layout.activity_drink;

        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, FoodFragment.class, null)
                    .commit();
        }
    }
}