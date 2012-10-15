package com.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TestAndroidRepoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Toast.makeText(TestAndroidRepoActivity.this, "Welcome to Android", 0).show();
				
			}
		});
    }
}