package com.aluracursos.conversordemonedas.calculo;

import com.aluracursos.conversordemonedas.modelo.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CalcularTipoCambio {
    public Moneda convertirMoneda(String opcion, double valor){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/df789a1b8799148008a4ef86/pair/"
                + opcion + "/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion).build();

        HttpResponse<String> response = null;
        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Moneda.class);
    }
}
