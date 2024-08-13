package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import org.example.controller.helloWorldHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            HttpServer servidor = HttpServer.create(
                    new InetSocketAddress(8080), 0
            );
            
            servidor.createContext("/helloWorld", new helloWorldHandler());

            servidor.setExecutor(null);
            servidor.start();
            System.out.println("Servidor Rodando na porta 8080");
        } catch (IOException e) {
           System.out.println(e);
        }
    }
}
