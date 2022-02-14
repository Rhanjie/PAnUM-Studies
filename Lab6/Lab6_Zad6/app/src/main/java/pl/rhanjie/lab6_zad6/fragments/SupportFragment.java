package pl.rhanjie.lab6_zad6.fragments;

import static pl.rhanjie.lab6_zad6.activities.DrinkActivity.EXTRA_ITEM;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import pl.rhanjie.lab6_zad6.R;
import pl.rhanjie.lab6_zad6.models.Drink;

public class SupportFragment extends Fragment {
    public SupportFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Activity activity = getActivity();
        View view = inflater.inflate(R.layout.fragment_support, container, false);

        Button sendButton = view.findViewById(R.id.SendButton);
        sendButton.setOnClickListener(v -> {
            sendMessage(view);
        });

        return view;
    }

    private void sendMessage(View view) {
        Resources resources = getResources();

        String email = ((EditText) view.findViewById(R.id.RecipientMailAddress)).getText().toString();
        String subject = ((EditText) view.findViewById(R.id.TitleMail)).getText().toString();
        String message = ((EditText) view.findViewById(R.id.MailText)).getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_EMAIL, "admin@cafeterra.pl");
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc882");

        startActivity(Intent.createChooser(intent, resources.getString(R.string.choose_app)));
    }
}