package com.yazidmf.telepon;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        //EditText
        final EditText number=(EditText)findViewById(R.id.editText);
        Button dial=(Button)findViewById(R.id.button);
        //ketika menekan tombol call maka akan melakukan dial
        dial.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //number = inputan dari editText
                String toDial="tel:"+number.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse(toDial)));
            }
        });
    }
}