package com.example.task0_delta;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		func1();
		}
	private void func1()
	{  
		final TextView word=(TextView)findViewById(R.id.text) ;
		Button reset= (Button)findViewById(R.id.button2);
		reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg1) {
				// TODO Auto-generated method stub
				word.setText("Hello World!");
			}
		});
				
		Button jumble=(Button)	findViewById(R.id.button1) ;
		jumble.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				int a,b;
				char t;
				b=0;
				char[] str=word.getText().toString().toCharArray();
		
		
				int len=word.getText().length();
				while(b<len)
				{
					do{a=(int) (Math.random() * (len - 0)) + 0;}while(a<b || a>len);
					t=str[b];
					str[b]=str[a];
					str[a]=t;
					b++;
				}	
			
				word.setText(str, 0, len);
		
			
				
			}
		});
	}
		
		
		
	
//----------------------------------------------------------------------------
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
