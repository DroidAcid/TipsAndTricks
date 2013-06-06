package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TnT_Subtraction extends Activity{

	TextView Subtraction;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_subtraction);
		Subtraction = (TextView) findViewById(R.id.TvSubtraction);
		Subtraction.setText(Html.fromHtml(getString(R.string.subtraction)));
	}

	
	
}
