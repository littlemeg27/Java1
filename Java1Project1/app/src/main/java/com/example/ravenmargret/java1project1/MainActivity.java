package com.example.ravenmargret.java1project1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
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
    Context mContext;

    int letterCount;
    int wordCount;
    int counter;
    int averageCount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        // Alert Dialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
        dialog.setTitle("Sample Alert Dialog");
        dialog.setMessage("This is our sample Alert Dialog!");
        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();


        final ArrayList<String> arrayObject = new ArrayList<String>();
        button = (Button)findViewById(R.id.button);
        textBox = (EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //inside the action listener:
                String addItem = textBox.getText().toString();
                if(!arrayObject.contains(addItem))
                {
                    arrayObject.add(addItem); //Add item to the array list
                    Log.i("Title",addItem);

                    letterCount = addItem.length(); //Find out the length word
                    Log.i("letter count",letterCount+"");

                    counter = counter + letterCount; //Find out the total count of the letters
                    Log.i("total count",counter+"");
                }

                wordCount = arrayObject.size(); //Find the word count
                Log.i("word count",wordCount+"");

                averageCount = counter/wordCount; //Find the average of the letters
                Log.i("average count",averageCount+"");
            }
        });


    }


}


