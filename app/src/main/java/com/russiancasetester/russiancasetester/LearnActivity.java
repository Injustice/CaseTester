package com.russiancasetester.russiancasetester;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Azmat on 23/01/2015.
 */
public class LearnActivity extends ActionBarActivity {

    private Button trueButton;
    private Button falseButton;
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");
        RetrieveNouns retrieveNouns = new RetrieveNouns(this);
        retrieveNouns.retrieve();
        view = (TextView) findViewById(R.id.textview);
        view.setText(retrieveNouns.getStrLine());
        System.out.println(view.getText());

        trueButton = (Button) findViewById(R.id.trueButton);
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO finish
                Toast.makeText(LearnActivity.this,
                        R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });
        falseButton = (Button) findViewById(R.id.falseButton);
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LearnActivity.this,
                        R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
