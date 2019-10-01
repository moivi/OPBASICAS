package com.example.opbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView rel;
    EditText num1,num2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        rel=(TextView) findViewById(R.id.resultado);
        num1=(EditText) findViewById(R.id.numero1);
        num2=(EditText) findViewById(R.id.numero2);
        btn=(Button) findViewById(R.id.suma);
        //
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int n1 =Integer.parseInt(num1.getText().toString());
        int n2 =Integer.parseInt(num2.getText().toString());
        rel.setText("la suma es "+(n1+n2));
    }
}
