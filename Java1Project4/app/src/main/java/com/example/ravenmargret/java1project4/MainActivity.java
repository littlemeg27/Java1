package com.example.ravenmargret.java1project4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
{
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)findViewById(R.id.textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.action_do_task)//action_do_task is from the video it hates me and im not sure what to do with it
        {
            if(isOnline())
            {
                requestData();//Request the data connectivity info
            }
            else
            {

            }

            requestData();
        }
        return false;
    }

    private void requestData()
    {
        MyTask task = new MyTask();
        task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "Param 1", "Param 2","Param 3");
    }

    protected void updateDisplay(String message)
    {
        output.append(message + "\n");
    }

    protected boolean isOnline()
    {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();

            if(netInfo != null && netInfo.isConnectedOrConnecting())
            {
                return true;
            }
            else
            {
                return false;
            }
    }

    private class MyTask extends AsyncTask<String, String, String>
    {
        @Override
        protected void onPreExecute()
        {
            updateDisplay("Starting Task");

        }//End of onPreExecute

        @Override
        protected String doInBackground(String...params)
        {

            return "Task Complete";
        }//End of doInBackground

        @Override
        protected void onPostExecute(String result)
        {
            updateDisplay(result);
        }
    }//End of AsyncTask

}
