/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serperthread;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Ayah
 */
public class ThreadKlien extends Thread{
    private Socket socket_klien;
    public ThreadKlien(Socket socket_klien){
    this.socket_klien=socket_klien;
    }

    @Override
    public void run() {
        //To change body of generated methods, choose Tools | Templates.
        try {
            
            BufferedReader masuk = new BufferedReader(new InputStreamReader(socket_klien.getInputStream()));
            DataOutputStream keluar = new DataOutputStream(socket_klien.getOutputStream());
            keluar.writeBytes("anda,, sudah terhubung ke server...\n");
            String pesan;
            do {                
               pesan = masuk.readLine();
                System.out.println("Klien :" +pesan);
                
                
            } while (!pesan.equalsIgnoreCase("pamit"));
            
            masuk.close();
            keluar.close();
            socket_klien.close();
            
        } catch (Exception e) {
        }
    
    
    }

   




}


