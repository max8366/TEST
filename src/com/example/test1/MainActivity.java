package com.example.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.example.HomeAssistant.R;
import org.json.JSONArray;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    Button login = (Button) findViewById(R.id.button2);
		login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, AddActivity2.class);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}
		})	;
		Button newmember = (Button) findViewById(R.id.button1);
		newmember.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v){
				Intent intent = new Intent(MainActivity.this, AddActivity1.class);
				startActivity(intent);
				// TODO Auto-generated method stub
				
			}
		} );
		 
	}

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
}
