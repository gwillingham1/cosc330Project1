package com.example.cosc330project1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordListFragment extends Fragment {
    private RecyclerView wordRecyclerView;
    private WordAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.glossary_fragment, container, false);

        wordRecyclerView = (RecyclerView) view.findViewById(R.id.list_recycler_view);
        wordRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private void updateUI() {
        WordLab wordLab = WordLab.get(getActivity());
        List<Word> words = wordLab.getWords();
        adapter = new WordAdapter(words);
        wordRecyclerView.setAdapter(adapter);
    }

    private class WordHolder extends RecyclerView.ViewHolder {
        private ImageView pictureImageView;
        private TextView wordTextView;
        private TextView pronounceTextView;
        private TextView meaningTextView;
        private Word word;
        public WordHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_glossary_word, parent, false));
            pictureImageView = (ImageView) itemView.findViewById(R.id.glossaryImage);
            wordTextView = (TextView) itemView.findViewById(R.id.glossaryWord);
            pronounceTextView = (TextView) itemView.findViewById(R.id.glossaryPronounce);
            meaningTextView = (TextView) itemView.findViewById(R.id.glossaryMeaning);
        }
        public void bind(Word word) {
            this.word = word;
            pictureImageView.setImageResource(this.word.getImage());
            wordTextView.setText(this.word.getWord());
            pronounceTextView.setText(this.word.getPronounce());
            meaningTextView.setText(this.word.getMeaning());
        }
    }

    private class WordAdapter extends RecyclerView.Adapter<WordHolder> {
        private List<Word> words;
        public WordAdapter(List<Word> words) {
            this.words = words;
        }

        @NonNull
        @Override
        public WordHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new WordHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull WordHolder holder, int position) {
            Word word = words.get(position);
            holder.bind(word);
        }

        @Override
        public int getItemCount() {
            return words.size();
        }
    }
}
