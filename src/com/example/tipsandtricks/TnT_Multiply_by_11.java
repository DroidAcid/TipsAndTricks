package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TnT_Multiply_by_11 extends Activity{

	TextView MultiplyBy11;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_multiply_by_11);
		MultiplyBy11 = (TextView) findViewById(R.id.TvMultiply_By_11);
		MultiplyBy11.setText(Html.fromHtml(getString(R.string.multiply_by_11)));
	}	
	
}
