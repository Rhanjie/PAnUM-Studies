package pl.rhanjie.lab6_zad6.activities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.fragments.CafeFragment;


public class CafeActivity extends CustomAppCompatActivity
{
    public static final String EXTRA_ITEM = "itemId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        contentView = R.layout.activity_cafe;

        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, CafeFragment.class, null)
                    .commit();
        }
    }
}