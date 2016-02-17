package com.pachango.votar_v1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import com.pachango.votar_v1.R;
import com.pachango.votar_v1.adapters.PusheenAdapter;
import com.pachango.votar_v1.models.Pusheen;


public class PusheenFragment extends Fragment {

    ArrayList<Pusheen> pusheensData;



    public PusheenFragment(){

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View pusheenView = inflater.inflate(R.layout.pusheen_fragment, container, false);

        ArrayList<Pusheen> pusheens = new ArrayList<>();

        Pusheen pusheen = new Pusheen();
        pusheen.setId(1);
        pusheen.setName("Partido Popular");
        pusheen.setPasTime("M. Ratoy");
        pusheens.add(pusheen);

        Pusheen pusheen2 = new Pusheen();
        pusheen2.setId(2);
        pusheen2.setName("Psoe");
        pusheen2.setPasTime("P. Santréz");
        pusheens.add(pusheen2);

        Pusheen pusheen3 = new Pusheen();
        pusheen3.setId(3);
        pusheen3.setName("Podemos");
        pusheen3.setPasTime("P. Inglesas");
        pusheens.add(pusheen3);

        Pusheen pusheen4 = new Pusheen();
        pusheen4.setId(4);
        pusheen4.setName("Izquierda Unida");
        pusheen4.setPasTime("Un tio");
        pusheens.add(pusheen4);

        Pusheen pusheen5 = new Pusheen();
        pusheen5.setId(5);
        pusheen5.setName("Colición Canaria");
        pusheen5.setPasTime("Mr Burns");
        pusheens.add(pusheen5);

        Pusheen pusheen6 = new Pusheen();
        pusheen6.setId(6);
        pusheen6.setName("UP & D");
        pusheen6.setPasTime("Sra Burns");
        pusheens.add(pusheen6);

        Pusheen pusheen7 = new Pusheen();
        pusheen7.setId(7);
        pusheen7.setName("Ciudadanos");
        pusheen7.setPasTime("Albert Domenech");
        pusheens.add(pusheen7);

        Pusheen pusheen8 = new Pusheen();
        pusheen8.setId(8);
        pusheen8.setName("Ciu");
        pusheen8.setPasTime("Artur Mes");
        pusheens.add(pusheen8);

        Pusheen pusheen9 = new Pusheen();
        pusheen9.setId(9);
        pusheen9.setName("Exquerra Repubicans");
        pusheen9.setPasTime("Ferre Adriá");
        pusheens.add(pusheen9);
        //Fin de nuestro dataset

        //Configuración del recyclerView, con nuestro dataSet y nuestro Adapter

        //Aqui buscamos el Widget recyclerView
        RecyclerView recyclerView = (RecyclerView) pusheenView.findViewById(R.id.my_recycler_view);

        //A pesar del tamaño de la pantalla, asegurar que los elementos se vean siempre igual.
        recyclerView.setHasFixedSize(true);

        //Configuramos la animación por defecto
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Ahora le pasamos nuestro dataset y la forma en que se vera cada fila.
        recyclerView.setAdapter(new PusheenAdapter(pusheens, R.layout.row));

        //Importante, ahora podemos indicar si mostrar los elementos como fila o como grilla, en este
        //caso setLayoutManager() esta  configurado como grilla de una columna, es por es eso que se ve
        //como fila, recordar que el mismo resultado se obtiene con
        // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);

        return pusheenView;


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);




    }

}
