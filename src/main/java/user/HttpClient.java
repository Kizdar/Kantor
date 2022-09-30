package user;

import model.Cash;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class HttpClient {


    public URI exchange(String code) throws Exception{
        String https="";
        final URI OPEN_VALUE =
                URI.create(new StringBuilder(https)
                        .append("http://api.nbp.pl/api/exchangerates/rates/c/")
                        .append(code)
                        .append("/today/")
                        .toString());
//        System.out.println("polecenie wysłania");
//        System.out.println(OPEN_VALUE);
        return OPEN_VALUE;
    }
    public String getValue(String code) throws Exception{
        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(exchange(code))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request,HttpResponse.BodyHandlers.ofString());

//        System.out.println("otrzymujeny");
//        System.out.println(response.body());
        return response.body();
    }
}
