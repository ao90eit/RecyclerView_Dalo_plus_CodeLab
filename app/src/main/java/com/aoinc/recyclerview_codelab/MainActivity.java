package com.aoinc.recyclerview_codelab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private List<String> wordList = new ArrayList<>();

    @BindView(R.id.words_recyclerView)
    public RecyclerView recyclerView;

    private WordListAdapter wordListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Generate some Strings for the word list
        for (int i = 0; i < 20; i++)
            wordList.add("Word " + i);

        // Bind views
        ButterKnife.bind(this);

        // Create an adapter and supply the data to be displayed.
        wordListAdapter = new WordListAdapter(wordList);

        // Connect the adapter with the RecyclerView.
        recyclerView.setAdapter(wordListAdapter);
    }

    @OnClick(R.id.floating_action_button)
    public void onClickFab(View v) {

        // Add a new word to the wordList.
        wordList.add("+ Word " + wordListAdapter.getItemCount());

        // Notify the adapter, that the data has changed.
        wordListAdapter.updateWordList(wordList);

        // Scroll to the bottom. -> COOL!
        recyclerView.smoothScrollToPosition(wordListAdapter.getItemCount());
    }
}