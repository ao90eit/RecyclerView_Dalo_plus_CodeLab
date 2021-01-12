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
import butterknife.OnClick;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private List<String> wordList;

    public WordListAdapter(List<String> wordList) {
        this.wordList = wordList;
    }

    public void updateWordList(List<String> words) {
        wordList = words;
        notifyDataSetChanged();
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

        @OnClick(R.id.word_item_textView)
        public void onClickWord (View v) {
            
            // Get the position of the item that was clicked.
            int clickedPosition = getLayoutPosition();

            // Use that to access the affected item in mWordList.
            String clickedWord = wordList.get(clickedPosition);

            // Change the word in the mWordList.
            wordList.set(clickedPosition, "Clicked! " + clickedWord);

            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            updateWordList(wordList);
        }
    }
}
