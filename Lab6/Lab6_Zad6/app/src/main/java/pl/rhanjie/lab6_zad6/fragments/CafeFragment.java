package pl.rhanjie.lab6_zad6.fragments;

import static pl.rhanjie.lab6_zad6.activities.CafeActivity.EXTRA_ITEM;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pl.rhanjie.lab6_zad6.models.Cafe;
import pl.rhanjie.lab6_zad6.R;

public class CafeFragment extends Fragment {
    public CafeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Activity activity = getActivity();
        View view = inflater.inflate(R.layout.fragment_cafe, container, false);

        int cafeId = (Integer)activity.getIntent().getExtras().get(EXTRA_ITEM);
        Cafe cafe = Cafe.cafes[cafeId];

        TextView name = view.findViewById(R.id.name);
        name.setText(cafe.getName());

        TextView adress = view.findViewById(R.id.adress);
        adress.setText(cafe.getAddress());

        TextView openingHours = view.findViewById(R.id.openingHours);
        openingHours.setText(cafe.getOpeningHours());

        return view;
    }
}