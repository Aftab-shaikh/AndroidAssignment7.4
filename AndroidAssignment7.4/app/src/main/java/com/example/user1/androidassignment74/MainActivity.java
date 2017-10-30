package com.example.user1.androidassignment74;
/*
  This project is to explain about explicit intent
  in this project shown the example of explicit intent with login page to
  move data from one activity to another.

 */


// Required Class imported
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


// Class started here
public class MainActivity extends AppCompatActivity {


    // Some private reference variable.
    private EditText namebar;
    private EditText phnumbar;
    private Button loginbutton;

    @Override

    // Oncreat method which work as main method in JAVA.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Id's assinged to name bar and phone number bar and login button
        namebar= (EditText) findViewById(R.id.edittext1);
        phnumbar= (EditText) findViewById(R.id.editText2);
        loginbutton= (Button) findViewById(R.id.button1);


        // click listner to button to perfom action on click of button.
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //take data from user and sstored in name variable and phnum.
                String name = namebar.getText().toString();
                String phnum= phnumbar.getText().toString();

                    // Intent to perform action to move to next activity
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                     // Bundle class to set key value for data and move to another activity
                    Bundle bundle= new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("phonenum",phnum);
                    i.putExtras(bundle);

                    // start activity to start Intent.
                    startActivity(i);

            }
        });


    }
}// Class closed.
