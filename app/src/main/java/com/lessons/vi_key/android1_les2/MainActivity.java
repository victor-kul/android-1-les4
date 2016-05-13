package com.lessons.vi_key.android1_les2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vi-key on 13.05.2016.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ImageView imageView;
        Button button;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);
        Button btn = (Button) findViewById(R.id.btn);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.leather_wood2);

        TListener tl = new TListener();
        button.setOnTouchListener(tl);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                showToast(R.string.txt_false);
                showToast("yea");
            }
        });


        String[] skills = this.getResources().getStringArray(R.array.my_skills);
        StringBuilder sBuilder = new StringBuilder();
        for(int i=0; i<skills.length; i++){
            sBuilder.append(skills[i] + "\n");
        }
        text.setText(sBuilder.toString());

    }

//    public void onClick(View v){
//        Intent intent;
//    }

    private void showToast(String message) {
//        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    class TListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                showToast("ACTION_DOWN");
                return true;
            } else if(event.getAction() == MotionEvent.ACTION_UP) {
                showToast("ACTION_UP");
                return true;
            }

            return false;
        }

    }

}