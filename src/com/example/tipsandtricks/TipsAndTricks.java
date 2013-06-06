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

	String Tips[] = { "    Multiplication", "    Division" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, Tips));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Class<?>[] classes = {TNT_Multiplication.class } ;
		
		try {
			
			Intent tnt = new Intent(this, classes[position]);
			startActivity(tnt);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
