import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            List<Forma> formas = new ArrayList<>();
            formas.add(new Circulo(3));
            formas.add(new Quadrado(5));

            for (Forma item: formas) {
                System.out.println("Área: " + item.calcularArea());
            }

    }
}
