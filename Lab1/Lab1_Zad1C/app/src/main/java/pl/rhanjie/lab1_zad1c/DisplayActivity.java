package pl.rhanjie.lab1_zad1c;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";

    private TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.display_activity);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);

        messageView = (TextView)findViewById(R.id.messageBox);
        messageView.setText(messageText);
    }
}