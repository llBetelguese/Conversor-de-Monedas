package Construccion_de_la_API;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultasMonedas {



    public Conversion DolarAPesoArgentino (double valor){

        URI conexion = URI.create("https://v6.exchangerate-api.com/v6/03e44d067063b7ce605a59be/pair/USD/ARS/"+valor);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(conexion)
                .build();
        try{

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversion.class);

        }catch (InterruptedException | IOException e) {

            throw new RuntimeException("Error al tratar de conectar con el servidor.");

        }

    }

    public Conversion pesoArgentinoDolar (double valor){

        URI conexion = URI.create("https://v6.exchangerate-api.com/v6/03e44d067063b7ce605a59be/pair/ARS/USD/"+valor);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(conexion)
                .build();
        try{

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversion.class);

        }catch (InterruptedException | IOException e) {

            throw new RuntimeException("Error al tratar de conectar con el servidor.");

        }
    }



}
