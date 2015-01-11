package com.example.ravenmargret.java1project1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;






public class MainActivity extends ActionBarActivity
{

    private Button button;
    private EditText textBox;
    protected Button button2;
    private EditText textBox2;
    Context mContext;

    int letterCount;
    int wordCount;
    int counter;
    int averageCount;
    Editable indexNum;

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
        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();


        final ArrayList arrayObject = new ArrayList<String>();
        button = (Button)findViewById(R.id.button);
        textBox = (EditText)findViewById(R.id.editText);
        button2 = (Button)findViewById(R.id.button2);
        textBox2 = (EditText)findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)//Start of first Button
            {
                //inside the action listener:
                String addItem = textBox.getText().toString();
                if (!arrayObject.contains(addItem))
                {
                    arrayObject.add(addItem); //Add item to the array list
                    Log.i("Title", addItem);

                    letterCount = addItem.length(); //Find out the length word
                    Log.i("letter count", letterCount + "");

                    counter = counter + letterCount; //Find out the total count of the letters
                    Log.i("total count", counter + "");
                }

                wordCount = arrayObject.size(); //Find the word count
                Log.i("word count", wordCount + "");

                averageCount = counter / wordCount; //Find the average of the letters
                Log.i("average count", averageCount + "");
            }

        }); //End of Button


        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)//Start of second Button
            {
                //Inside the action listener
                indexNum = textBox2.getText();
                Log.i("index", arrayObject.get(indexNum));

                if()
                {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
                    dialog.setTitle("Picked an Index");
                    dialog.setMessage("Index pick of the ArrayList:");
                    dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which);
                        {

                        }
                    });

                else
                {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
                    dialog.setTitle("Picked an Index");
                    dialog.setMessage("The index you picked was invalid");
                    dialog.setNegativeButton("Cancel", new DialogInterface dialog, int which);
                    {

                    }

                }
            }

        });





    }


}


