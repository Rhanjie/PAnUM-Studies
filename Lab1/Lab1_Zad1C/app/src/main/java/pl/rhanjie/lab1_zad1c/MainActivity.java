package pl.rhanjie.lab1_zad1c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        messageView = (EditText)findViewById(R.id.message);
    }

    public void onSendMessage(View view) {
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra(DisplayActivity.EXTRA_MESSAGE, messageText);

        startActivity(intent);
    }
}