package com.example.android.quizfordscunilag;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceUtils {
    private static int mScore;

    public static void updateScore(Context context, int score) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MyScore", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("score", score).commit();
        mScore = score;
    }

    public static int getScore() {
        return mScore;
    }
}
