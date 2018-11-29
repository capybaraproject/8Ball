package app.capy.a8ball.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import app.capy.a8ball.R;

public class AnswersAddingActivity extends AppCompatActivity {
    EditText etAnswer;
    ListView lvAnswers;
    ArrayList<String> listAnswer =new ArrayList<>();
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers_adding);
        lvAnswers=findViewById(R.id.lvAnswers);
        etAnswer = findViewById(R.id.etAddAnswer);
        adapter =   new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listAnswer);
        lvAnswers.setAdapter(adapter);
    }



    public void addAnswerToList(View view) {



        String userAnswer = etAnswer.getText().toString();
        listAnswer.add(userAnswer);
        adapter.add(userAnswer);
     
        etAnswer.setText("");





    }

}
