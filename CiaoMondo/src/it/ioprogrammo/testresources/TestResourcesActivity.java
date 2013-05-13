package it.ioprogrammo.testresources;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TextView;

public class TestResourcesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Resources res = getResources();
		String message = res.getString(R.string.hello_world);
		TextView tv = new TextView(this);
		tv.setText(message);
		setContentView(tv);
//		setContentView(R.layout.activity_test_resources);
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_test_resources, menu);
		return true;
	}
*/
}
