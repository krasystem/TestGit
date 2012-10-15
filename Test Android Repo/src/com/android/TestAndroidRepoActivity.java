package com.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
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
				AlertDialog.Builder builder=new Builder(TestAndroidRepoActivity.this);
				builder.setTitle("Alert");
				builder.setMessage("This sample Git Hub Project");
				builder.setNegativeButton("Ok", null);
				
				AlertDialog dialog=builder.create();
				dialog.show();
				
				
			}
		});
    }
}