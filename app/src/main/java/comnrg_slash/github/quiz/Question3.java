package comnrg_slash.github.quiz;

import android.annotation.SuppressLint;
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

public class Question3 extends AppCompatActivity {

    private TextView qThirdQuestion;

    private ListView qQuestion3;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        qThirdQuestion = (TextView) findViewById(R.id.tv_q3);

        qQuestion3 = (ListView) findViewById(R.id.lv_question3);

        String[] answers3 = new String[]{"Play video games","Play music","Read","Party"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,answers3);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent goToQuestion4 = new Intent(Question3.this, Question4.class);

                goToQuestion4.putExtra("SCORE_Extra",getIntent().getIntExtra("SCORE_EXTRA", 0) + position*10);

                startActivity(goToQuestion4);
            }
        };
    }
}
