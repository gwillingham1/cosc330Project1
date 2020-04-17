package com.example.cosc330project1;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class BankWord {
    private ArrayList<View> views;
    private ArrayList<Character> word;
    boolean flag;
    public BankWord(ArrayList<View> views, String word){
        this.views=views;
        this.word = new ArrayList<>();
        int i = 0;
        while(i<word.length()){
            this.word.add(word.charAt(i));
            i++;
        }
    }
    public void checkWord(){
        flag = true;
        int i = 0;
        while(i<views.size()&&i<word.size()){
            if(!(((TextView)views.get(i)).getText().toString().equalsIgnoreCase(word.get(i).toString()))){
                flag = false;
            }
            i++;
        }
        if(flag&&(views.size()==word.size())){
            int j = 0;
            while(j<views.size()){
                views.get(j).setBackgroundColor(Color.GREEN);
                j++;
            }
        }
    }
}
