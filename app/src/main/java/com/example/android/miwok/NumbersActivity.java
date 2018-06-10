package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mp;

    private MediaPlayer.OnCompletionListener myComplitionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
            final ArrayList<Word> englishNumbersList = new ArrayList<Word>();

        englishNumbersList.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        englishNumbersList.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        englishNumbersList.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        englishNumbersList.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        englishNumbersList.add(new Word("five", "massokka",R.drawable.number_five, R.raw.number_five));
        englishNumbersList.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        englishNumbersList.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        englishNumbersList.add(new Word("eight", "kawinta",R.drawable.number_eight, R.raw.number_eight));
        englishNumbersList.add(new Word("nine", "wo`e",R.drawable.number_nine, R.raw.number_nine));
        englishNumbersList.add(new Word("ten", "na`aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this,englishNumbersList, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Word word = englishNumbersList.get(i);

                releaseMediaPlayer();

                mp = MediaPlayer.create(NumbersActivity.this, word.getAudioID());
                mp.start();

                mp.setOnCompletionListener(myComplitionListener);
            }
        });




    }
     private void releaseMediaPlayer(){
        if(mp != null){
            mp.release();
            mp = null;
        }
     }
}

