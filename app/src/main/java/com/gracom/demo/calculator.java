package com.gracom.demo;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.*;
import org.mariuszgromada.math.mxparser.Expression;
import android.view.View;

import android.os.Bundle;
import android.widget.EditText;

public class calculator extends AppCompatActivity {

    private EditText display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.Display).equals(display.getText().toString())){
                    display.setText("");
                }

            }
        });
    }

    private void updateText(String StrToAdd) {
        String oldStr = display.getText().toString();

        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
    }

        public void ZeroBTN(View view){

            updateText("0");
        }

        public void OneBTN(View view){

            updateText("1");
        }
        public void TwoBTN (View view){
            updateText("2");
        }
        public void ThreeBTN (View view){
            updateText("3");
        }
        public void ForBTN (View view){
            updateText("4");
        }
        public void FiveBTN (View view){
            updateText("5");
        }
        public void SixBTN (View view){
            updateText("6");
        }
        public void SevenBTN (View view){
            updateText("7");
        }
        public void EightBTN (View view){
            updateText("8");
        }
        public void NineBTN (View view){
            updateText("9");
        }
        public void ClearBTN (View view){
            display.setText("");
        }
        public void PointBTN (View View){
            updateText(".");
        }
        public void PlusMineBTN (View View){
            updateText("+/-");
        }
        public void DivideBTN (View View){
            updateText("÷");
        }
        public void MultiplicationBTN (View View){
            updateText("×");
        }

        public void EqualBTN (View view){
          String UserExp = display.getText().toString();
           UserExp = UserExp.replaceAll("÷", "/");
            UserExp = UserExp.replaceAll("×", "*");

            Expression exp = new Expression(UserExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setText(result.length());
        }
        public void AddBTN (View view){
            updateText("+");
        }
        public void PercentageBTN (View view){
            updateText("%");
        }
        public void SubstractBTN (View view){
            updateText("-");
        }

    }
