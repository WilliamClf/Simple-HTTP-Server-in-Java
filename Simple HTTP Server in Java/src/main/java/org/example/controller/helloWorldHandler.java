package org.example.controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class helloWorldHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        byte[] helloWorldByte = "Hello World, teste 123 William".getBytes();

        exchange.sendResponseHeaders(200, helloWorldByte.length);

        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(helloWorldByte);
        outputStream.close();
        System.out.println("Executou Novamente");
    }
}
