package com.example.ravenmargret.java1project2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.EditText.*;


public class MainActivity extends ActionBarActivity
{

    private Button button;
    private EditText textBox;
    protected Button button2;
    private EditText textBox2;
    private TextView textView;
    private TextView textView2;
    Context mContext;

    int letterCount;
    int wordCount;
    int counter;
    int averageCount;
    int indexNum;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;


        final ArrayList arrayObject = new ArrayList<String>();
        button = (Button)findViewById(R.id.button);
        textBox = (EditText)findViewById(R.id.editText);
        button2 = (Button)findViewById(R.id.button2);
        textBox2 = (EditText)findViewById(R.id.editText2);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);

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
                    textBox.setText(""); //Reset the word text box

                    letterCount = addItem.length(); //Find out the length word
                    //Log.i("letter count", letterCount + "");

                    counter = counter + letterCount; //Find out the total count of the letters
                    //Log.i("total count", counter + "");
                }

                Context context = getApplicationContext();
                CharSequence text = "The word has been added to the list!";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                wordCount = arrayObject.size(); //Find the word count
                //Log.i("word count", wordCount + "");
                textView.setText(String.valueOf("Word Count: " + wordCount)); //Put the text into the text view

                averageCount = counter / wordCount; //Find the average of the letters
                //Log.i("average count", averageCount + "");
                textView2.setText(String.valueOf("Average Letter Count: " + averageCount)); //Put the text into the text view

            }

        }); //End of Button


        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)//Start of second Button
            {


                //Inside the action listener
                indexNum = Integer.parseInt(String.valueOf(textBox2.getText()));

                if (indexNum < arrayObject.size()) //If the size of the array is the size of the index put in
                {
                    //Log.i("index", arrayObject.get(indexNum) + "");
                    textBox2.setText(""); //Reset the number text box
                    String addItem = textBox2.getText().toString();

                    if (!arrayObject.contains(addItem)) //Check to see if there are items inside of the arraylist
                    {
                        String theWord = "";

                        theWord = (String) arrayObject.get(indexNum); //Get the word from the index


                        AlertDialog.Builder dialog = new AlertDialog.Builder(mContext); //Alert set for the index
                        dialog.setTitle("Picked an Index");
                        dialog.setMessage("Index pick of the ArrayList: " + theWord);
                        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {

                            }

                        });

                        dialog.setNegativeButton("Remove", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {

                               arrayObject.remove(indexNum);

                               wordCount = arrayObject.size(); //Find the word count
                               //Log.i("word count", wordCount + "");
                               textView.setText(String.valueOf("Word Count: " + wordCount)); //Put the text into the text view

                            }

                            Context context = getApplicationContext();
                            CharSequence text = "The word has been removed from the list!";
                            int duration = Toast.LENGTH_LONG;

                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();

                        });

                        dialog.show();


                    }





                }
                else //If a number is not picked then show this alert
                {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
                    dialog.setTitle("Picked an Index");
                    dialog.setMessage("The index you picked was invalid");
                    dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {

                        }

                    });
                    dialog.show();
                }
            } //End of onClick

        }); //End of second Button





    }


}



