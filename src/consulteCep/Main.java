import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException  {

        Scanner scanner = new Scanner(System.in);
        String query = "";



        while(!query.equalsIgnoreCase("sair")) {
            System.out.println("Digite seu CEP? ");
            query = scanner.nextLine();
            ConsultaCep consulta = new ConsultaCep();

            try {
                Endereco novoEndereco = consulta.buscaEndereco(query);
                GerarArquivo gerar = new GerarArquivo();
                gerar.salvaJson(novoEndereco);

            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }

            if (query.equalsIgnoreCase("sair")){
                break;
            }
        }

        System.out.println("Finalizando a aplicação! ");

    }
}
