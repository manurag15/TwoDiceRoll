package com.example.twodiceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        Random random = new Random();
        ImageView dice1;
        ImageView dice2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll = (Button)findViewById(R.id.rollButton);
        roll.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View view)
          {
              rollDice();
          }
        });
    }

    public void rollDice()
    {
        dice1 = findViewById(R.id.firstDice);
        dice2 = findViewById(R.id.secondDice);

        int firstInt = random.nextInt(6)+1;
        int secondInt = random.nextInt(6)+1;

        switch(firstInt)
        {
            case 1:
                dice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice1.setImageResource(R.drawable.dice5);
                break;

            case 6:
                dice1.setImageResource(R.drawable.dice6);
                break;
        }

        switch(secondInt)
        {
            case 1:
                dice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice2.setImageResource(R.drawable.dice5);
                break;

            case 6:
                dice2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
