package comnrg_slash.github.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by g.laturski on 6/15/2018.
 */

public class Question4 extends AppCompatActivity {

    private TextView qFourthQuestion;

    private ListView qQuestion4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        qFourthQuestion = (TextView) findViewById(R.id.tv_q4);

        qQuestion4 = (ListView) findViewById(R.id.lv_question4);

        String[] answers4 = new String[]{"Alternate Rock","Classical","Inspirational","Pop"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, answers4);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent goToQuestion5 = new Intent(Question4.this, Question5.class);

                goToQuestion5.putExtra("SCORE_EXTRA", getIntent().getIntExtra("SCORE_EXTRA", 0) + position*10);

                startActivity(goToQuestion5);
            }
        };
    }
}
