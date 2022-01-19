package pl.rhanjie.lab1_zad1b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {
    private EditText text;
    private EditText valueText;

    private RadioButton kelvinButton;
    private RadioButton fahrenheitButton;

    public static float convertCelsiusToFahrenheit(float celsius)
    {
        return (celsius * 9 / 5) + 32;
    }

    public static float convertCelsiusToKelvin(float celsius)
    {
        return (float) (celsius + 273.15);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.inputValue);
        valueText = (EditText) findViewById(R.id.valueField);

        kelvinButton = (RadioButton) findViewById(R.id.radio0);
        fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.button) {
            if (text.getText().length() == 0) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();

                return;
            }

            float inputValue = Float.parseFloat(text.getText().toString());

            if (kelvinButton.isChecked()) {
                valueText.setText(String.valueOf(convertCelsiusToKelvin(inputValue) + "°K"));

                return;
            }

            valueText.setText(String.valueOf(convertCelsiusToFahrenheit(inputValue)) + "°F");
        }
    }
}