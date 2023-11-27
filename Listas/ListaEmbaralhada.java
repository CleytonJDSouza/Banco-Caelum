package Listas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaEmbaralhada {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        System.out.println("Lista original: " + lista);

        Collections.shuffle(lista);

        System.out.println("Lista embaralhada: " + lista);
    }
}
