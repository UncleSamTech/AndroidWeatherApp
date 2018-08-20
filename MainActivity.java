package com.example.samuel.sunshineapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //class declaration of text view and string arrays of weather
    TextView weatherTextView;
    String[] listWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instantiation of the textview to reference the id
        weatherTextView = findViewById(R.id.tv_weather_data);
//storing the list of strings in the array object listWeather
        listWeather=WeatherList.getWeatherList();
        //looping through the list and appending each string in it to the textview
        for(String weather:listWeather){
            weatherTextView.append(weather);
        }
    }
}
