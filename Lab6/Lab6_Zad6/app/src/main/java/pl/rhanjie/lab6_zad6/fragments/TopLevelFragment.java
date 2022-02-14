package pl.rhanjie.lab6_zad6.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.activities.CafeCategoryActivity;
import pl.rhanjie.lab6_zad6.activities.DrinkCategoryActivity;
import pl.rhanjie.lab6_zad6.activities.SupportActivity;
import pl.rhanjie.lab6_zad6.activities.SnackCategoryActivity;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class TopLevelFragment extends Fragment {
    public TopLevelFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Activity activity = getActivity();
        View view = inflater.inflate(R.layout.fragment_top_level, container, false);

        AdapterView.OnItemClickListener itemClickListener = (listView, v, position, id) -> {
            Intent intent;
            switch (position) {
                case 0: {
                    intent = new Intent(activity, DrinkCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                case 1: {
                    intent = new Intent(activity, SnackCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                case 2: {
                    intent = new Intent(activity, CafeCategoryActivity.class);

                    startActivity(intent);
                    break;
                }

                default: {
                    System.out.println("Unknown option!");
                    break;
                }
            }
        };

        ListView listView = view.findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

        Button sendButton = view.findViewById(R.id.buttonSendMessageTop);
        sendButton.setOnClickListener(v -> {
            Intent intent = new Intent(activity, SupportActivity.class);

            startActivity(intent);
        });

        return view;
    }
}