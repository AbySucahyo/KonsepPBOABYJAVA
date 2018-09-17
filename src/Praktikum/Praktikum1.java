/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.util.Scanner;
/**
 *
 * @author Aby
 */
public class Praktikum1 {
    public static void main(String[] args) {
        System.out.println("====HITUNG LUAS PERMUKAAN BOLA====");
        Scanner input = new Scanner (System.in);
        
        double phi = 3.14;
        double hasil;
        System.out.print("Masukkan nilai jari-jari : ");
        int r = input.nextInt();
        
        hasil  = 4*phi*r*r;
        System.out.println("Hasil = "+hasil);
    }
}
