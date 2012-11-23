/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package klienthread;

import com.sun.corba.se.impl.encoding.BufferManagerRead;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Ayah
 */
public class KlienTHread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket server = new Socket("localhost", 5002);
            BufferedReader masuk = new BufferedReader(new InputStreamReader(server.getInputStream()));
            DataOutputStream keluar = new DataOutputStream(server.getOutputStream());
            String pesan = masuk.readLine();
            System.out.println("server :"+pesan);
            
            String message;
            BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
            
            while (true) {
                System.out.print("Pesan dikirim : ");
                message = m.readLine();
                keluar.writeBytes(message+"\n");
                
                
            }
            
            
            
            
        } catch (Exception e) {
        }

        
        
    
    
    }
}
