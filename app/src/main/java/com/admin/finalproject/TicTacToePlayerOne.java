package com.admin.finalproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.TextView;


public class TicTacToePlayerOne extends AppCompatActivity implements View.OnClickListener
{
    private TextView PlayerLabelId;
    private Button UpperLeftButtonId;
    private Button UpperCenterButtonId;
    private Button UpperRightButtonId;
    private Button MiddleLeftButtonId;
    private Button CenterButtonId;
    private Button MiddleRightButtonId;
    private Button LowerLeftButtonId;
    private Button LowerRightButtonId;
    private Button LowerCenterButtonId;
    private Boolean isPlayerOne = true;
    private int playerOneCount = 0;
    private int playerTwoCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        PlayerLabelId = (TextView) findViewById(R.id.PlayerLabelId);
        UpperLeftButtonId = (Button) findViewById(R.id.UpperLeftButtonId);
        UpperCenterButtonId = (Button) findViewById(R.id.UpperCenterButtonId);
        UpperRightButtonId = (Button) findViewById(R.id.UpperRightButtonId);
        MiddleLeftButtonId = (Button) findViewById(R.id.MiddleLeftButtonId);
        CenterButtonId = (Button) findViewById(R.id.CenterButtonId);
        MiddleRightButtonId = (Button) findViewById(R.id.MiddleRightButtonId);
        LowerLeftButtonId = (Button) findViewById(R.id.LowerLeftButtonId);
        LowerRightButtonId = (Button) findViewById(R.id.LowerRightButtonId);
        LowerCenterButtonId = (Button) findViewById(R.id.LowerCenterButtonId);

        UpperLeftButtonId.setOnClickListener(this);
        UpperCenterButtonId.setOnClickListener(this);
        UpperRightButtonId.setOnClickListener(this);
        MiddleLeftButtonId.setOnClickListener(this);
        CenterButtonId.setOnClickListener(this);
        MiddleRightButtonId.setOnClickListener(this);
        LowerLeftButtonId.setOnClickListener(this);
        LowerRightButtonId.setOnClickListener(this);
        LowerCenterButtonId.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        final MediaPlayer placeTile = MediaPlayer.create(this, R.raw.swoosh);

        placeTile.start();

        update(v);
    }

    private void update(View v)
    {
        String PlayerOne = "Player 1 turn";
        String PlayerTwo = "Player 2 turn";

        if(isPlayerOne)
        {
            switch (v.getId())
            {
                case R.id.UpperRightButtonId:
                {
                    UpperRightButtonId.setText("X");
                    UpperRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.UpperCenterButtonId:
                {
                    UpperCenterButtonId.setText("X");
                    UpperCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.UpperLeftButtonId:
                {
                    UpperLeftButtonId.setText("X");
                    UpperLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.MiddleLeftButtonId:
                {
                    MiddleLeftButtonId.setText("X");
                    MiddleLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.CenterButtonId:
                {
                    CenterButtonId.setText("X");
                    CenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.MiddleRightButtonId:
                {
                    MiddleRightButtonId.setText("X");
                    MiddleRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.LowerCenterButtonId:
                {
                    LowerCenterButtonId.setText("X");
                    LowerCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.LowerLeftButtonId:
                {
                    LowerLeftButtonId.setText("X");
                    LowerLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
                case R.id.LowerRightButtonId:
                {
                    LowerRightButtonId.setText("X");
                    LowerRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerTwo);
                    isPlayerOne = false;
                    playerOneCount++;
                    break;
                }
            }
        }

        if(playerOneCount >= 3)
        {
            isVictory(PlayerOne);
        }

        if(!isPlayerOne)
        {
            try {
                Thread.sleep(3500);

            }catch (Exception e)
            {
                e.printStackTrace();
                PlayerLabelId.setText(e.toString());
            }

            if(playerTwoCount < 1 && CenterButtonId.isClickable())
            {
                CenterButtonId.setText("O");
                CenterButtonId.setClickable(false);
                PlayerLabelId.setText(PlayerOne);
                isPlayerOne = true;
                playerTwoCount++;
            }
            else if(playerTwoCount < 1 && !CenterButtonId.isClickable())
            {
                if(UpperRightButtonId.isClickable())
                {
                    UpperRightButtonId.setText("O");
                    UpperRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if(UpperLeftButtonId.isClickable())
                {
                    UpperLeftButtonId.setText("O");
                    UpperLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if(LowerLeftButtonId.isClickable())
                {
                    LowerLeftButtonId.setText("O");
                    LowerLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if(LowerRightButtonId.isClickable())
                {
                    LowerRightButtonId.setText("O");
                    LowerRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;

                }
            }
            else if(playerOneCount >= 2)
            {
                if (UpperLeftButtonId.getText().equals("X") && UpperCenterButtonId.getText().equals("X") && UpperRightButtonId.isClickable()) {
                    UpperRightButtonId.setText("O");
                    UpperRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperLeftButtonId.getText().equals("X") && UpperCenterButtonId.isClickable() && UpperRightButtonId.getText().equals("X")) {
                    UpperCenterButtonId.setText("O");
                    UpperCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperLeftButtonId.isClickable() && UpperCenterButtonId.getText().equals("X") && UpperRightButtonId.getText().equals("X")) {
                    UpperLeftButtonId.setText("O");
                    UpperLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else  if (UpperLeftButtonId.getText().equals("X") && MiddleLeftButtonId.getText().equals("X") && LowerLeftButtonId.isClickable()) {
                    LowerLeftButtonId.setText("O");
                    LowerLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else  if (UpperLeftButtonId.getText().equals("X") && MiddleLeftButtonId.isClickable() && LowerLeftButtonId.getText().equals("X")) {
                    MiddleLeftButtonId.setText("O");
                    MiddleLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperLeftButtonId.isClickable() && MiddleLeftButtonId.getText().equals("X") && LowerLeftButtonId.getText().equals("X")) {
                    UpperLeftButtonId.setText("O");
                    UpperLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (MiddleLeftButtonId.isClickable() && CenterButtonId.getText().equals("X") && MiddleRightButtonId.getText().equals("X")) {
                    MiddleLeftButtonId.setText("O");
                    MiddleLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (MiddleLeftButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && MiddleRightButtonId.isClickable()) {
                    MiddleRightButtonId.setText("O");
                    MiddleRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperCenterButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && LowerCenterButtonId.isClickable()) {
                    LowerCenterButtonId.setText("O");
                    LowerCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperCenterButtonId.isClickable() && CenterButtonId.getText().equals("X") && LowerCenterButtonId.getText().equals("X")) {
                    UpperCenterButtonId.setText("O");
                    UpperCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (LowerLeftButtonId.isClickable() && LowerCenterButtonId.getText().equals("X") && LowerRightButtonId.getText().equals("X")) {
                    LowerLeftButtonId.setText("O");
                    LowerLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (LowerLeftButtonId.getText().equals("X") && LowerCenterButtonId.isClickable() && LowerRightButtonId.getText().equals("X")) {
                    LowerCenterButtonId.setText("O");
                    LowerCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (LowerLeftButtonId.getText().equals("X") && LowerCenterButtonId.getText().equals("X") && LowerRightButtonId.isClickable()) {
                    LowerRightButtonId.setText("O");
                    LowerRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperRightButtonId.getText().equals("X") && MiddleRightButtonId.getText().equals("X") && LowerRightButtonId.isClickable()) {
                    LowerRightButtonId.setText("O");
                    LowerRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperRightButtonId.getText().equals("X") && MiddleRightButtonId.isClickable() && LowerRightButtonId.getText().equals("X")) {
                    MiddleRightButtonId.setText("O");
                    MiddleRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperRightButtonId.isClickable() && MiddleRightButtonId.getText().equals("X") && LowerRightButtonId.getText().equals("X")) {
                    UpperRightButtonId.setText("O");
                    UpperRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperRightButtonId.isClickable() && CenterButtonId.getText().equals("X") && LowerLeftButtonId.getText().equals("X")) {
                    UpperRightButtonId.setText("O");
                    UpperRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperRightButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && LowerLeftButtonId.isClickable()) {
                    LowerLeftButtonId.setText("O");
                    LowerLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperLeftButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && LowerRightButtonId.isClickable()) {
                    LowerRightButtonId.setText("O");
                    LowerRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if (UpperLeftButtonId.isClickable() && CenterButtonId.getText().equals("X") && LowerRightButtonId.getText().equals("X")) {
                    UpperLeftButtonId.setText("O");
                    UpperLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if(LowerCenterButtonId.isClickable())
                {
                    LowerCenterButtonId.setText("O");
                    LowerCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if(MiddleLeftButtonId.isClickable())
                {
                    MiddleLeftButtonId.setText("O");
                    MiddleLeftButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if(MiddleRightButtonId.isClickable())
                {
                    MiddleRightButtonId.setText("O");
                    MiddleRightButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
                else if(UpperCenterButtonId.isClickable())
                {
                    UpperCenterButtonId.setText("O");
                    UpperCenterButtonId.setClickable(false);
                    PlayerLabelId.setText(PlayerOne);
                    isPlayerOne = true;
                    playerTwoCount++;
                }
            }
        }

        if(playerTwoCount >= 3)
        {
            isVictory(PlayerTwo);
        }
    }

    private void isVictory(String currentPlayer)
    {
        final MediaPlayer victory = MediaPlayer.create(this, R.raw.victory);
        boolean isCurrentPlayerOne;
        String playerOneVictory = "Player One Wins";
        String playerTwoVictory = "Player Two Wins";

        if(currentPlayer.equals("Player 1 turn"))
        {
            isCurrentPlayerOne = true;
        }
        else
        {
            isCurrentPlayerOne = false;
        }

        if(isCurrentPlayerOne)
        {
            try {
                Thread.sleep(500);

            }catch (Exception e){
                e.printStackTrace();
            }

            if(UpperRightButtonId.getText().equals("X") && UpperLeftButtonId.getText().equals("X") && UpperCenterButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(UpperRightButtonId,UpperLeftButtonId,UpperCenterButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(MiddleLeftButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && MiddleRightButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(MiddleLeftButtonId,CenterButtonId,MiddleRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(LowerCenterButtonId.getText().equals("X") && LowerLeftButtonId.getText().equals("X") && LowerRightButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(LowerCenterButtonId,LowerLeftButtonId,LowerRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperRightButtonId.getText().equals("X") && MiddleRightButtonId.getText().equals("X") && LowerRightButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(UpperRightButtonId,MiddleRightButtonId,LowerRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperCenterButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && LowerCenterButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(UpperCenterButtonId,CenterButtonId,LowerCenterButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperLeftButtonId.getText().equals("X") && MiddleLeftButtonId.getText().equals("X") && LowerLeftButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(UpperLeftButtonId,MiddleLeftButtonId,LowerLeftButtonId);
                victory.start();
                disableUnusedBoxes();
            }

            else if(UpperRightButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && LowerLeftButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(UpperRightButtonId,CenterButtonId,LowerLeftButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperLeftButtonId.getText().equals("X") && CenterButtonId.getText().equals("X") && LowerRightButtonId.getText().equals("X"))
            {
                PlayerLabelId.setText(playerOneVictory);
                victoryFlash(UpperLeftButtonId,CenterButtonId,LowerRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(playerOneCount + playerTwoCount >= 9)
            {
                PlayerLabelId.setText("Tie Game");
            }

        }
        else
        {
            try {
                Thread.sleep(500);

            }catch (Exception e){
                e.printStackTrace();
            }

            if(UpperRightButtonId.getText().equals("O") && UpperLeftButtonId.getText().equals("O") && UpperCenterButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(UpperRightButtonId,UpperLeftButtonId,UpperCenterButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(MiddleLeftButtonId.getText().equals("O") && CenterButtonId.getText().equals("O") && MiddleRightButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(MiddleLeftButtonId,CenterButtonId,MiddleRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(LowerCenterButtonId.getText().equals("O") && LowerLeftButtonId.getText().equals("O") && LowerRightButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(LowerCenterButtonId,LowerLeftButtonId,LowerRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperRightButtonId.getText().equals("O") && MiddleRightButtonId.getText().equals("O") && LowerRightButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(UpperRightButtonId,MiddleRightButtonId,LowerRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperCenterButtonId.getText().equals("O") && CenterButtonId.getText().equals("O") && LowerCenterButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(UpperCenterButtonId,CenterButtonId,LowerCenterButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperLeftButtonId.getText().equals("O") && MiddleLeftButtonId.getText().equals("O") && LowerLeftButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(UpperLeftButtonId,MiddleLeftButtonId,LowerLeftButtonId);
                victory.start();
                disableUnusedBoxes();
            }

            else if(UpperRightButtonId.getText().equals("O") && CenterButtonId.getText().equals("O") && LowerLeftButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(UpperRightButtonId,CenterButtonId,LowerLeftButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(UpperLeftButtonId.getText().equals("O") && CenterButtonId.getText().equals("O") && LowerRightButtonId.getText().equals("O"))
            {
                PlayerLabelId.setText(playerTwoVictory);
                victoryFlash(UpperLeftButtonId,CenterButtonId,LowerRightButtonId);
                victory.start();
                disableUnusedBoxes();
            }
            else if(playerOneCount + playerTwoCount >= 9)
            {
                PlayerLabelId.setText("Tie Game");
            }
        }
    }

    private void disableUnusedBoxes()
    {
        UpperLeftButtonId.setClickable(false);
        UpperCenterButtonId.setClickable(false);
        UpperRightButtonId.setClickable(false);
        MiddleLeftButtonId.setClickable(false);
        CenterButtonId.setClickable(false);
        MiddleRightButtonId.setClickable(false);
        LowerLeftButtonId.setClickable(false);
        LowerRightButtonId.setClickable(false);
        LowerCenterButtonId.setClickable(false);
    }

    private void victoryFlash(Button first, Button second, Button third)
    {
        Animation vAnimation = new AlphaAnimation(1,0);
        vAnimation.setDuration(200);
        vAnimation.setInterpolator(new LinearInterpolator());
        vAnimation.setRepeatCount(10);
        vAnimation.setRepeatMode(Animation.INFINITE);

        first.startAnimation(vAnimation);
        second.startAnimation(vAnimation);
        third.startAnimation(vAnimation);
    }
}
