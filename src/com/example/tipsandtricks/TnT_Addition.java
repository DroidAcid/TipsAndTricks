package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TnT_Addition extends Activity{

	TextView Addition;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_addition);
		Addition = (TextView) findViewById(R.id.TvAddition);
		Addition.setText(Html.fromHtml(getString(R.string.addition)));
	}

	
	
}
