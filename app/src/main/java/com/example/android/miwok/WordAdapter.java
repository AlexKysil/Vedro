package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Admin on 14.02.2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
        private int bgkColor;
    public WordAdapter(Activity context, ArrayList<Word> list, int bkgColor){
        super(context, 0, list);
        this.bgkColor = bkgColor;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemVIew = convertView;
        if(listItemVIew == null){
            listItemVIew = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        if(currentWord.getImageState()) {
            ImageView imgView = (ImageView) listItemVIew.findViewById(R.id.image);
            imgView.setVisibility(View.VISIBLE);
            imgView.setImageResource(currentWord.getImageID());
        }
        else{
            ImageView imgView = (ImageView) listItemVIew.findViewById(R.id.image);
            imgView.setVisibility(View.GONE);
        }
        TextView eglWord = (TextView) listItemVIew.findViewById(R.id.default_text_view);
        eglWord.setText(currentWord.getEnglishWord());

        TextView miWord = (TextView) listItemVIew.findViewById(R.id.miwok_text_view);
        miWord.setText(currentWord.getMiwokWord());

        View textContainer = listItemVIew.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), bgkColor);
        textContainer.setBackgroundColor(color);

        return listItemVIew;

    }
}
