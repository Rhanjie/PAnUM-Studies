package pl.rhanjie.lab1_zad1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();

        TextView dateTextView = findViewById(R.id.DateText);
        dateTextView.setText(formatter.format(now));

        DayOfWeek day = now.getDayOfWeek();

        TextView dayTextView = findViewById(R.id.DayText);
        dayTextView.setText(day.toString());
    }
}