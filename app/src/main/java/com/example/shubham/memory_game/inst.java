package com.example.shubham.memory_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inst extends AppCompatActivity {
Button bt_12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst);
        bt_12 = findViewById(R.id.bt100);
        bt_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(inst.this , selectpage.class);
                startActivity(i4);

            }
        });
    }
}
