package com.example.timepickerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Referencias
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);

        timePicker.setIs24HourView(true);
    }

    public void onClick(View view){

        int dia = datePicker.getDayOfMonth();
        int mes = datePicker.getMonth() + 1;
        int anio = datePicker.getYear();

        int hora = timePicker.getHour();     
        int minuto = timePicker.getMinute();

        Toast.makeText(this,
                "Fecha: " + dia + "/" + mes + "/" + anio +
                        "\nHora: " + hora + ":" + minuto,
                Toast.LENGTH_LONG).show();
    }
}
