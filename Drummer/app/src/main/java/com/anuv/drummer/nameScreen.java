package com.anuv.drummer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class nameScreen extends ActionBarActivity {

    String page = "0102ht0304kb0506htkb07crltoh08ltoh09oh10oh1112lt13141516hhsn$s31||0102ht0304kb0506htkbrb07cr0809kb10cr11ri12lt13croh1415htri16cr$s01||01rb02ht03rb04kb0506htkb07cr0809kboh10crsn11kbri12hhlt13croh14sn15hhhtri16cr$s01||01rbri02crrbri03crkbri04crkboh05ltkboh06htltoh07snhtlt08hhsnht09hhsn10hhsnht11snhtlt12htltoh13ltkboh14crkboh15crkbri16crrbri$s31||";
    //String fileName = "Untitled";

    //Shared Preferences

    SharedPreferences myPrefs;
    SharedPreferences.Editor prefsEditor;

    Button saveb;
    EditText edit;

    public void setName(String newname) {
        prefsEditor.putString(newname, page);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_screen);

        saveb = (Button) findViewById(R.id.button1);
        edit = (EditText) findViewById(R.id.editText);
        saveb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edit.getText().equals("")) || (edit.getText().equals(" "))) {
                    setName("Untitled");
                }
                else {
                    setName(edit.getText().toString());
                }
            }
        });

        myPrefs = this.getSharedPreferences("myPrefs", MODE_WORLD_READABLE);
        prefsEditor = myPrefs.edit();

        Intent intent = getIntent();
        page = intent.getStringExtra("content");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_name_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
