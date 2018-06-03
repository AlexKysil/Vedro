package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> list = new ArrayList<Word>();

        list.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        list.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        list.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        list.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        list.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        list.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        list.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        list.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        list.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        list.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

        WordAdapter  wA = new WordAdapter (this, list, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wA);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = list.get(i);
                mp = MediaPlayer.create(PhrasesActivity.this, word.getAudioID());
                mp.start();
            }
        });
    }
}
