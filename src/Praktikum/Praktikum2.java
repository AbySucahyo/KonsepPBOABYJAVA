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
public class Praktikum2 {
    public static void main(String[] args) {
        System.out.println("====Konversi Suhu====");
        Scanner input = new Scanner (System.in);
        
        double reamur;
        double farenheit;
        double kelvin;
        
        System.out.print("Masukkan nilai suhu Celcius (derajat) : ");
        int celcius = input.nextInt();
        
        System.out.println("Ingin di konversi ke : \n1.Reamur \n2.Farenheit \n3.Kelvin");
        System.out.print("Pilih nomor : ");
        int pilihan = input.nextInt();
        
        if (pilihan<4)
            switch (pilihan){
                case 1 : reamur = 0.8*celcius;
                System.out.println("Hasil Konversi = "+reamur+" Derajat");
                break;
                case 2 : farenheit = (1.8*celcius)-32;
                System.out.println("Hsail Konversi = "+farenheit+" Derajat");
                break;
                case 3 : kelvin = celcius+273;
                System.out.println("Hasil Konversi = "+kelvin+" Derajat");
            }else 
            System.out.println("Maaf Pilihan tidak ditemukan");
    }
}
