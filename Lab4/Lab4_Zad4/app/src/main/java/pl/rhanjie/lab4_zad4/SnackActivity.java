package pl.rhanjie.lab4_zad4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class SnackActivity extends Activity
{
    public static final String EXTRA_SNACK = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

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