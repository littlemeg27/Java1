package com.example.ravenmargret.java1project1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;






public class MainActivity extends ActionBarActivity
{

    private Button button;
    private EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<String> arrayObject = new ArrayList<String>();
        button = (Button)findViewById(R.id.button);
        textBox = (EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //inside your action listener:
                String addItem = textBox.getText().toString();
                arrayObject.add(addItem);

            }
        });

    }


}


