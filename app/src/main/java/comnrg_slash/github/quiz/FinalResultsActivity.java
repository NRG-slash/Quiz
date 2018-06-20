package comnrg_slash.github.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_results);

        TextView finalResults = (TextView)findViewById(R.id.tv_answer);

        int finalNumber = getIntent().getIntExtra("SCORE_EXTRA",0);

        if (finalNumber < 40){
            finalResults.setText("You are Ruby Rose");
        }
        else if (finalNumber < 80){
            finalResults.setText("You are Weiss Schnee");
        }
        else if (finalNumber < 120){
            finalResults.setText("You are Blake Belladonna");
        }
        else{
            finalResults.setText("You are Yang Xiao Long");
        }
    }
}
