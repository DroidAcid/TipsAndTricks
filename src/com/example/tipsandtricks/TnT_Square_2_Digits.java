package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TnT_Square_2_Digits extends Activity{

	TextView Square2Digits;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_square_2_digits);
		Square2Digits = (TextView) findViewById(R.id.TvSquare_2_Digits);
		Square2Digits.setText(Html.fromHtml(getString(R.string.square_2_digit)));
	}

	
	
}
