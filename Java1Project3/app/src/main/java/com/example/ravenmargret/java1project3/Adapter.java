//Created by Brenna Pavlinchak on 1/22/15

package com.example.ravenmargret.java1project3;


import android.content.Context;
import android.widget.BaseAdapter;

import java.util.HashMap;
import java.util.Map;

public class Adapter extends BaseAdapter
{
    Context mContext;
    HashMap<String, Dogs> mObjects;
    private static final int ID_CONSTANT = 0x1000000;

    public Adapter(Context d, HashMap<String, Dogs> objects)
    {
        mContext = d;
        mObjects = objects;
    }

    @Override
    public int getCount()
    {
        if(mObjects != null)
        {
            return mObjects.size();
        }

        else
        {
            return 0;
        }
    }

    @Override
    public Object getItem(int spot)
    {
           if(mObjects != null && spot < mObjects.size() && spot >= 0)
           {
                int count = 0;
                String key = "";

                for(Map.Entry<String, Dogs> entry: mObjects.entrySet())
                {
                     if(count == spot)
                     {
                         key = entry.getKey();
                     }
                     count++;
                }

            count = 0;

            return mObjects.get(key);
           }

           else
           {
               return null;
           }

        
    }
}
