package com.markermetro.androidsampler.util;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class CharactersLoader {

    public static String loadCharactersJSON(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("characters.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

}