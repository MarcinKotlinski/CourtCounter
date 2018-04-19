package com.example.marcin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    int scoreA;
    int scoreB;

    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }


    public void threeA(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void twoA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void oneA(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }


    public void threeB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void twoB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void oneB(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }


    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);

    }
}
