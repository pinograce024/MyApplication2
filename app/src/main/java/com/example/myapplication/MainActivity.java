package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] PhilippineMedicinalHerbs = {"Asthma weed/Tawa-tawa", "Bitter gourd/Ampalaya",
            "Black Mulberry", "Black currant tree/Bignay",
            "Blumea camphor/Sambong", "Capsicum fructescens (Sili)",
            " Cat’s whiskers/Balbas pusa",
            "Five-leaved chaste tree/Lagundi",
            "Forest tea/Tsaang gubat",
            "Ganoderma",
            "Ginger/Luya",
            "Gotu kola/Takip kuhol",
            "Holy basil/Sulasi",
            "Jute mallow/Saluyot",
            "King-of-bitters/Sinta",
            "Lemongrass/Tanglad",
            "Mangosteen/Mangostin",
            "Mexican oregano/Philippine oregano",
            "Moringa/Malunggay",
            "Neem/Nim",
            "Noni/Noni",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, PhilippineMedicinalHerbs);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), asthma.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(view.getContext(), ampalaya.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(view.getContext(), mulbery.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(view.getContext(), Blackcurrant.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(view.getContext(), blumea.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(view.getContext(), capsicum.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(view.getContext(), balbas.class);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(view.getContext(), lagundi.class);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(view.getContext(), tsaanggubat.class);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(view.getContext(), Ganoderma.class);
                    startActivity(intent);
                }
                if (position == 10){
                    Intent intent = new Intent(view.getContext(), luya.class);
                    startActivity(intent);
                }
                if (position == 11){
                    Intent intent = new Intent(view.getContext(), Gotu.class);
                    startActivity(intent);
                }
                if (position == 12){
                    Intent intent = new Intent(view.getContext(), basil.class);
                    startActivity(intent);
                }
                if (position == 13){
                    Intent intent = new Intent(view.getContext(), saluyot.class);
                    startActivity(intent);
                }
                if (position == 14){
                    Intent intent = new Intent(view.getContext(), mallow.class);
                    startActivity(intent);
                }
                if (position == 15){
                    Intent intent = new Intent(view.getContext(), tanglad.class);
                    startActivity(intent);
                }
                if (position == 16){
                    Intent intent = new Intent(view.getContext(), mangostin.class);
                    startActivity(intent);
                }
                if (position == 17){
                    Intent intent = new Intent(view.getContext(), oregano.class);
                    startActivity(intent);
                }
                if (position == 18){
                    Intent intent = new Intent(view.getContext(), malungay.class);
                    startActivity(intent);
                }
                if (position == 19){
                    Intent intent = new Intent(view.getContext(), neem.class);
                    startActivity(intent);
                }
                if (position == 20){
                    Intent intent = new Intent(view.getContext(), noni.class);
                    startActivity(intent);
                }

            }
        });
    }
}

