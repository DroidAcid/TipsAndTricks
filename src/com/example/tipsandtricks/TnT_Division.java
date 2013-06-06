package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TnT_Division extends Activity{

	TextView Division;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_division);
		Division = (TextView) findViewById(R.id.TvDivision);
		Division.setText(Html.fromHtml(getString(R.string.division)));
	}

	
	
}
