package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TnT_MathsMagic extends Activity{

	TextView MathsMagic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_multiply_by_11);
		MathsMagic = (TextView) findViewById(R.id.TvMultiply_By_11);
		MathsMagic.setText(Html.fromHtml(getString(R.string.multiply_by_11)));
	}	
	
}
