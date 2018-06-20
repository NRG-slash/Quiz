package comnrg_slash.github.quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTitle;
    private TextView mFirstQuestion;

    private ListView mQuestion;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = (TextView) findViewById(R.id.tv_title) ;
        mFirstQuestion = (TextView) findViewById(R.id.tv_q1);

        mQuestion = (ListView) findViewById(R.id.lv_question);

        String[] answers = new String[]{"Red","White","Black","Yellow"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, answers);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent goToQuestion2 = new  Intent(MainActivity.this, Question2.class);

                goToQuestion2.putExtra("SCORE_EXTRA", position*10);

                startActivity(goToQuestion2);


            }
        };

        mQuestion.setAdapter(arrayAdapter);
        mQuestion.setOnItemClickListener(itemClickListener);
    }
}
