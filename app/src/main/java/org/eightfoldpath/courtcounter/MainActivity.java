package org.eightfoldpath.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam;
    int scoreVisitors;

    private static int TOUCHDOWN = 6;
    private static int PAT = 1;
    private static int TWO_POINT_CONVERSION = 2;
    private static int FIELD_GOAL = 3;
    private static int SAFETY = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreHomeTeam = 0;
        scoreVisitors = 0;
    }

    /**
     * Displays the given score for Home Team.
     */
    public void displayScoreForHomeTeam() {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(scoreHomeTeam));
    }

    public void scoreTouchdownForHomeTeam(View view) {
        scoreHomeTeam += TOUCHDOWN;
        displayScoreForHomeTeam();
    }

    public void scoreExtraPointForHomeTeam(View view) {
        scoreHomeTeam += PAT;
        displayScoreForHomeTeam();
    }

    public void scoreTwoPointConversionForHomeTeam(View view) {
        scoreHomeTeam += TWO_POINT_CONVERSION;
        displayScoreForHomeTeam();
    }

    public void scoreFieldGoalForHomeTeam(View view) {
        scoreHomeTeam += FIELD_GOAL;
        displayScoreForHomeTeam();
    }

    public void scoreSafetyForHomeTeam(View view) {
        scoreHomeTeam += SAFETY;
        displayScoreForHomeTeam();
    }

    /**
     * Displays the given score for Visiting Team.
     */
    public void displayScoreForVisitors() {
        TextView scoreView = (TextView) findViewById(R.id.visitors_score);
        scoreView.setText(String.valueOf(scoreVisitors));
    }

    public void scoreTouchdownForVisitors(View view) {
        scoreVisitors += TOUCHDOWN;
        displayScoreForVisitors();
    }

    public void scoreExtraPointForVisitors(View view) {
        scoreVisitors += PAT;
        displayScoreForVisitors();
    }

    public void scoreTwoPointConversionForVisitors(View view) {
        scoreVisitors += TWO_POINT_CONVERSION;
        displayScoreForVisitors();
    }

    public void scoreFieldGoalForVisitors(View view) {
        scoreVisitors += FIELD_GOAL;
        displayScoreForVisitors();
    }

    public void scoreSafetyForVisitors(View view) {
        scoreVisitors += SAFETY;
        displayScoreForVisitors();
    }

    public void reset(View view) {
        scoreHomeTeam = 0;
        scoreVisitors = 0;
        displayScoreForHomeTeam();
        displayScoreForVisitors();
    }

}
