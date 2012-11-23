/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Ayah
 */
public class UDPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            DatagramSocket ds = new DatagramSocket(1234);
            byte[] buf = new byte[160];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            ds.receive(dp);
            String Pesan = new String(dp.getData());
            System.out.println(Pesan);
            ds.close();
            
        } catch (Exception e) {
        }
   
    
    
    }
}
