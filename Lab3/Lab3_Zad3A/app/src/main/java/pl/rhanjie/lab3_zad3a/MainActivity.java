package pl.rhanjie.lab3_zad3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText emailEditText;
    EditText reveiverEditText;
    EditText subjectEditText;
    EditText messageEditText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = (EditText) findViewById(R.id.email);
        reveiverEditText = (EditText) findViewById(R.id.to);
        subjectEditText = (EditText) findViewById(R.id.subject);
        messageEditText = (EditText) findViewById(R.id.message);

        sendButton = (Button) findViewById(R.id.send);
        sendButton.setOnClickListener(v -> {
            sendMail();
        });
    }

    private void sendMail() {
        String mail = emailEditText.getText().toString();
        String recipient = reveiverEditText.getText().toString();
        String subject = subjectEditText.getText().toString();
        String message = messageEditText.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, mail);
        intent.putExtra(Intent.EXTRA_EMAIL, recipient);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc882");

        Resources resources = getResources();
        startActivity(Intent.createChooser(intent, resources.getString(R.string.choose_app)));
    }
}