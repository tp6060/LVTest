package org.lojantakanen.lvtest;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
	ArrayAdapter<String> mArrayAdapter;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		String items[] = {"banana","apple","grape"};
		mArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

    }
}
