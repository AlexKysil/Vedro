package com.example.android.miwok;

public class Word {
    private String englishWord;
    private String miwokWord;
    private int imgID;
    private boolean imageState;
    private int audioID;

    public Word(String enlishWord, String miwokWord, int receivedAudioID){
        this.englishWord = enlishWord;
        this.miwokWord = miwokWord;
        this.imageState = false;
       this.audioID = receivedAudioID;
    }
    public Word(String englishWord, String miwokWord, int imgID, int recievedAudioId){
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imgID = imgID;
        this.imageState = true;
        this.audioID = recievedAudioId;
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
    public int getAudioID(){
        return audioID;
    }
}
