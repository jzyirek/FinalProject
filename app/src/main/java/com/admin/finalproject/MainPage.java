package com.admin.finalproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;

public class MainPage extends AppCompatActivity implements OnClickListener
{
    //buttons
    private Button StartButtonId;

    //text views

    //spinner
    private Spinner GamesSpinnerId;

    //radio buttons
    private RadioButton OnePlayerRadioId;
    private RadioButton TwoPlayerRadioId;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        StartButtonId = (Button) findViewById(R.id.StartButtonId);

        OnePlayerRadioId = (RadioButton) findViewById(R.id.OnePlayerRadioId);
        TwoPlayerRadioId = (RadioButton) findViewById(R.id.TwoPlayerRadioId);

        GamesSpinnerId = (Spinner) findViewById(R.id.GamesSpinnerId);

        this.StartButtonId.setOnClickListener(this);
        Init();
    }

    private void Init()
    {
        OnePlayerRadioId.setClickable(false);
        TwoPlayerRadioId.setChecked(true);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.games_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        GamesSpinnerId.setAdapter(adapter);
    }

    @Override
    public void onClick(View view)
    {
        final MediaPlayer placeTile = MediaPlayer.create(this, R.raw.beep);
        placeTile.start();
        if (view.getId() == R.id.StartButtonId)
        {
            startGame();
        }
    }
private void startGame()
    {
        Intent intent;

        if(GamesSpinnerId.getSelectedItemPosition() == 0)
        {
            intent = new Intent(this, TicTacToe.class);
            startActivity(intent);
        }
    }

}
