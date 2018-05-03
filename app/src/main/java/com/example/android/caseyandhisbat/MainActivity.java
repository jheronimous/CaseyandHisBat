package com.example.android.caseyandhisbat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.caseyandhisbat.R;

public class MainActivity extends AppCompatActivity {
    int scoreMudville = 0;
    int scoreVisitor = 0;
    int strikeMudville = 0;
    int strikeVisitor = 0;
    int ballMudville = 0;
    int ballVisitor = 0;
    int outMudville = 0;
    int outVisitor = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Mudville Hens by 1 run.
     */
    public void addRunForMudville(View v) {
        scoreMudville = scoreMudville + 1;
        strikeMudville = 0;
        ballMudville = 0;
        displayForMudville(scoreMudville);
        displayForMudvilleStrikes(strikeMudville);
        displayForMudvilleBalls(ballMudville);
    }

    /**
     * Increase the number of strikes for Mudville Hens by 1 strike.
     */
    public void addStrikeForMudville(View v) {
        strikeMudville = strikeMudville + 1;
        if(strikeMudville > 3) strikeMudville = 0;
        displayForMudvilleStrikes(strikeMudville);
    }

    /**
     * Increase the number of balls Mudville Hens by 1 ball.
     */
    public void addBallForMudville(View v) {
        ballMudville = ballMudville + 1;
        if(ballMudville > 4) ballMudville = 0;
        displayForMudvilleBalls(ballMudville);
    }

    /**
     * Increase the number of outs Mudville Hens has by 1 out.
     */
    public void addOutForMudville(View v) {
        outMudville = outMudville + 1;
        strikeMudville =  0;
        ballMudville = 0;
        if(outMudville > 3) outMudville = 0;
        displayForMudvilleOuts(outMudville);
        displayForMudvilleStrikes(strikeMudville);
        displayForMudvilleBalls(ballMudville);

    }

    /**
     * Displays the given score for Mudville Hens.
     */
    public void displayForMudville(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_mudville_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Visiting Team.
     */
    public void displayForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_visitor_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given strikes for Mudville Hens.
     */
    public void displayForMudvilleStrikes(int strikeMudville) {
        TextView strikeView = (TextView) findViewById(R.id.team_mudville_strike);
        strikeView.setText(String.valueOf(strikeMudville));
    }
    /**
     * Displays the given strikes for Visiting Team.
     */
    public void displayForVisitorStrikes(int strikeVisitor) {
        TextView strikeView = (TextView) findViewById(R.id.team_visitor_strike);
        strikeView.setText(String.valueOf(strikeVisitor));
    }
    /**
     * Displays the given balls for Mudville Hens.
     */
    public void displayForMudvilleBalls(int ballMudville) {
        TextView ballView = (TextView) findViewById(R.id.team_mudville_ball);
        ballView.setText(String.valueOf(ballMudville));
    }
    /**
     * Displays the given balls for Visiting Team.
     */
    public void displayForVisitorBalls(int ballVisitor) {
        TextView ballView = (TextView) findViewById(R.id.team_visitor_ball);
        ballView.setText(String.valueOf(ballVisitor));
    }
    /**
     * Displays the given outs for Mudville Hens.
     */
    public void displayForMudvilleOuts(int outMudville) {
        TextView outView = (TextView) findViewById(R.id.team_mudville_out);
        outView.setText(String.valueOf(outMudville));
    }
    /**
     * Displays the given outs for Visiting Team.
     */
    public void displayForVisitorOuts(int outVisitor) {
        TextView outView = (TextView) findViewById(R.id.team_visitor_out);
        outView.setText(String.valueOf(outVisitor));
    }
    /**
     * Increase the number of strikes for Visiting Team by 1 strike.
     */
    public void addStrikeForVisitor(View v) {
        strikeVisitor = strikeVisitor + 1;
        if(strikeVisitor == 3) strikeVisitor = 0;
        displayForVisitorStrikes(strikeVisitor);
        displayForVisitorOuts(outVisitor);
    }

    /**
     * Increase the number of balls for Visiting Team by 1 ball.
     */
    public void addBallForVisitor(View v) {
        ballVisitor = ballVisitor + 1;
        if(ballVisitor > 4) ballVisitor = 0;
        displayForVisitorBalls(ballVisitor);
    }

    /**
     * Increase the score for Visiting Team by 1 run.
     */
    public void addRunForVisitor(View v) {
        scoreVisitor = scoreVisitor + 1;
        strikeVisitor = 0;
        ballVisitor = 0;
        displayForVisitor(scoreVisitor);
        displayForVisitorStrikes(strikeVisitor);
        displayForVisitorBalls(ballVisitor);
    }

    /**
     * Increase the number of outs Visitors have by 1 out.
     */
    public void addOutForVisitor(View v) {
        outVisitor = outVisitor + 1;
        strikeVisitor =  0;
        ballVisitor = 0;
        if(outVisitor > 3) outVisitor = 0;
        displayForVisitorOuts(outVisitor);
        displayForVisitorStrikes(strikeVisitor);
        displayForVisitorBalls(ballVisitor);
    }

    /**
     * Reset all metrics for both teams.
     */
    public void resetScore(View v) {
        scoreVisitor = 0;
        scoreMudville = 0;
        strikeMudville = 0;
        strikeVisitor = 0;
        ballMudville = 0;
        ballVisitor = 0;
        outMudville = 0;
        outVisitor = 0;
        displayForVisitor(scoreVisitor);
        displayForMudville(scoreMudville);
        displayForMudvilleStrikes(strikeMudville);
        displayForVisitorStrikes(strikeVisitor);
        displayForMudvilleBalls(ballMudville);
        displayForVisitorBalls(ballVisitor);
        displayForMudvilleOuts(outMudville);
        displayForVisitorOuts(outVisitor);
    }
    /**
     * Reset balls for both teams.
     */
    public void newAtBat(View v) {
        ballMudville = 0;
        ballVisitor = 0;
        strikeMudville = 0;
        strikeVisitor = 0;
        displayForMudvilleBalls(ballMudville);
        displayForVisitorBalls(ballVisitor);
        displayForMudvilleStrikes(strikeMudville);
        displayForVisitorStrikes(strikeVisitor);
    }
    /**
     * Reset outs for both teams.
     */
    public void resetOuts(View v) {
        outMudville = 0;
        outVisitor = 0;
        ballMudville = 0;
        ballVisitor = 0;
        strikeMudville = 0;
        strikeVisitor = 0;
        displayForMudvilleOuts(outMudville);
        displayForVisitorOuts(outVisitor);
        displayForMudvilleBalls(ballMudville);
        displayForVisitorBalls(ballVisitor);
        displayForMudvilleStrikes(strikeMudville);
        displayForVisitorStrikes(strikeVisitor);
    }
}
