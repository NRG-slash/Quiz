package comnrg_slash.github.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {

    private TextView qSecondQuestion;

    private ListView qQuestion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        qSecondQuestion = (TextView) findViewById(R.id.tv_q2);

        qQuestion2 = (ListView) findViewById(R.id.lv_question2);

        String[] answers2 = new String[]{"Milk","Coffee","Tea","Water"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,answers2);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent goToQuestion3 = new Intent(Question2.this, Question3.class);

                goToQuestion3.putExtra("SCORE_EXTRA", getIntent().getIntExtra("SCORE_EXTRA", 0) + position*10);

                startActivity(goToQuestion3);
            }
        };

            qQuestion2.setAdapter(arrayAdapter);
            qQuestion2.setOnItemClickListener(itemClickListener);

    }
}
