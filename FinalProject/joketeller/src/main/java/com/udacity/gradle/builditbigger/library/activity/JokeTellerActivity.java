package com.udacity.gradle.builditbigger.library.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.udacity.gradle.builditbigger.library.R;
import com.udacity.gradle.builditbigger.library.consents.IntentConstants;

public class JokeTellerActivity extends AppCompatActivity {

    private TextView jokeText;
    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);

        joke = getIntent().getStringExtra(IntentConstants.EXTRA_TELL_JOKE);
        jokeText = (TextView) findViewById(R.id.joke_label);

        jokeText.setText(joke);
    }
}
