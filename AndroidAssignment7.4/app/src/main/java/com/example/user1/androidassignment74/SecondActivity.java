package com.example.user1.androidassignment74;

/*
 This is Second activity of this project
 to get datd from bundel class and show in text view.
 */


//Required class imported.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


// Class started here.
public class SecondActivity extends AppCompatActivity {

      // private text view refence variable.
      private TextView textview1;



    @Override
    // Oncreat method as main method.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Id assinged to Textview
        textview1= (TextView) findViewById(R.id.textview2A2);


        // Bunddle class refnce to get data from first activity by getExtras method.
        Bundle bundle=getIntent().getExtras();

        // get Data from bundle class and stored in name variable
        String name= (String) bundle.get("name");

        // Set data to text view.
        textview1.setText(name);



    }
} // class closed.

