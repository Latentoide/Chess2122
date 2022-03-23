package es.ieslavereda.mychess2122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.logging.Logger;

public class App extends AppCompatActivity {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}