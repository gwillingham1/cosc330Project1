package com.example.cosc330project1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {
    EditText email;
    String emailS;
    EditText password;
    String passS;
    Button login;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment, container, false);
        passS = "";
        emailS = "";
        email = (EditText) view.findViewById(R.id.email);
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailS = s.toString();
                if (!emailS.isEmpty() && passS.length() > 8) {
                    login.setBackgroundColor(Color.GREEN);
                    login.setOnClickListener(loginButton);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        password = (EditText) view.findViewById(R.id.password);
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passS = s.toString();
                if (!emailS.isEmpty() && passS.length() >= 8) {
                    login.setBackgroundColor(Color.GREEN);
                    login.setOnClickListener(loginButton);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        login = (Button) view.findViewById(R.id.login);
        login.setBackgroundColor(Color.GRAY);
        return view;
    }
    private final View.OnClickListener loginButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),TableOfContentsActivity.class);
            startActivity(intent);
        }
    };
}
