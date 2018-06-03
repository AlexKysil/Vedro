package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> list = new ArrayList<Word>();

        list.add(new Word("Where are you going?", "minto wuksus"));
        list.add(new Word("What is your name?", "tinnә oyaase'nә"));
        list.add(new Word("My name is...", "oyaaset..."));
        list.add(new Word("How are you feeling?", "michәksәs?"));
        list.add(new Word("I’m feeling good.", "kuchi achit"));
        list.add(new Word("Are you coming?", "әәnәs'aa?"));
        list.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        list.add(new Word("I’m coming.", "әәnәm"));
        list.add(new Word("Let’s go.", "yoowutis"));
        list.add(new Word("Come here.", "әnni'nem"));

        WordAdapter  wA = new WordAdapter (this, list, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wA);
    }
}
