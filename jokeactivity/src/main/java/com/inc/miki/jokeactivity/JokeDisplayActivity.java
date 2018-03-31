package com.inc.miki.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public static String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        String jokeExtra = getIntent().getStringExtra("joke");
        joke = ifEmpty(jokeExtra);
        TextView jokeText = findViewById(R.id.jokeTetx);
        jokeText.setText(joke);
    }

    private String ifEmpty(String joke) {
        if (!joke.equals("")) {
            return joke;
        } else {
            joke = "Error while fetching joke.";
            return joke;
        }
    }
}
