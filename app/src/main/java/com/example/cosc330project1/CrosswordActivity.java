package com.example.cosc330project1;

import androidx.fragment.app.Fragment;

public class CrosswordActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrosswordFragment();
    }
}
