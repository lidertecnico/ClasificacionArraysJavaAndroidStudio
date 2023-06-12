package unal.todosalau.arraylistclasificacin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

import unal.todosalau.arraylistclasificacin.clases.EdadComparator;
import unal.todosalau.arraylistclasificacin.clases.Persona;

public class MainActivity extends AppCompatActivity {
    private TextView example1TextView;
    private TextView example2TextView;
    private TextView example3TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        example1TextView = findViewById(R.id.example1TextView);
        example2TextView = findViewById(R.id.example2TextView);
        example3TextView = findViewById(R.id.example3TextView);

        // Ejemplo 1: Clasificación ascendente de un ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        Collections.sort(numeros);
        example1TextView.setText("Ejemplo 1:\nNumeros ordenados: " + numeros.toString());

        // Ejemplo 2: Clasificación descendente de un ArrayList
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("c");
        palabras.add("a");
        palabras.add("b");
        palabras.add("d");
        Collections.sort(palabras, Collections.reverseOrder());
        example2TextView.setText("Ejemplo 2:\nPalabras ordenadas: " + palabras.toString());

        // Ejemplo 3: Clasificación personalizada de un ArrayList de objetos
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("John", 25));
        personas.add(new Persona("Alice", 30));
        personas.add(new Persona("Bob", 20));
        Collections.sort(personas, new EdadComparator());
        example3TextView.setText("Ejemplo 3:\nPersonas ordenadas por edad: " + personas.toString());
    }














}