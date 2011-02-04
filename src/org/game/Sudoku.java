package org.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Sudoku extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View continue_button = findViewById(R.id.continue_button);
        continue_button.setOnClickListener(this);
        View new_button = findViewById(R.id.new_button);
        new_button.setOnClickListener(this);
        View about_button = findViewById(R.id.about_button);
        about_button.setOnClickListener(this);
        View exit_button=findViewById(R.id.exit_button);
        exit_button.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.about_button:
			 Intent i = new Intent(this,About.class);
			 startActivity(i);
			 break;
		
		}
	}
}