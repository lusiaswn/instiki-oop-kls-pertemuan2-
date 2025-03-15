/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author lusia
 * TGL: 15 MARET 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "lusia";
        String nim = "2301010616";
        double ipk = 9.0;
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in));
        
//        System.out.print("Input Nama Mahasiswa:");
//        System.out.print("input NIM Mahasiswa");
        try{
            System.out.print("Input Nama Mahasiswa:");
            nama = dtain.readLine();
           
            System.out.print("input NIM Mahasiswa:");
            nim = dtain.readLine();
            
            System.out.print("Input IPK Mahasiswa:");
            String ipkInput = dtain.readLine();  // Membaca input IPK sebagai String
            ipk = Double.parseDouble(ipkInput);
            
                }catch(IOException e){
            System.out.println("Error pembacaan data");
            
            }
                
      
        
        System.out.print(nama);
        System.out.println(nim);
        
        System.out.printf("Nama Saya %s dengan NIM %s dengan IPK %.2f",nama, nim, ipk);
            //print dengan menggunakan sistem format,dan jika formatnya menggunakan integer apa yang harus digunakan
        // TODO code application logic here
        
       
                
     
    }
    
}
