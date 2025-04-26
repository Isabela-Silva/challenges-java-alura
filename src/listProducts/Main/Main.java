import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto meuProduto = new Produto("laptop", 6.8);
        meuProduto.setQuantidade(5);

        Produto meuNovo = new Produto("computador", 9.85);
        meuNovo.setQuantidade(1);

        ProdutoPerecivel novoProduto = new ProdutoPerecivel("arroz", 6.8);


        ArrayList<Produto> minhaLista = new ArrayList<>();
        minhaLista.add(meuProduto);
        minhaLista.add(meuNovo);
        minhaLista.add(novoProduto);
        System.out.println("O tamanho da lista é: " + minhaLista.size());
        System.out.println("O produto indice 1 é: " + minhaLista.get(1));
        System.out.println(minhaLista);



    }
}
