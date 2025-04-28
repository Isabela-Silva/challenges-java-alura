import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double limit = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o limite do seu cartão? ");
        limit = scanner.nextDouble();
        Card card = new Card(limit);


        int exit = 1;
        while (exit != 0) {
            System.out.println("Seu limite é de: " + card.getLimit());

            System.out.println("O que você comprou? ");
            String description = scanner.nextLine();
            scanner.nextLine(); // quebra

            System.out.println("E quanto custou?");
            double value = scanner.nextDouble();
            scanner.nextLine();

            Purchase purchase = new Purchase(description, value);
            boolean purchaseMade = card.toBuy(purchase);

            if (purchaseMade) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("0 pra sair - 1 pra continuar");
                exit = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }

        }

        System.out.println("*******************");
        System.out.println("COMPRAS REALIZADAS: \n");

        Collections.sort(card.getPurchases());


        for (Purchase p : card.getPurchases()){
            System.out.println(p.getDescription() + " - " + p.getValue());
        }
        System.out.println("*******************");

        System.out.println("\n Saldo atual: " + card.getBalance());




    }
}
