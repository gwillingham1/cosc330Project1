package com.example.cosc330project1;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

public class WordLab {
    private static WordLab sWordLab;

    private List<Word> words;

    public static WordLab get(Context context) {
        if (sWordLab == null) {
            sWordLab = new WordLab(context);
        }
        return sWordLab;
    }

    private WordLab(Context context) {
        words = new ArrayList<>();
        Resources res = context.getResources();
        String[] newWords = res.getStringArray(R.array.glossary_array);
        for (int i = 0; i < newWords.length; i+=4) {
            words.add(new Word(context, newWords[i],newWords[i+1],newWords[i+2],newWords[i+3]));
        }
    }

    public List<Word> getWords() {
        return words;
    }
    public Word getWord(String word) {
        for (Word w : words) {
            if(w.getWord().equals(word)) {
                return w;
            }
        }
        return null;
    }
}
