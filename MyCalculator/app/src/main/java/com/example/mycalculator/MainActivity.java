package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonp,buttons,buttonc,buttonAC,buttonm,buttond,button0;
    TextView Value;
    TextView vk;
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
        Value=(TextView)findViewById(R.id.Value);
        vk=(TextView)findViewById(R.id.vk);
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
            try{
            if(Value.getText()==null)
            {
                Value.setText(null);
            }
            else
                {
            v1=Double.parseDouble((Value.getText()+"\0"));
            Value.setText(null);
            k='+';
            vk.setText(Double.toString(v1)+"+");
            }}
            catch(Exception e)
            {
                Toast.makeText(MainActivity.this,"Nothing to add",Toast.LENGTH_SHORT).show();
            }
        }
    });
        buttons.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V)
            {
                try {
                    if (Value.getText() == null) {
                        Value.setText(null);
                    } else {
                        v1 = Double.parseDouble((Value.getText() + "\0"));
                        Value.setText(null);
                        k = '-';
                        vk.setText(Double.toString(v1)+"-");
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,"Nothing to substract",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V)
            {
                try {
                    if (Value.getText() == null) {
                        Value.setText(null);
                    } else {
                        v1 = Double.parseDouble((Value.getText() + "\0"));
                        Value.setText(null);
                        k = '*';
                        vk.setText(Double.toString(v1)+"*");
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,"Nothing to multiply",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttond.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V)
            {
                try{
                if(Value.getText()==null)
                {
                    Value.setText(null);
                }
                else
                {
                    v1=Double.parseDouble((Value.getText()+"\0"));
                    Value.setText(null);
                    k='/';
                    vk.setText(Double.toString(v1)+"/");
                }}
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,"Nothing to divide",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {
                try {
                    if((vk.getText()!=null)&&(Value.getText()==null))
                    {
                        String h=vk.getText().toString();
                        Value.setText(h.substring(0,h.length()-1));
                        k='\0';
                        vk.setText(null);
                    }
                    else if (Value.getText() == null) {
                        Toast.makeText(MainActivity.this,"Nothing to clear",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String o = Value.getText().toString();
                        Value.setText(o.substring(0, o.length() - 1));
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,"Nothing to clear",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                try
                {
                if(k=='\0')
                {
                    Value.setText(Value.getText());
                }
                else
                {
                    String h=Value.getText().toString();
                    v2=Double.parseDouble(h.substring(0,h.length()-1));
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
                }}
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                }
            }
        });
}}
