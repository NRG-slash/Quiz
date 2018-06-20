package comnrg_slash.github.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import comnrg_slash.github.quiz.R;

/**
 * Created by g.laturski on 6/18/2018.
 */

public class Question5 extends AppCompatActivity{

    private TextView qFifthQuestion;

    private ListView qQuestion5;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        qFifthQuestion = (TextView)  findViewById(R.id.tv_q5);

        qQuestion5 = (ListView) findViewById(R.id.lv_question5);

        String[] answers5 = new String[]{"Fighter","Mage","Rouge","Barbarian"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,answers5);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent goToAnswer = new Intent(Question5.this,FinalResults.java);

                goToAnswer.putExtra("SCORE_EXTRA", getIntent().getIntExtra("SCORE_EXTRA", 0)+ position*10);

                startActivity(goToAnswer);
            }
        };
    }
}
