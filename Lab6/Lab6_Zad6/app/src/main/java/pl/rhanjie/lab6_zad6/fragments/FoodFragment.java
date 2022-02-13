package pl.rhanjie.lab6_zad6.fragments;

import static pl.rhanjie.lab6_zad6.activities.DrinkActivity.EXTRA_ITEM;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import pl.rhanjie.lab6_zad6.models.Drink;
import pl.rhanjie.lab6_zad6.R;

public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);*/

        Activity activity = getActivity();
        View view = inflater.inflate(R.layout.fragment_food, container, false);

        int drinkId = (Integer)activity.getIntent().getExtras().get(EXTRA_ITEM);
        Drink drink = Drink.drinks[drinkId];

        TextView name = view.findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = view.findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView photo = view.findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        return view;
    }
}