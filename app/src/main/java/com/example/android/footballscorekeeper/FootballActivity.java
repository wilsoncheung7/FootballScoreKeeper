package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FootballActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
    }
    /**
     * Displays the given score for Team A.
     */
    int scoreA=0;
    int scoreB=0;
    int yellowCardA=0;
    int yellowCardB=0;
    int redCardA=0;
    int redCardB=0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamA_yellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamA_red(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB_yellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB_red(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }
    public void goal_A(View view){
        scoreA++;
        displayForTeamA(scoreA);
    }
    public void yellow_A(View view){
        yellowCardA++;
        displayForTeamA_yellow(yellowCardA);
    }
    public void red_A(View view){
        redCardA++;
        displayForTeamA_red(redCardA);
    }
    public void goal_B(View view){
        scoreB++;
        displayForTeamB(scoreB);
    }
    public void yellow_B(View view){
        yellowCardB++;
        displayForTeamB_yellow(yellowCardB);
    }
    public void red_B(View view){
        redCardB++;
        displayForTeamB_red(redCardB);
    }
    public void resetButton(View view){
        scoreA=0;
        yellowCardA=0;
        redCardA=0;
        scoreB=0;
        yellowCardB=0;
        redCardB=0;
        displayForTeamA(scoreA);
        displayForTeamA_yellow(yellowCardA);
        displayForTeamA_red(redCardA);
        displayForTeamB(scoreB);
        displayForTeamB_yellow(yellowCardB);
        displayForTeamB_red(redCardB);
    }
}
