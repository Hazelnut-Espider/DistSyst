package com.learn.jmdnstest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


public class HTTPServer {

    public static void main(String[] args) throws Exception {
    	
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
        server.createContext("/index.html", new MyNet());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyNet implements HttpHandler {
    	
       
        public void handle(HttpExchange t) throws IOException {
            
        	String response = "Smart Home response! ";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
            
        }
    }
	// @Elder Costa Cavalcanti x20110944 (Intelligent Home Tech Service CA) Dist. System
}
