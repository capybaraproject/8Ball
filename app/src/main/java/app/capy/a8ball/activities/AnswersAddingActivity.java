package app.capy.a8ball.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import app.capy.a8ball.R;

public class AnswersAddingActivity extends AppCompatActivity {
   private EditText etAnswer;
    private Button btAdd;
    private Button btUpdate;
    private ListView lvAnswers;
  public int itemIndex=0;

    public ListView getLvAnswers() {
        return lvAnswers;
    }

    public void setLvAnswers(ListView lvAnswers) {
        this.lvAnswers = lvAnswers;
    }

    ArrayList<String> listAnswer =new ArrayList<>();
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers_adding);
        btUpdate = findViewById(R.id.btUpdate);
        btAdd= findViewById(R.id.btAdd);
        lvAnswers=findViewById(R.id.lvAnswers);
        etAnswer = findViewById(R.id.etAddAnswer);
        adapter =   new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listAnswer);
        lvAnswers.setAdapter(adapter);
        lvAnswers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                etAnswer.setText(lvAnswers.getItemAtPosition(position).toString());
            itemIndex=position;
             ;}
        });
    }




    public void addAnswerToList(View view) {



        String userAnswer = etAnswer.getText().toString();
        listAnswer.add(userAnswer);


        etAnswer.setText("");


    }


    public void updateMessage(View view) {
        if(!etAnswer.getText().toString().contentEquals("")){
        
      listAnswer.set(itemIndex,etAnswer.getText().toString());
       }
    }
}
