package pl.rhanjie.lab5_zad5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class SnackActivity extends CustomAppCompatActivity
{
    public static final String EXTRA_SNACK = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int snackId = (Integer)getIntent().getExtras().get(EXTRA_SNACK);
        Snack snack = Snack.snacks[snackId];

        TextView name = findViewById(R.id.name);
        name.setText(snack.getName());

        TextView description = findViewById(R.id.description);
        description.setText(snack.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(snack.getImageResourceId());
        photo.setContentDescription(snack.getName());
    }
}