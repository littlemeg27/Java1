 //Created by Brenna Pavlinchak on 1/21/15


package com.example.ravenmargret.java1project3;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;


public class MainActivity extends ActionBarActivity
{
    Context mContext;
    TextView breed;
    TextView type;
    TextView hairType;
    TextView color;
    TextView temperament;
    TextView age;
    ListView listView;
    HashMap <String, Dogs> dogs = new HashMap<String, Dogs>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        //listView = (ListView)findViewById(R.id.listView);
        breed = (TextView)findViewById(R.id.breed);
        type = (TextView)findViewById(R.id.type);
        hairType = (TextView)findViewById(R.id.hairType);
        color = (TextView)findViewById(R.id.color);
        temperament = (TextView)findViewById(R.id.temperament);
        age = (TextView)findViewById(R.id.age);

        dogs.put("Golden Retriever", new Dogs("Golden Retriever", "Sporting","Medium Coat","Red & Gold","Reliable, Friendly, Kind","11 Years"));
        dogs.put("Standard Poodle", new Dogs("Standard Poodle", "Non-Sporting","Wavy Coat","Various","Eager to please","12 Years"));
        dogs.put("Greyhound", new Dogs("Greyhound", "Hound","Smooth Coat","Various","Even Tempered, Athletic, Gentle","15 Years"));
        dogs.put("Great Dane", new Dogs("Great Dane", "Sporting","Smooth Coat","Various","Devoted, Reserved, Gentle","8 Years"));
        dogs.put("Alaskan Malamute", new Dogs("Alaskan Malamute", "Working","Medium Coat","Black, Grey & White","Playful, Devoted, Loyal","13 to 16 years"));
        dogs.put("Giant Schnauzer", new Dogs("Giant Schnauzer", "Working","Medium Coat","Black","Strong Willed, Loyal, Kind","10 Years"));
        dogs.put("Airedale Terrier", new Dogs("Airedale Terrier", "Terrier","Wavy Coat","Brown and Black","Outgoing, Alert, Friendly","11.5 Years"));
    }

}
