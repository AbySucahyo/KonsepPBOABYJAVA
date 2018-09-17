/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Aby
 */
public class PraktikumBentuk2 {
     public static void main(String[] args) {
        int x,y;
        for(x=1;x<=4;x++){
            for(y=1;y<=4;y++){
                if(y==1||x==4||x==2&&y==2||x==2&&y==2||x==3&y==2||x==3&y==3){
                    System.out.print("@");
            }else System.out.print(" ");
        }
            System.out.println(" ");
    }
}
}
