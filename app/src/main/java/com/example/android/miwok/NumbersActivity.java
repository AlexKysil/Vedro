package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
      ArrayList<Word> englishNumbersList = new ArrayList<Word>();

        englishNumbersList.add(new Word("one", "lutti", R.drawable.number_one));
        englishNumbersList.add(new Word("two", "otiiko", R.drawable.number_two));
        englishNumbersList.add(new Word("three", "tolookosu", R.drawable.number_three));
        englishNumbersList.add(new Word("four", "oyyisa", R.drawable.number_four));
        englishNumbersList.add(new Word("five", "massokka",R.drawable.number_five));
        englishNumbersList.add(new Word("six", "temmokka", R.drawable.number_six));
        englishNumbersList.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        englishNumbersList.add(new Word("eight", "kawinta",R.drawable.number_eight));
        englishNumbersList.add(new Word("nine", "wo`e",R.drawable.number_nine));
        englishNumbersList.add(new Word("ten", "na`aacha", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this,englishNumbersList, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}

