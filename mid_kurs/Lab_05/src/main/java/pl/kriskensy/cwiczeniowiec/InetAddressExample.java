package pl.kriskensy.cwiczeniowiec;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {

        try {
            //pobranie adresu IP dla domeny
            InetAddress address = InetAddress.getByName("www.example.com");
            System.out.println("Address IP: " + address.getHostAddress());

            String hostName = address.getHostName();
            System.out.println("Hostname:" + hostName);

            //pobranie adresu lokalnego hosta
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("LocalAddress IP: " + localAddress.getHostAddress());

            InetAddress[] addresses = InetAddress.getAllByName("www.youtube.com");

            for (InetAddress inetAddress : addresses) {
                System.out.println("adress IP: " + inetAddress.getHostAddress());
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
