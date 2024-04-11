package com.example.realwordwizard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Game2Activity extends AppCompatActivity {

    private final QuestionLibrary question2Library = new QuestionLibrary();

    private TextView xpCount;
    private TextView questionView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;

    private String answer;
    private int xp = 0;
    private int questionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.game2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent i = getIntent();

        xpCount = (TextView) findViewById(R.id.xpCount);
        questionView = (TextView) findViewById(R.id.question);
        buttonChoice1 = (Button) findViewById(R.id.choice1);
        buttonChoice2 = (Button) findViewById(R.id.choice2);
        buttonChoice3 = (Button) findViewById(R.id.choice3);

        update();


        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonChoice1.getText() == answer) {
                    xp++;
                    updateXP(xp);
                    update();

                    Toast.makeText(Game2Activity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Game2Activity.this, "wrong, the answer was " + answer, Toast.LENGTH_SHORT).show();
                    update();
                }
            }
        });

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonChoice2.getText() == answer) {
                    xp++;
                    updateXP(xp);
                    updateQuestion();

                    Toast.makeText(Game2Activity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Game2Activity.this, "wrong, the answer was " + answer, Toast.LENGTH_SHORT).show();
                    update();
                }
            }
        });

        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (buttonChoice3.getText() == answer) {
                    xp++;
                    updateXP(xp);
                    update();

                    Toast.makeText(Game2Activity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Game2Activity.this, "wrong, the answer was " + answer, Toast.LENGTH_SHORT).show();
                    update();
                }
            }
        });

    }
    private void updateQuestion () {
        questionView.setText(question2Library.getQuestion(questionNumber));
        buttonChoice1.setText(question2Library.getChoice1(questionNumber));
        buttonChoice2.setText(question2Library.getChoice2(questionNumber));
        buttonChoice3.setText(question2Library.getChoice3(questionNumber));

        answer = question2Library.getCorrectAnswer(questionNumber);
        this.questionNumber++;
    }

    private void update () {

        if (this.questionNumber == 9) {

            if (this.xp == 9) {
                Toast.makeText(Game2Activity.this, "LEVEL COMPLETE", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Game2Activity.this, "LEVEL FAILED, RETRY TO COMPLETE", Toast.LENGTH_SHORT).show();
            }

            Intent i = new Intent(this, Settings2Activity.class);
            finish();
            startActivity(i);
        } else {
            updateQuestion();
        }

    }

    private void updateXP ( int x){
        xpCount.setText("" + x);
    }

    public void launchSettings (View v){
        Intent i = new Intent(this, Settings2Activity.class);
        finish();
        startActivity(i);
    }
}
