package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TnT_Multiply_by_12 extends Activity{

	TextView MultiplyBy12;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_multiply_by_12);
		MultiplyBy12 = (TextView) findViewById(R.id.TvMultiply_By_12);
		MultiplyBy12.setText(Html.fromHtml(getString(R.string.multiply_by_12)));
	}	
	
}
