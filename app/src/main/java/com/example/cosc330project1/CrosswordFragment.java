package com.example.cosc330project1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CrosswordFragment extends Fragment {
    BankWord d1;
    ArrayList<View> vitamins;
    //vitamins
    EditText edit1;
    EditText edit2;
    EditText edit3;
    EditText edit4;
    EditText edit5;
    EditText edit6;
    EditText edit7;
    EditText edit8;

    BankWord a4;
    ArrayList<View> carbohydrates;
    //carbohydrates
    EditText edit9;
    //edit4
    EditText edit10;
    EditText edit11;
    EditText edit12;
    EditText edit13;
    EditText edit14;
    EditText edit15;
    EditText edit16;
    EditText edit17;
    EditText edit18;
    EditText edit19;
    EditText edit20;

    BankWord d5;
    ArrayList<View> obese;
    //obese
    //edit12
    EditText edit21;
    EditText edit22;
    EditText edit23;
    EditText edit24;

    BankWord d3;
    ArrayList<View> calories;
    //calories
    EditText edit25;
    //edit17
    EditText edit26;
    EditText edit27;
    EditText edit28;
    EditText edit29;
    EditText edit30;
    EditText edit31;

    BankWord d2;
    ArrayList<View> exercise;
    //exercise
    EditText edit32;
    EditText edit33;
    //edit19
    EditText edit34;
    EditText edit35;
    EditText edit36;
    EditText edit37;
    EditText edit38;

    BankWord a7;
    ArrayList<View> fruit;
    //fruit
    EditText edit39;
    //edit28
    EditText edit40;
    //edit36
    EditText edit41;

    BankWord d6;
    ArrayList<View> sodium;
    //sodium
    EditText edit42;
    EditText edit43;
    EditText edit44;
    EditText edit45;
    EditText edit46;
    EditText edit47;

    BankWord a8;
    ArrayList<View> diabetes;
    //diabetes
    EditText edit48;
    //edit45
    EditText edit49;
    EditText edit50;
    //edit30
    EditText edit51;
    //edit38
    EditText edit52;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.crossword_fragment, container, false);
        vitamins = new ArrayList<>();
        carbohydrates = new ArrayList<>();
        obese = new ArrayList<>();
        calories = new ArrayList<>();
        exercise = new ArrayList<>();
        fruit = new ArrayList<>();
        sodium = new ArrayList<>();
        diabetes = new ArrayList<>();
        edit1 = (EditText)view.findViewById(R.id.edit1);
        edit1.addTextChangedListener(listener);
        edit2 = (EditText)view.findViewById(R.id.edit2);
        edit2.addTextChangedListener(listener);
        edit3 = (EditText)view.findViewById(R.id.edit3);
        edit3.addTextChangedListener(listener);
        edit4 = (EditText)view.findViewById(R.id.edit4);
        edit4.addTextChangedListener(listener);
        edit5 = (EditText)view.findViewById(R.id.edit5);
        edit5.addTextChangedListener(listener);
        edit6 = (EditText)view.findViewById(R.id.edit6);
        edit6.addTextChangedListener(listener);
        edit7 = (EditText)view.findViewById(R.id.edit7);
        edit7.addTextChangedListener(listener);
        edit8 = (EditText)view.findViewById(R.id.edit8);
        edit8.addTextChangedListener(listener);

        vitamins.add(edit1);
        vitamins.add(edit2);
        vitamins.add(edit3);
        vitamins.add(edit4);
        vitamins.add(edit5);
        vitamins.add(edit6);
        vitamins.add(edit7);
        vitamins.add(edit8);
        d1 = new BankWord(vitamins,"vitamins");

        edit9 = (EditText)view.findViewById(R.id.edit9);
        edit9.addTextChangedListener(listener);
        edit10 = (EditText)view.findViewById(R.id.edit10);
        edit10.addTextChangedListener(listener);
        edit11 = (EditText)view.findViewById(R.id.edit11);
        edit11.addTextChangedListener(listener);
        edit12 = (EditText)view.findViewById(R.id.edit12);
        edit12.addTextChangedListener(listener);
        edit13 = (EditText)view.findViewById(R.id.edit13);
        edit13.addTextChangedListener(listener);
        edit14 = (EditText)view.findViewById(R.id.edit14);
        edit14.addTextChangedListener(listener);
        edit15 = (EditText)view.findViewById(R.id.edit15);
        edit15.addTextChangedListener(listener);
        edit16 = (EditText)view.findViewById(R.id.edit16);
        edit16.addTextChangedListener(listener);
        edit17 = (EditText)view.findViewById(R.id.edit17);
        edit17.addTextChangedListener(listener);
        edit18 = (EditText)view.findViewById(R.id.edit18);
        edit18.addTextChangedListener(listener);
        edit19 = (EditText)view.findViewById(R.id.edit19);
        edit19.addTextChangedListener(listener);
        edit20 = (EditText)view.findViewById(R.id.edit20);
        edit20.addTextChangedListener(listener);

        carbohydrates.add(edit9);
        carbohydrates.add(edit4);
        carbohydrates.add(edit10);
        carbohydrates.add(edit11);
        carbohydrates.add(edit12);
        carbohydrates.add(edit13);
        carbohydrates.add(edit14);
        carbohydrates.add(edit15);
        carbohydrates.add(edit16);
        carbohydrates.add(edit17);
        carbohydrates.add(edit18);
        carbohydrates.add(edit19);
        carbohydrates.add(edit20);
        a4 = new BankWord(carbohydrates,"carbohydrates");

        edit21 = (EditText)view.findViewById(R.id.edit21);
        edit21.addTextChangedListener(listener);
        edit22 = (EditText)view.findViewById(R.id.edit22);
        edit22.addTextChangedListener(listener);
        edit23 = (EditText)view.findViewById(R.id.edit23);
        edit23.addTextChangedListener(listener);
        edit24 = (EditText)view.findViewById(R.id.edit24);
        edit24.addTextChangedListener(listener);

        obese.add(edit12);
        obese.add(edit21);
        obese.add(edit22);
        obese.add(edit23);
        obese.add(edit24);
        d5 = new BankWord(obese, "obese");

        edit25 = (EditText)view.findViewById(R.id.edit25);
        edit25.addTextChangedListener(listener);
        edit26 = (EditText)view.findViewById(R.id.edit26);
        edit26.addTextChangedListener(listener);
        edit27 = (EditText)view.findViewById(R.id.edit27);
        edit27.addTextChangedListener(listener);
        edit28 = (EditText)view.findViewById(R.id.edit28);
        edit28.addTextChangedListener(listener);
        edit29 = (EditText)view.findViewById(R.id.edit29);
        edit29.addTextChangedListener(listener);
        edit30 = (EditText)view.findViewById(R.id.edit30);
        edit30.addTextChangedListener(listener);
        edit31 = (EditText)view.findViewById(R.id.edit31);
        edit31.addTextChangedListener(listener);

        calories.add(edit25);
        calories.add(edit17);
        calories.add(edit26);
        calories.add(edit27);
        calories.add(edit28);
        calories.add(edit29);
        calories.add(edit30);
        calories.add(edit31);
        d3 = new BankWord(calories,"calories");

        edit32 = (EditText)view.findViewById(R.id.edit32);
        edit32.addTextChangedListener(listener);
        edit33 = (EditText)view.findViewById(R.id.edit33);
        edit33.addTextChangedListener(listener);
        edit34 = (EditText)view.findViewById(R.id.edit34);
        edit34.addTextChangedListener(listener);
        edit35 = (EditText)view.findViewById(R.id.edit35);
        edit35.addTextChangedListener(listener);
        edit36 = (EditText)view.findViewById(R.id.edit36);
        edit36.addTextChangedListener(listener);
        edit37 = (EditText)view.findViewById(R.id.edit37);
        edit37.addTextChangedListener(listener);
        edit38 = (EditText)view.findViewById(R.id.edit38);
        edit38.addTextChangedListener(listener);

        exercise.add(edit32);
        exercise.add(edit33);
        exercise.add(edit19);
        exercise.add(edit34);
        exercise.add(edit35);
        exercise.add(edit36);
        exercise.add(edit37);
        exercise.add(edit38);
        d2 = new BankWord(exercise, "exercise");

        edit39 = (EditText)view.findViewById(R.id.edit39);
        edit39.addTextChangedListener(listener);
        edit40 = (EditText)view.findViewById(R.id.edit40);
        edit40.addTextChangedListener(listener);
        edit41 = (EditText)view.findViewById(R.id.edit41);
        edit41.addTextChangedListener(listener);

        fruit.add(edit39);
        fruit.add(edit28);
        fruit.add(edit40);
        fruit.add(edit36);
        fruit.add(edit41);
        a7 = new BankWord(fruit,"fruit");

        edit42 = (EditText)view.findViewById(R.id.edit42);
        edit42.addTextChangedListener(listener);
        edit43 = (EditText)view.findViewById(R.id.edit43);
        edit43.addTextChangedListener(listener);
        edit44 = (EditText)view.findViewById(R.id.edit44);
        edit44.addTextChangedListener(listener);
        edit45 = (EditText)view.findViewById(R.id.edit45);
        edit45.addTextChangedListener(listener);
        edit46 = (EditText)view.findViewById(R.id.edit46);
        edit46.addTextChangedListener(listener);
        edit47 = (EditText)view.findViewById(R.id.edit47);
        edit47.addTextChangedListener(listener);

        sodium.add(edit42);
        sodium.add(edit43);
        sodium.add(edit44);
        sodium.add(edit45);
        sodium.add(edit46);
        sodium.add(edit47);
        d6 = new BankWord(sodium,"sodium");

        edit48 = (EditText)view.findViewById(R.id.edit48);
        edit48.addTextChangedListener(listener);
        edit49 = (EditText)view.findViewById(R.id.edit49);
        edit49.addTextChangedListener(listener);
        edit50 = (EditText)view.findViewById(R.id.edit50);
        edit50.addTextChangedListener(listener);
        edit51 = (EditText)view.findViewById(R.id.edit51);
        edit51.addTextChangedListener(listener);
        edit52 = (EditText)view.findViewById(R.id.edit52);
        edit52.addTextChangedListener(listener);

        diabetes.add(edit48);
        diabetes.add(edit45);
        diabetes.add(edit49);
        diabetes.add(edit50);
        diabetes.add(edit30);
        diabetes.add(edit51);
        diabetes.add(edit38);
        diabetes.add(edit52);
        a8 = new BankWord(diabetes, "diabetes");

        return view;
    }
    TextWatcher listener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            d1.checkWord();
            a4.checkWord();
            d5.checkWord();
            d3.checkWord();
            d2.checkWord();
            d6.checkWord();
            a7.checkWord();
            a8.checkWord();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
