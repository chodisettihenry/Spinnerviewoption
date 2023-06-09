package com.example.spinnerviewoptions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    TextView country;
    Spinner spinner;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.textViewResult);
        country = findViewById(R.id.textViewarray);
        spinner=findViewById(R.id.spinnercountries);

        adapter= ArrayAdapter.createFromResource(this,R.array.countries, android.R.layout.simple_spinner_item);
         adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
         spinner.setAdapter(adapter);

         spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 String countries=parent.getItemAtPosition(position).toString();
                 result.setText(countries);


             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {


             }
         });
    }
}