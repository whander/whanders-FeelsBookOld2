package com.example.whanders_feelsbook;

import android.util.Log;

public class Love extends Mood {
    private String name = "Love";

    public Love(){
        Log.d("whanders","Setting type to anger");
        this.setType(this.name);
    }

}