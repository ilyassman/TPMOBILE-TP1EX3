package com.example.tp1ex3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button suivant,quitter;
    private CheckBox chk1,chk2,chk3,chk4;
    private RadioButton oui,non;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        suivant=findViewById(R.id.button4);
        chk1=findViewById(R.id.checkBox);
        chk2=findViewById(R.id.checkBox2);
        chk1=findViewById(R.id.checkBox3);
        chk1=findViewById(R.id.checkBox4);
        oui=findViewById(R.id.radioButton);
        non=findViewById(R.id.radioButton2);
        quitter=findViewById(R.id.button3);
        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();

            }
        });
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,MainActivity2.class);
               if(chk1.isChecked())
                   intent.putExtra("rep1", chk1.getText().toString());
               else if(chk2.isChecked())
                   intent.putExtra("rep1", chk2.getText().toString());
               else if(chk3.isChecked())
                   intent.putExtra("rep1", chk3.getText().toString());
               else if(chk4.isChecked())
                   intent.putExtra("rep1", chk4.getText().toString());
               if(oui.isChecked())
                   intent.putExtra("rep2","OUI");
               else if (non.isChecked()) {
                   intent.putExtra("rep2","NON");
               }

                startActivity(intent);

            }
        });
    }
}