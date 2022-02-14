package pl.rhanjie.lab6_zad6.fragments;

import static pl.rhanjie.lab6_zad6.activities.DrinkActivity.EXTRA_ITEM;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.activities.CafeActivity;
import pl.rhanjie.lab6_zad6.activities.CafeCategoryActivity;
import pl.rhanjie.lab6_zad6.activities.DrinkActivity;
import pl.rhanjie.lab6_zad6.activities.DrinkCategoryActivity;
import pl.rhanjie.lab6_zad6.activities.SnackActivity;
import pl.rhanjie.lab6_zad6.activities.SnackCategoryActivity;
import pl.rhanjie.lab6_zad6.models.Cafe;
import pl.rhanjie.lab6_zad6.models.Drink;
import pl.rhanjie.lab6_zad6.models.Item;
import pl.rhanjie.lab6_zad6.models.Snack;

public class ItemListFragment extends Fragment {
    public ItemListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Activity activity = getActivity();
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        ArrayAdapter<Item> listAdapter;

        Class<? extends Activity> activityClass = activity.getClass();

        if (CafeCategoryActivity.class.equals(activityClass)) {
            listAdapter = new ArrayAdapter<>(activity, android.R.layout.simple_list_item_1, Cafe.cafes);
        } else if (DrinkCategoryActivity.class.equals(activityClass)) {
            listAdapter = new ArrayAdapter<>(activity, android.R.layout.simple_list_item_1, Drink.drinks);
        } else {
            listAdapter = new ArrayAdapter<>(activity, android.R.layout.simple_list_item_1, Snack.snacks);
        }

        ListView listItems = view.findViewById(R.id.list_items);
        listItems.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = (listSnacks1, itemView, position, id) -> {

            Intent intent;
            if (CafeCategoryActivity.class.equals(activityClass)) {
                intent = new Intent(activity, CafeActivity.class);
                intent.putExtra(CafeActivity.EXTRA_ITEM, (int) id);
            } else if (DrinkCategoryActivity.class.equals(activityClass)) {
                intent = new Intent(activity, DrinkActivity.class);
                intent.putExtra(DrinkActivity.EXTRA_ITEM, (int) id);
            } else {
                intent = new Intent(activity, SnackActivity.class);
                intent.putExtra(SnackActivity.EXTRA_ITEM, (int) id);
            }

            startActivity(intent);
        };

        listItems.setOnItemClickListener(itemClickListener);

        return view;
    }
}