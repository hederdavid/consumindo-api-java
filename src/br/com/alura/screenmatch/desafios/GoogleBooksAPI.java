package br.com.alura.screenmatch.desafios;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooksAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        String livro = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o livro a ser pesquisado: ");
        livro = sc.nextLine().replace(" ", "+");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=" + livro + "&AIzaSyDpVSprh6ZkuG2jqkH-Kj3gB2HNpCCnwx8=yourAPIKey"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
