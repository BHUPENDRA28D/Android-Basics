package com.example.listview;

// ----- This is a custom Word class we created to store more then one String in our layout-----

import android.media.Image;

/**    [Word] represent a Players Detail
 *     Each object has 3 properties;--- playerName ,playerType,image Resource id*/

public class Word {
    // State
    //Name of Player {eg-- Virat Kohli ,L Rahul}
    private String playerName;
    //Type of player {eg-- "BALANCED -- (Righthand Batsman)"}
    private String playerType;
    // Drawable resource ID
    private int imageResourceId;

    /*
     * Create a new Word Constructer or object.
     *
     *  mName is the name of the Player Name  (e.g. Rohit Sharma)
     *  mNumber is the corresponding Player Type (e.g."BALANCED -- (Righthand Batsman))
     *  image is drawable reference ID that corresponds to the Android version
     * */
    public Word(String mplayerName, String mplayerType,int imageResourceId) {
        playerName = mplayerName;
        playerType = mplayerType;
        this.imageResourceId = imageResourceId;
    }


    // GETTER Methode
    /**
     * Get Method to get the name of Player
     */
    public String getPlayerName() {
        return playerName;
    }
    /**
     * Get the Player Type
     */
    public String getPlayerType() {
        return playerType;
    }

    public int getmImageResourceId() {
        return imageResourceId;
    }
}
