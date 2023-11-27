import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaRotacionada {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        System.out.println("Lista original: " + lista);

        Collections.rotate(lista, 1);

        System.out.println("Lista rotacionada: " + lista);
    }
}
