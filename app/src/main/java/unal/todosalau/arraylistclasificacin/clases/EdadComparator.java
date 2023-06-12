package unal.todosalau.arraylistclasificacin.clases;

import java.util.Comparator;

public class EdadComparator implements Comparator<Persona>{
    @Override
    public int compare(Persona persona1, Persona persona2){
        return Integer.compare(persona1.getEdad(), persona2.getEdad());
    }

}
