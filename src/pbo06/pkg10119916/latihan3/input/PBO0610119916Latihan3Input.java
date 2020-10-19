/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan3.input;

import java.util.Scanner;
/**
 * 
 * @author 
 * NAMA     : DIAN ARPIAN
 * KELAS    : IF10K
 * NIM      : 10119916
 * Deskripsi Program : Deklarasi Variabel
 */
public class PBO0610119916Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama Anda ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println(" Nama anda Adalah " +nama);
    }
    
}
