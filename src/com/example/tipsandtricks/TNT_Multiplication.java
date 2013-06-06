package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TNT_Multiplication extends Activity{

	TextView Multiplication;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_multiplication);
		Multiplication = (TextView) findViewById(R.id.TvMultiplication);
		Multiplication.setText(Html.fromHtml(getString(R.string.multiplication)));
	}

	
	
}
