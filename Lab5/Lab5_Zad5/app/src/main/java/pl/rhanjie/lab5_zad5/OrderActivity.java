package pl.rhanjie.lab5_zad5;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class OrderActivity extends CustomAppCompatActivity
{
    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

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