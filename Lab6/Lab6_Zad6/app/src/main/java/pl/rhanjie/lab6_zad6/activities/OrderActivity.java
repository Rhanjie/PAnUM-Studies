package pl.rhanjie.lab6_zad6.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import pl.rhanjie.lab6_zad6.CustomAppCompatActivity;
import pl.rhanjie.lab6_zad6.R;

public class OrderActivity extends CustomAppCompatActivity
{
    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        contentView = R.layout.activity_order;

        super.onCreate(savedInstanceState);

        Button sendButton = findViewById(R.id.SendButton);
        sendButton.setOnClickListener(v -> {
            sendMessage();
        });
    }

    private void sendMessage() {
        Resources resources = getResources();

        String email = ((EditText) findViewById(R.id.RecipientMailAddress)).getText().toString();
        String subject = ((EditText) findViewById(R.id.TitleMail)).getText().toString();
        String message = ((EditText) findViewById(R.id.MailText)).getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_EMAIL, "admin@cafeterra.pl");
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc882");

        startActivity(Intent.createChooser(intent, resources.getString(R.string.choose_app)));
    }
}