package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;

import static com.example.calculator.R.id.button;
import static com.example.calculator.R.id.button2;
import static com.example.calculator.R.id.editTextTextPersonName;
import static com.example.calculator.R.id.editTextTextPersonName2;

public class MainActivity extends AppCompatActivity {
    private EditText result;
    private double int_result=0;
    private double last_number=0;
    private int last_action=1;
    private boolean eq=false;
    private String number;
    private boolean is_number=false;
    private boolean is_first=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"1");
        is_number=true;
    }
    public void click2(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"2");
        is_number=true;
    }
    public void click3(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"3");
        is_number=true;

    }
    public void click4(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"4");
        is_number=true;
    }
    public void click5(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"5");
        is_number=true;
    }
    public void click6(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"6");
        is_number=true;
    }

    public void click7(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"7");
        is_number=true;
    }
    public void click8(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"8");
        is_number=true;
    }
    public void click9(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"9");
        is_number=true;
    }
    public void click11(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText(result.getText()+"0");
    }

    public void click12(View view) {
        if(is_number==true) {
            if (eq == false) {
                result = (EditText) findViewById(editTextTextPersonName);
                last_number = Integer.valueOf(result.getText().toString());
                make_action();
                result.setText(String.valueOf(int_result));
                result = (EditText) findViewById(editTextTextPersonName2);
                result.setText(String.valueOf(int_result));
                last_number = 0;
                eq = true;
            }
        }
    }



    public void click13(View view) {
        result = (EditText) findViewById(editTextTextPersonName);
        last_action = 1;
        if(is_number==true) {
            if (eq == false) {
                last_number = Integer.valueOf(result.getText().toString());
                result.setText(result.getText() + "+");
                make_action();
                result.setText("");
                result = (EditText) findViewById(editTextTextPersonName2);
                result.setText(String.valueOf(int_result));
            } else
                result.setText("");
            eq = false;
            is_first = false;
            is_number=false;
        }
    }
    public void click14(View view) {
        result = (EditText) findViewById(editTextTextPersonName);
        last_action = 2;
        if (is_number == true) {
            if (eq == false) {
                last_number = Integer.valueOf(result.getText().toString());
                result.setText(result.getText() + "-");
                if (is_first == true)
                    last_action = 1;
                make_action();
                last_action = 2;
                result.setText("");
                result = (EditText) findViewById(editTextTextPersonName2);
                result.setText(String.valueOf(int_result));
            }
            else
                result.setText("");
            eq = false;
            is_first = false;
            is_number=false;
        }
    }
    public void click15(View view) {
        result=(EditText)findViewById(editTextTextPersonName);
        last_action=3;
        if (is_number == true) {
            if (eq == false) {
                last_number = Integer.valueOf(result.getText().toString());
                result.setText(result.getText() + "*");
                if (is_first == true)
                    last_action = 1;
                make_action();
                last_action = 3;
                result.setText("");
                result = (EditText) findViewById(editTextTextPersonName2);
                result.setText(String.valueOf(int_result));
            }
            else
                result.setText("");
            eq = false;
            is_first = false;
            is_number=false;
        }
    }
    public void click16(View view) {
        result = (EditText) findViewById(editTextTextPersonName);
        last_action = 4;
        if (is_number == true) {
            if (eq == false) {
                last_number = Integer.valueOf(result.getText().toString());
                result.setText(result.getText() + "/");
                if (is_first == true)
                    last_action = 1;
                make_action();
                last_action = 4;
                result.setText("");
                result = (EditText) findViewById(editTextTextPersonName2);
                result.setText(String.valueOf(int_result));
            }
            else
                result.setText("");
            eq = false;
            is_first = false;
            is_number=false;
        }
    }
    public void make_action(){
switch (last_action){
    case 1:
        int_result+=last_number;
        break;
    case 2:
        int_result-=last_number;
        break;
    case 3:
        int_result*=last_number;
        break;
    case 4:
        int_result/=last_number;
        break;
    default:
        break;
}
    }
    public void click10(View view) {
        clear();
    }
    public void clear(){
        result=(EditText)findViewById(editTextTextPersonName);
        result.setText("");
        result=(EditText)findViewById(editTextTextPersonName2);
        result.setText("");
        int_result=0;
        last_action=1;
        last_number=0;
        is_number=false;
        is_first=true;
          eq=false;
    }
}