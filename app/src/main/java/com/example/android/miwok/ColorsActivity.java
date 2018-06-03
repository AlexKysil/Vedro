package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<Word> col_list = new ArrayList<Word>();

        col_list.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        col_list.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        col_list.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        col_list.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        col_list.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        col_list.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        col_list.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        col_list.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter col_adap = new WordAdapter(this, col_list, R.color.category_colors);

        final ListView colList = (ListView) findViewById(R.id.list);

        colList.setAdapter(col_adap);

        colList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = col_list.get(i);
                mp = MediaPlayer.create(ColorsActivity.this, word.getAudioID());
                mp.start();
            }
        });
     }
}
