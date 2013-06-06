package com.example.tipsandtricks;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TipsAndTricks extends ListActivity {

	String Tips[] = { "Maths Magic", "Addition", "Subtraction", "Multiplication", "Division", "Multiply By 11", "Multiply By 12", "Division By 9", "Square Of 2 Digits"
								};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, Tips));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Class<?>[] classes = { TnT_MathsMagic.class, TnT_Addition.class, TnT_Subtraction.class, TnT_Multiplication.class,
								TnT_Division.class,	TnT_Multiply_by_11.class, TnT_Multiply_by_11.class, Tnt_Divide_by_9.class, 
								TnT_Square_2_Digits.class,
					} ;
		
		try {
			
			Intent tnt = new Intent(this, classes[position]);
			startActivity(tnt);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
