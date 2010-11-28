package com.mamlambo.BasicButtons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class BasicButtonActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        

        ImageButton myImageButton = (ImageButton) findViewById(R.id.ImageButton01);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Toast.makeText(BasicButtonActivity.this, "ImageButton clicked!", Toast.LENGTH_SHORT).show();           
            }
        });

        myImageButton.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
            	Toast.makeText(BasicButtonActivity.this, "ImageButton LONG clicked!", Toast.LENGTH_SHORT).show();
				return true;           
            }
        });
        
        Button myButton = (Button) findViewById(R.id.Button01);
        myButton.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
            	Toast.makeText(BasicButtonActivity.this, "Button LONG clicked!", Toast.LENGTH_SHORT).show();
				return true;           
            }
        });

    }
    
    public void onMyButtonClick(View view)
    {
    	Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
    }
}