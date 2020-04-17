package com.example.cosc330project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TableOfContentsFragment extends Fragment {
    Button definitionsGame;
    Button glossary;
    Button doctors;
    Button crossword;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.table_of_contents_fragment, container, false);
        definitionsGame = view.findViewById(R.id.definitionsgame);
        definitionsGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),HealthLingoActivity.class);
                startActivity(intent);
            }
        });
        glossary = view.findViewById(R.id.glossary);
        glossary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),GlossaryActivity.class);
                startActivity(intent);
            }
        });
        doctors = view.findViewById(R.id.doctors);
        doctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),WordSearchActivity.class);
                startActivity(intent);
            }
        });
        crossword = view.findViewById(R.id.crossword);
        crossword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CrosswordActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
