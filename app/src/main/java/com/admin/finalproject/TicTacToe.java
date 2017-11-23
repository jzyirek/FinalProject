package com.admin.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TicTacToe extends AppCompatActivity implements View.OnClickListener
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


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        PlayerLabelId = (TextView) findViewById(R.id.PlayerLabelId);
        UpperLeftButtonId = (Button) findViewById(R.id.UpperRightButtonId);
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
        if(isPlayerOne)
        {
            switch (v.getId())
            {
                case R.id.UpperRightButtonId:
                {
                    UpperRightButtonId.setText("X");
                    UpperRightButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.UpperCenterButtonId:
                {
                    UpperCenterButtonId.setText("X");
                    UpperCenterButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.UpperLeftButtonId:
                {
                    UpperLeftButtonId.setText("X");
                    UpperLeftButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.MiddleLeftButtonId:
                {
                    MiddleLeftButtonId.setText("X");
                    MiddleLeftButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.CenterButtonId:
                {
                    CenterButtonId.setText("X");
                    CenterButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.MiddleRightButtonId:
                {
                    MiddleRightButtonId.setText("X");
                    MiddleRightButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.LowerCenterButtonId:
                {
                    LowerCenterButtonId.setText("X");
                    LowerCenterButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.LowerLeftButtonId:
                {
                    LowerLeftButtonId.setText("X");
                    LowerLeftButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
                case R.id.LowerRightButtonId:
                {
                    LowerRightButtonId.setText("X");
                    LowerRightButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 2 turn");
                    isPlayerOne = false;
                    break;
                }
            }
        }
        else
        {
            switch (v.getId())
            {
                case R.id.UpperRightButtonId:
                {
                    UpperRightButtonId.setText("O");
                    UpperRightButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.UpperCenterButtonId:
                {
                    UpperRightButtonId.setText("O");
                    UpperCenterButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.UpperLeftButtonId:
                {
                    UpperRightButtonId.setText("O");
                    UpperLeftButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.MiddleLeftButtonId:
                {
                    UpperRightButtonId.setText("O");
                    MiddleLeftButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.CenterButtonId:
                {
                    UpperRightButtonId.setText("O");
                    CenterButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.MiddleRightButtonId:
                {
                    UpperRightButtonId.setText("O");
                    MiddleRightButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.LowerCenterButtonId:
                {
                    UpperRightButtonId.setText("O");
                    LowerCenterButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.LowerLeftButtonId:
                {
                    UpperRightButtonId.setText("O");
                    LowerLeftButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
                case R.id.LowerRightButtonId:
                {
                    UpperRightButtonId.setText("O");
                    LowerRightButtonId.setClickable(false);
                    PlayerLabelId.setText("Player 1 turn");
                    isPlayerOne = true;
                    break;
                }
            }

        }

    }

    private void update()
    {

    }
}
