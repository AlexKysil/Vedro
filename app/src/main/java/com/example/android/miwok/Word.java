package com.example.android.miwok;

public class Word {
    private String englishWord;
    private String miwokWord;
    private int imgID;
    private boolean imageState;

    public Word(String enlishWord, String miwokWord){
        this.englishWord = enlishWord;
        this.miwokWord = miwokWord;
        this.imageState = false;
    }
    public Word(String englishWord, String miwokWord, int imgID){
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imgID = imgID;
        this.imageState = true;
    }

    public void setEnglishWord(String newEnglishWord){
        this.englishWord = newEnglishWord;
    }

    public void setMawikWord(String newMiwokWord){
        this.miwokWord = newMiwokWord;
    }

    public String getEnglishWord(){
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getImageID(){ return imgID;}

    public boolean getImageState(){ return imageState;}
}
