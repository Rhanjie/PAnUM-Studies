package pl.rhanjie.lab6_zad6.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.fragments.SupportFragment;
import pl.rhanjie.lab6_zad6.fragments.TopLevelFragment;

public class SupportActivity extends CustomAppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        contentView = R.layout.activity_support;

        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, SupportFragment.class, null)
                    .commit();
        }
    }
}