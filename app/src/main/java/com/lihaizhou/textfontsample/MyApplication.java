package com.lihaizhou.textfontsample;

import android.app.Application;
import android.graphics.Typeface;
import com.norbsoft.typefacehelper.TypefaceCollection;
import com.norbsoft.typefacehelper.TypefaceHelper;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		// Load helper with default custom typeface (single custom typeface)
		TypefaceHelper.init(new TypefaceCollection.Builder()
				.set(Typeface.NORMAL, Typeface.createFromAsset(getAssets(), "fonts/ubuntu/Ubuntu-R.ttf"))
				.set(Typeface.BOLD, Typeface.createFromAsset(getAssets(), "fonts/ubuntu/Ubuntu-B.ttf"))
				.set(Typeface.ITALIC, Typeface.createFromAsset(getAssets(), "fonts/ubuntu/Ubuntu-RI.ttf"))
				.set(Typeface.BOLD_ITALIC, Typeface.createFromAsset(getAssets(), "fonts/ubuntu/Ubuntu-BI.ttf"))
				.create());
	}
}
