import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("isa");
        p1.setIdade(22);

        Pessoa p2 = new Pessoa();
        p2.setNome("Sandra");
        p2.setIdade(25);

        Pessoa p3 = new Pessoa();
        p3.setNome("lucas");
        p3.setIdade(25);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);

        System.out.println("o tamanho da lista é: " + listaPessoas.size());
        System.out.println("A primeira pessoa é: " + listaPessoas.get(0));
        System.out.println(listaPessoas);


    }
}
