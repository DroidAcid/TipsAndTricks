package com.example.tipsandtricks;

import android.app.Activity;

public class TnT_Addition extends Activity {

	public static TnT_Addition newInstance() {
        TnT_Addition f = new TnT_Addition();
        return f;
    }

	

	
	/*
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	getDialog().setTitle(getString(R.string.AboutTitle));
        View v = inflater.inflate(R.layout.aboutdialog_layout, container, false);
        
        TextView tv = (TextView) v.findViewById(R.id.tvAbout);
               
        Spanned inHtmlCC = Html.fromHtml(getAboutText());
                
        tv.setText(inHtmlCC);
                
		return v;
    }
	public String getAboutText(){
		InputStream is= null;

		SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
		String language = getPrefs.getString("languagePref", "unknown");
        Locale locale = Locale.getDefault();
        String myLocale = locale.getLanguage();
        String filename = "texts/background_en.html";
        if (myLocale.contains("fr") || language.contains("fr"))
			filename = "texts/background_fr.html";
        if (myLocale.contains("nl") || language.contains("nl"))
			filename = "texts/background_nl.html";
        if (myLocale.contains("de") || language.contains("de"))
			filename = "texts/background_de.html";
        
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
*/
}