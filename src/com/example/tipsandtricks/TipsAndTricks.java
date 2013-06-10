package com.example.tipsandtricks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.app.ListActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TipsAndTricks extends ListActivity {

	String Tips[] = { "Maths Magic", "Addition", "Subtraction", "Multiplication", "Division", "Multiply By 11",
			"Multiply By 12", "Division By 9", "Square Of 2 Digits",
			"Multiply By 12", "Division By 9", "Square Of 2 Digits"
	};
	String files[] = { "tips/TnT_AddingTime.html", "tips/TnT_Addition.html", "tips/TnT_AddTime.html", 
			"tips/TnT_BeautyOfMaths.html",	"tips/TnT_CalcMagic.html", "tips/TnT_DateOfTheDay.html", 
			"tips/TnT_Multiplication.html", "tips/TnT_PrimeNumbers.html", "tips/TnT_SpecialNumbers.html", 
			 "tips/TnT_Squares.html",  "tips/TnT_Subtraction.html",  "tips/TnT_Tricks.html"
	};

	TextView TvTips;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tips_and_tricks);
	setListAdapter(new ArrayAdapter<String>(this,
	android.R.layout.simple_list_item_1, Tips));
	TvTips = (TextView) findViewById(R.id.TextView);
	
	}
	
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		Toast.makeText(this, Tips[position], Toast.LENGTH_SHORT).show();
		
		Spanned inHtmlCC = Html.fromHtml(getTipsText(files[position]));
	    TvTips.setText(inHtmlCC);
	}

	
	
	public String getTipsText(String filename){
		InputStream is= null;

        String about="";
		try {
			is = getResources().getAssets().open(filename);
			InputStreamReader ir = new InputStreamReader(is);
	        BufferedReader br = new BufferedReader(ir);
            String line;
            while ((line = br.readLine())!= null ) {
                about = about + line;
            }
			is.close();
		} catch (IOException e) {}

		return about;
	}

}