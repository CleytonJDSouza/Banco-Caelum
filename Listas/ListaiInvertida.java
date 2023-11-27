import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaiInvertida {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        System.err.println("Lista original: " + lista);

        Collections.reverse(lista);

        System.out.println("Lista invertida: " + lista);
    }
}
