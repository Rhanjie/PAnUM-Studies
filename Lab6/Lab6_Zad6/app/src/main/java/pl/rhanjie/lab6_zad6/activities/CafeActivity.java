package pl.rhanjie.lab6_zad6.activities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.fragments.CafeFragment;


public class CafeActivity extends CustomAppCompatActivity
{
    public static final String EXTRA_CAFE = "cafeId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, CafeFragment.class, null)
                    .commit();
        }
    }
}