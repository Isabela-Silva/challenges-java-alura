import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Titulo filme = new Titulo("Meu malvado favorito");
        Titulo musica = new Titulo("Shame on me");
        Titulo curso = new Titulo("Duolingo");

        List<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(musica);
        lista.add(curso);

        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);


    }
}
