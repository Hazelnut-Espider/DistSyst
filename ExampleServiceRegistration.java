
package com.learn.jmdnstest;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class ExampleServiceRegistration {

    public static void main(String[] args) throws InterruptedException {

        try {
            // ------------- JmDNS instance ---------------\\
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			System.out.println("Registration: InetAddress.getLocalHost():" + InetAddress.getLocalHost());

            // Register a service---------------------------- localhost----------------- port---server registration
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "example", 8000, "path=index.html");
            jmdns.registerService(serviceInfo);
            
            Thread.sleep(4000);

            // Unregister all services
            //jmdns.unregisterAllServices();
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    } // @Elder Costa Cavalcanti x20110944 (Intelligent Home Tech Service CA) Dist. System
}
