package com.example.luisangel.apprecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.luisangel.apprecyclerview.Adapters.AndroidAdapter;
import com.example.luisangel.apprecyclerview.Modelos.Android;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rvDatos;
    private AndroidAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDatos = (RecyclerView)findViewById(R.id.rvDatos);
        rvDatos.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapter = new AndroidAdapter(MainActivity.this);
        rvDatos.setAdapter(adapter);
        ArrayList<Android> lista = new ArrayList<>();

        lista.add(new Android(
                lista.size()+1,
                R.drawable.image1,
                "Angel cake",
                "Android 1.0"
        ));
        lista.add(new Android(
                lista.size()+1,
                R.drawable.image2,
                "Angel cake",
                "Android 1.1"
        ));

        lista.add(new Android(
                lista.size()+1,
                R.drawable.image3,
                "Angel cake",
                "Android 1.2"
        ));
        lista.add(new Android(
                lista.size()+1,
                R.drawable.image4,
                "Angel cake",
                "Android 2.2"
        ));
        adapter.agregarElemento(lista);
    }
}
