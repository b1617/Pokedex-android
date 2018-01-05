package org.vinci.dhinesh.pokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Gson gson = new Gson();
    private ArrayList<Pokemon> pokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokemons = buildPokemonsList();
        Log.e("coucou", pokemons.get(0).toString());
        ListView pokemonList = (ListView) findViewById(R.id.pokemon_list);
        pokemonList.setAdapter(new PokemonAdapter(getApplicationContext(), pokemons));
    }

    private ArrayList<Pokemon> buildPokemonsList() {
        Type listType = new TypeToken<ArrayList<Pokemon>>() {
        }.getType();
        return gson.fromJson(readJSONFile("pokemon.json"), listType);
    }

    private String readJSONFile(String filename) {
        String result = "";
        try {
            InputStream inputStream = getAssets().open(filename);
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            result = new String(b);
        } catch (Exception e) {
            Log.e("Error readJSONFile", e.getMessage());
        }
        return result;
    }
}
