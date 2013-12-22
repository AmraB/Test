package com.example.isattest1;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView listView = (ListView) findViewById(R.id.korisniciList);
        
        List<Korisnik> listaKorisnika=new ArrayList<Korisnik>();
        listaKorisnika = Korisnik.GenrateTestData(10);
        
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.addAll(Korisnik.GetImenaKorisnika(listaKorisnika));
        listView.setAdapter(adapter);
    }
   
}
