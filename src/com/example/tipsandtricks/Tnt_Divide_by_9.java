package com.example.tipsandtricks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Tnt_Divide_by_9 extends Activity{

	TextView DivideBy9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tnt_divide_by_9);
		DivideBy9 = (TextView) findViewById(R.id.TvDivide_By_9);
		DivideBy9.setText(Html.fromHtml(getString(R.string.divide_by_9)));
	}

	
	
}
