package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	private static final String TAG = "Aplicacion";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button btn = (Button) findViewById(R.id.btn_submit);
		
		btn.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg0) {
				Log.i(TAG,"hizo click");
				
				EditText txt_editName = (EditText) findViewById(R.id.edit_name);
				TextView txt_message = (TextView)  findViewById(R.id.txt_msg);
				
				txt_message.setText("Hola "+ txt_editName.getText());				
				
			}
			
			
		}
				
		);
		
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
