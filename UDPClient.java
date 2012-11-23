/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 *
 * @author Ayah
 */
public class UDPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            DatagramSocket ds = new DatagramSocket();
            String Pesan = "Dinosauruss.. T-Rex";
            InetAddress dst = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(Pesan.getBytes(), Pesan.length(), dst, 1234);
            ds.send(dp);
            ds.close();
            
            
        } catch (Exception e) {
        }
    
    
    
    }
}
