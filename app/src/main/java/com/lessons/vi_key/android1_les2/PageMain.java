package com.lessons.vi_key.android1_les2;

/**
 * Created by vi-key on 20.05.2016.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by beerko on 09.05.16.
 */
public class PageMain extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ImageView imageView, imageAva;
        Button button;


        View view = inflater.inflate(R.layout.page_main, null);

        TextView text = (TextView) view.findViewById(R.id.text);
        button = (Button) view.findViewById(R.id.button);
        Button btn = (Button) view.findViewById(R.id.btn);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.leather_wood2);

        imageAva = (ImageView) view.findViewById(R.id.imageAva);
        imageAva.setImageResource(R.drawable.ava_victor_kul);

        final Interpolator over = new OvershootInterpolator(4);

//        TListener tl = new TListener();
//        button.setOnTouchListener(tl);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                showToast(R.string.txt_false);
                showToast("yea");
            }
        });


        String[] skills = this.getResources().getStringArray(R.array.my_skills);
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < skills.length; i++) {
            sBuilder.append(skills[i] + "\n");
        }
        text.setText(sBuilder.toString());

        return view;
    }


    private void showToast(String message) {
//        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        Toast.makeText(getActivity().getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


    class TListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                showToast("ACTION_DOWN");
                return true;
            } else if (event.getAction() == MotionEvent.ACTION_UP) {
                showToast("ACTION_UP");
                return true;
            }

            return false;
        }
    }
}
