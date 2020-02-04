package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonp,buttons,buttonc,buttonAC,buttonm,buttond,button0;
    EditText Value;
    double v1,v2;
    char k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button0=(Button)findViewById(R.id.button0);
        buttonp=(Button)findViewById(R.id.buttonp);
        buttons=(Button)findViewById(R.id.buttons);
        buttonm=(Button)findViewById(R.id.buttonm);
        buttond=(Button)findViewById(R.id.buttond);
        buttonc=(Button)findViewById(R.id.buttonC);
        buttonAC=(Button)findViewById(R.id.buttonAC);
        Value=(EditText)findViewById(R.id.Value);
        button0.setBackgroundColor(Color.RED);
    button0.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View V)
                {
                    Value.setText(Value.getText()+"0");
                }
    });
    button1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"1");
        }
    });
    button2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"2");
        }
    });
    button3.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"3");
        }
    });
    button4.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"4");
        }
    });
    button5.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"5");
        }
    });
    button6.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"6");
        }
    });
    button7.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"7");
        }
    });
    button8.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"8");
        }
    });button9.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            Value.setText(Value.getText()+"9");
        }
    });
    buttonp.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View V)
        {
            if(Value.getText()==null)
            {
                Value.setText(null);
            }
            else
                {
            v1=Double.parseDouble((Value.getText()+"\0"));
            Value.setText(null);
            k='+';
            }
        }
    });
        buttons.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V)
            {
                if(Value.getText()==null)
                {
                    Value.setText(null);
                }
                else
                {
                    v1=Double.parseDouble((Value.getText()+"\0"));
                    Value.setText(null);
                    k='-';
                }
            }
        });
        buttonm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V)
            {
                if(Value.getText()==null)
                {
                    Value.setText(null);
                }
                else
                {
                    v1=Double.parseDouble((Value.getText()+"\0"));
                    Value.setText(null);
                    k='*';
                }
            }
        });
        buttond.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V)
            {
                if(Value.getText()==null)
                {
                    Value.setText(null);
                }
                else
                {
                    v1=Double.parseDouble((Value.getText()+"\0"));
                    Value.setText(null);
                    k='/';
                }
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {
                if (Value.getText() == null) {

                } else {
                    String o = Value.getText().toString();
                    Value.setText(o.substring(0, o.length() - 1));
                }
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(k=='\0')
                {
                    Value.setText(Value.getText());
                }
                else
                {
                    v2=Double.parseDouble(Value.getText()+"\0");
                    double v3=0;
                    switch(k)
                    {
                        case '+':v3=v1+v2;
                        break;
                        case '-':v3=v1-v2;
                        break;
                        case '*':v3=v1*v2;
                        break;
                        case '/':v3=v1/v2;
                        break;
                    }
                    Value.setText(Double.toString(v3));
                }
            }
        });
}}
