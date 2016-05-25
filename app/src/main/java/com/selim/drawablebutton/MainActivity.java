package com.selim.drawablebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okButton = (Button) findViewById(R.id.btn_OK);
        Button cancelButton = (Button) findViewById(R.id.btn_Cancel);
        final EditText searchET = (EditText) findViewById(R.id.editText1);

        if (okButton != null) {
            okButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Search Google for your favorite movie,mainActivity.this",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Search Google for your favorite movie, application context",Toast.LENGTH_LONG).show();
                    Toast.makeText(getBaseContext(),"Search Google for your favorite movie, base context",Toast.LENGTH_LONG).show();
                }
            });
        }Toast.makeText(MainActivity.this,"OK button reference null",Toast.LENGTH_LONG).show();

        if(cancelButton!=null){
            cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    searchET.setText("");
                }
            });
        }

        if(searchET!=null){
            searchET.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"You are looking for "+searchET.getText(),Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
