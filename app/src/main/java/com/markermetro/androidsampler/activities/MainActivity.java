package com.markermetro.androidsampler.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.markermetro.androidsampler.R;
import com.markermetro.androidsampler.adapters.CharactersAdapter;
import com.markermetro.androidsampler.model.Character;
import com.markermetro.androidsampler.model.Characters;
import com.markermetro.androidsampler.model.Data;
import com.markermetro.androidsampler.util.CharactersLoader;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mCharactersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the ListView
        mCharactersList = (ListView)findViewById(R.id.characters_list);

        //load the json from file
        String characterJson = CharactersLoader.loadCharactersJSON(this);

        // convert json string into a usable list
        Gson gson = new GsonBuilder().create();
        Characters characters = gson.fromJson(characterJson, Characters.class);

        // setup adapter and bind it to the ListView
        CharactersAdapter charactersAdapter = new CharactersAdapter(this, characters.getData().getCharacters());
        mCharactersList.setAdapter(charactersAdapter);

    }
}
