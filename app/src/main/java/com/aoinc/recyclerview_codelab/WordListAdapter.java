package com.aoinc.recyclerview_codelab;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private List<String> wordList;

    public WordListAdapter(List<String> wordList) {
        this.wordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflatedItemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.word_item_layout, parent, false);

        return new WordViewHolder(inflatedItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String curWord = wordList.get(position);
        holder.wordItemTextView.setText(curWord);
    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.word_item_textView)
        public TextView wordItemTextView;

        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
