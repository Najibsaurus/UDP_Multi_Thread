/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serperthread;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ayah
 */
public class SErperTHread {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ServerSocket server = new ServerSocket(5002);
            System.out.println("Server akitif pada port 5002..");
    
            
            while(true){
            System.out.println("server listening,,");
            Socket klien = server.accept();
            System.out.println("klien tersambung dari "+klien.getInetAddress().getHostAddress());
            new ThreadKlien(klien).start();
      
      
            }
            
            
            
        } catch (Exception e) {
        }
        
        
    }
}
