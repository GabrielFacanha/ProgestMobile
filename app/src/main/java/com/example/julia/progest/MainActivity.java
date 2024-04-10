package com.example.julia.progest;

import android.widget.SearchView;

public class MainActivity {

    SearchView searchView = findViewById(R.id.barra_de_pesquisa);
    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
        @Override
                public boolean onQueryTextSubmit(String query){
            //Você pode executar a busca aqui
            return false;
        }
        @Override
                public boolean onQueryTextChange(String newText){
            //Você pode utilizar os resultados da busca em tempo real aqui
            returb false;
        }
    }
});
