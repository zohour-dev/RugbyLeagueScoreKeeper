package jo.zohour_zo3bi.android_app_developer.rugbyleaguescorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0; // current total score for Team A
    private int teamBScore = 0; // current total score for Team B

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//end onCreate()

    //***************** Team A Methods *****************

    /**
     * Display the given score for Team A
     *
     * @param score Current score value for Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score_view);
        scoreView.setText(String.valueOf(score));
    }//end displayForTeamA()

    /**
     * Add 4 points to the score of Team A according to score using "Try"
     */
    public void TryForTeamA(View view) {
        teamAScore = teamAScore + 4;
        displayForTeamA(teamAScore);
    }//end TryForTeamA()

    /**
     * Add 2 points to the score of Team A according to score using "Goal Kick"
     */
    public void GoalKickForTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }//end GoalKickForTeamA()

    /**
     * Add 2 points to the score of Team A according to score using "Penalty"
     */
    public void PenaltyForTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }//end PenaltyForTeamA()

    /**
     * Add 1 point to the score of Team A according to score using "Drop Goal"
     */
    public void DropGoalForTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }//end DropGoalForTeamA()

    //***************** Team B Methods *****************

    /**
     * Display the given score for Team B
     *
     * @param score Current score value for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score_view);
        scoreView.setText(String.valueOf(score));
    }//end displayForTeamB()

    /**
     * Add 4 points to the score of Team B according to score using "Try"
     */
    public void TryForTeamB(View view) {
        teamBScore = teamBScore + 4;
        displayForTeamB(teamBScore);
    }//end TryForTeamB()

    /**
     * Add 2 points to the score of Team B according to score using "Goal Kick"
     */
    public void GoalKickForTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }//end GoalKickForTeamB()

    /**
     * Add 2 points to the score of Team B according to score using "Penalty"
     */
    public void PenaltyForTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }//end PenaltyForTeamB()

    /**
     * Add 1 point to the score of Team B according to score using "Drop Goal"
     */
    public void DropGoalForTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }//end DropGoalForTeamB()

    /**
     * Reset the score values for both teams A & B to zero
     */
    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }//end resetScore()

}//end MainActivity
