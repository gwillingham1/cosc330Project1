package com.example.cosc330project1;


import androidx.fragment.app.Fragment;

public class GlossaryActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new WordListFragment();
    }
}
