package com.example.cosc330project1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class HealthLingoFragment extends Fragment {
    private TextView definition1;
    private TextView definition2;
    private TextView definition3;
    private TextView definition4;
    private TextView definition5;
    private TextView definition6;
    private int d1;
    private int d2;
    private int d3;
    private int d4;
    private int d5;
    private int d6;
    private TextView temp;
    private int lastID;
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.health_lingo_fragment, container, false);
        lastID = View.NO_ID;
        definition1 = (TextView) view.findViewById(R.id.definition1);
        d1 = ((ViewGroup)definition1.getParent()).getId();
        definition2 = (TextView) view.findViewById(R.id.definition2);
        d2 = ((ViewGroup)definition2.getParent()).getId();
        definition3 = (TextView) view.findViewById(R.id.definition3);
        d3 = ((ViewGroup)definition3.getParent()).getId();
        definition4 = (TextView) view.findViewById(R.id.definition4);
        d4 = ((ViewGroup)definition4.getParent()).getId();
        definition5 = (TextView) view.findViewById(R.id.definition5);
        d5 = ((ViewGroup)definition5.getParent()).getId();
        definition6 = (TextView) view.findViewById(R.id.definition6);
        d6 = ((ViewGroup)definition6.getParent()).getId();
        ViewGroup vg1 = (ViewGroup)definition1.getParent();
        ViewGroup vg2 = (ViewGroup)definition2.getParent();
        ViewGroup vg3 = (ViewGroup)definition3.getParent();
        ViewGroup vg4 = (ViewGroup)definition4.getParent();
        ViewGroup vg5 = (ViewGroup)definition5.getParent();
        ViewGroup vg6 = (ViewGroup)definition6.getParent();
        vg1.removeView(definition1);
        vg2.removeView(definition2);
        vg3.removeView(definition3);
        vg4.removeView(definition4);
        vg5.removeView(definition5);
        vg6.removeView(definition6);
        vg1.addView(definition3);
        vg2.addView(definition6);
        vg3.addView(definition5);
        vg4.addView(definition2);
        vg5.addView(definition1);
        vg6.addView(definition4);
        definition1.setOnClickListener(listener);
        definition2.setOnClickListener(listener);
        definition3.setOnClickListener(listener);
        definition4.setOnClickListener(listener);
        definition5.setOnClickListener(listener);
        definition6.setOnClickListener(listener);
        return view;
    }
    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(lastID==View.NO_ID) {
                v.setBackgroundColor(Color.YELLOW);
                lastID=v.getId();
            } else if(lastID==v.getId()){
                v.setBackgroundColor(Color.WHITE);
                lastID=View.NO_ID;
            } else {
                ViewGroup p1 = (ViewGroup) v.getParent();
                View v2 = view.findViewById(lastID);
                ViewGroup p2 = (ViewGroup) v2.getParent();
                p1.removeView(v);
                p2.removeView(v2);
                p1.addView(v2);
                p2.addView(v);
                v.setBackgroundColor(Color.WHITE);
                v2.setBackgroundColor(Color.WHITE);
                lastID = View.NO_ID;
            }
            if(((ViewGroup)definition1.getParent()).getId()==d1){
                definition1.setBackgroundColor(Color.GREEN);
                definition1.setOnClickListener(null);
            }
            if(((ViewGroup)definition2.getParent()).getId()==d2){
                definition2.setBackgroundColor(Color.GREEN);
                definition2.setOnClickListener(null);
            }
            if(((ViewGroup)definition3.getParent()).getId()==d3){
                definition3.setBackgroundColor(Color.GREEN);
                definition3.setOnClickListener(null);
            }
            if(((ViewGroup)definition4.getParent()).getId()==d4){
                definition4.setBackgroundColor(Color.GREEN);
                definition4.setOnClickListener(null);
            }
            if(((ViewGroup)definition5.getParent()).getId()==d5){
                definition5.setBackgroundColor(Color.GREEN);
                definition5.setOnClickListener(null);
            }
            if(((ViewGroup)definition6.getParent()).getId()==d6){
                definition6.setBackgroundColor(Color.GREEN);
                definition6.setOnClickListener(null);
            }
        }
    };
}
