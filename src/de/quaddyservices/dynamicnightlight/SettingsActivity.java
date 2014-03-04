package de.quaddyservices.dynamicnightlight;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * http://developer.android.com/guide/topics/ui/settings.html
 * 
 * @author user
 *
 */
public class SettingsActivity extends PreferenceActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// Load the preferences from an XML resource
		addPreferencesFromResource(R.xml.preferences);

		// TODO API Level >=11

		//		// Display the fragment as the main content.
		//		getFragmentManager().beginTransaction()
		//				.replace(android.R.id.content, new SettingsFragment()).commit();

	}
}