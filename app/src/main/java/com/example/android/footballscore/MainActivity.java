package com.example.android.footballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * declaration of variable.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * increase the score for Team A by 1.
     */
    public void addOnePointForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase the fouls committed for Team A by 1.
     */
    public void addFoulForTeamA(View v) {
        String foul = "Fouls: ";
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA );
    }


    /**
     * Displays fouls committed for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increase the given score for Team B by 1.
     */
    public void addOnePointForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase fouls committed by Team A by 1.
     */
        public void addFoulForTeamB(View v){
            foulTeamB = foulTeamB + 1;
            displayFoulForTeamB(foulTeamB);

        }
    /*Displays fouls committed for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * reset score.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}