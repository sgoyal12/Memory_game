package com.example.shubham.memory_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nameenter extends AppCompatActivity {
EditText et1,et2;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nameenter);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        bt=findViewById(R.id.btent);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a,b;
                a= String.valueOf(et1.getText());
                b= String.valueOf(et2.getText());
                Intent i=  new Intent(nameenter.this,gamepage.class);
                i.putExtra("a",a);
                i.putExtra("b",b);
                startActivity(i);
            }
        });
    }
}
