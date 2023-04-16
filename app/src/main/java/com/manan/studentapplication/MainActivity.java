package com.manan.studentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    RadioGroup Gender;
    Button btn,btn1,btn2;
    RadioButton Male;
    RadioButton Female;
    RadioButton Other;
    dbhandeler dbhandeler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.Name);
        ed2 =findViewById(R.id.Age);
        Gender = findViewById(R.id.Gender);
        btn = findViewById(R.id.Insertdata);
        btn1 = findViewById(R.id.Seekbar);
        btn2 = findViewById(R.id.SeekBar2);
        Male = findViewById(R.id.Male);
        Female = findViewById(R.id.Female);
        Other = findViewById(R.id.Other);
        dbhandeler= new dbhandeler(this);
        String gender1;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().isEmpty())
                {
                    ed1.setError("Please Enter The Name");
                }
                else if(!ed1.getText().toString().matches("[A-Za-z ]+"))
                {
                    ed1.setError("Only String Allow");
                }
                else if(ed2.getText().toString().isEmpty())
                {
                    ed2.setError("Please Enter The Age");
                }
                else if(!ed2.getText().toString().matches("[0-9]+"))
                {
                    ed2.setError("Only Number Allow");
                }
                else if(Gender.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(MainActivity.this, "Please Select the Gender", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String gender1;
                    if(Male.isChecked())
                    {
                         gender1 ="Male";
                        Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                    }
                    else if(Female.isChecked())
                    {
                        gender1 = "Female";
                        Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        gender1="Other";
                        Toast.makeText(MainActivity.this, "Other", Toast.LENGTH_SHORT).show();
                    }

                    dbhandeler.adddata(ed1.getText().toString(),ed2.getText().toString(),gender1);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Sekkbar.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Seekbardata.class);
                startActivity(intent);
            }
        });
    }
}