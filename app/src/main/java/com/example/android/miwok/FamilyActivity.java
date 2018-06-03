package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

     ArrayList<Word> family_list = new ArrayList<Word>();

        family_list.add(new Word("father", "әpә",R.drawable.family_father));
        family_list.add(new Word("mother", "әṭa", R.drawable.family_mother));
        family_list.add(new Word("son", "angsi", R.drawable.family_son));
        family_list.add(new Word("daughter", "tune", R.drawable.family_daughter));
        family_list.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        family_list.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        family_list.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        family_list.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        family_list.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        family_list.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        WordAdapter fmWordAdapter = new WordAdapter(this, family_list, R.color.category_family);

        ListView fmListView = (ListView) findViewById(R.id.list);

        fmListView.setAdapter(fmWordAdapter);
}
}