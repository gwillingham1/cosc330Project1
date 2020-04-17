package com.example.cosc330project1;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class Word {
    private int image;
    private String word;
    private String pronounce;
    private String meaning;

    public Word(Context context, String image, String word, String pronounce, String meaning) {
        this.image = context.getResources().getIdentifier(image, "drawable", context.getPackageName());

        System.out.println(this.image);
        this.word = word;
        this.pronounce = pronounce;
        this.meaning = meaning;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
