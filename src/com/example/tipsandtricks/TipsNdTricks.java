package com.example.tipsandtricks;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TipsNdTricks extends ListActivity {

	String Tips[] = { "Maths Magic", "Addition", "Subtraction", "Multiplication", "Division", "Multiply By 11", "Multiply By 12", "Division By 9", "Square Of 2 Digits"
	};

	TextView TvTips;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.tips_and_tricks);
	setListAdapter(new ArrayAdapter<String>(this,
	android.R.layout.simple_list_item_1, Tips));
	TvTips = (TextView) findViewById(R.id.TextView);
	//Spanned inHtmlCC = Html.fromHtml(getTipsText());
    
    //TvTips.setText(inHtmlCC);
	}
	
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		Toast.makeText(this, Tips[position], Toast.LENGTH_SHORT).show();

		
			/*Intent tnt = new Intent(this, fileName[position]);
			startActivity(tnt);*/
	}

	
	
	/*public String getTipsText(){
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
	}*/

}