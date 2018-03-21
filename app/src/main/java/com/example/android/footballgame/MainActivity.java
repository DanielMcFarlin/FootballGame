package com.example.android.footballgame;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Global Variables Are:
    int scoreCowboys = 0;
    int scoreEagles = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Cowboys.
     */
    public void displayForCowboys(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cowboys_score);
        scoreView.setText(String.valueOf(score));
    }

    //  Add 6 points for Touchdown for the Cowboys when clicked
    public void TouchdownCowboys(View view) {
        scoreCowboys += 6;
        displayForCowboys(scoreCowboys);
    }

    //  Add 1 point for the Extra Point for the Cowboys when clicked
    public void ExtraPointCowboys(View view) {
        scoreCowboys += 1;
        displayForCowboys(scoreCowboys);
    }

    //  Add 3 points for a Field Goal by the Cowboys when clicked
    public void FieldGoalCowboys(View view) {
        scoreCowboys += 3;
        displayForCowboys(scoreCowboys);
    }

    /**
     * Displays the given score for Eagles.
     */
    public void displayForEagles(int score) {
        TextView scoreView = (TextView) findViewById(R.id.eagles_score);
        scoreView.setText(String.valueOf(score));
    }

    //  Add 6 points for Touchdown for the Eagles when clicked
    public void TouchdownEagles(View view) {
        scoreEagles += 6;
        displayForEagles(scoreEagles);
    }

    //  Add 1 point for the Extra Point for the Eagles when clicked
    public void ExtraPointEagles(View view) {
        scoreEagles += 1;
        displayForEagles(scoreEagles);
    }

    //  Add 3 points for a Field Goal by the Eagles when clicked
    public void FieldGoalEagles(View view) {
        scoreEagles += 3;
        displayForEagles(scoreEagles);
    }

    public void resetScore(View view) {
        scoreCowboys = 0;
        scoreEagles = 0;
        displayForCowboys(scoreCowboys);
        displayForEagles(scoreEagles);
    }
}
