package pl.rhanjie.lab4_zad4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class CafeActivity extends Activity
{
    public static final String EXTRA_CAFE = "cafeId";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        int cafeId = (Integer)getIntent().getExtras().get(EXTRA_CAFE);
        Cafe cafe = Cafe.cafes[cafeId];

        TextView name = findViewById(R.id.name);
        name.setText(cafe.getName());

        TextView adress = findViewById(R.id.adress);
        adress.setText(cafe.getAddress());

        TextView openingHours = findViewById(R.id.openingHours);
        openingHours.setText(cafe.getOpeningHours());

    }
}