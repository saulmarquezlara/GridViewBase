package sml.edu.tesoem.tics.gridviewbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;
    Contenido contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvcontenedor);

        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("Fernando");
        arreglo.add("Paco");
        arreglo.add("El chato");
        arreglo.add("Pepe");
        arreglo.add("Pecas");
        arreglo.add("Pica");
        arreglo.add("Papas");
        arreglo.add("Con");
        arreglo.add("Pico");
        arreglo.add("Pica");
        arreglo.add("Papas");

        contenido = new Contenido(this, arreglo);
        gvdatos.setAdapter(contenido);
    }
}
