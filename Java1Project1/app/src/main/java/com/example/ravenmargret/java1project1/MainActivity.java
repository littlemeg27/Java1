package com.example.ravenmargret.java1project1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main()
    {
        ArrayList<String> arrayObject= new ArrayList<String>();
        JButton button = new JButton();
        JtextField textBox = new JtextField ();

        button.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                //inside your action listener:
                String add_item_to_array = textBox.getText().trim();
                arrayObject.add(add_item_to_array);


            }
        });
    }


}


