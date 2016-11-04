/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspiramit;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TugasPiramit {

    int n;
   
//   ============================ segitiga siku kiri bawah 
    
    public void SegitigaSiku1(){
        System.out.println("Segitiga Siku Kiri Bawah = ");
        for (int i=1;i<=n;i++){
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
    
//   ============================ segitiga siku kiri atas
    
    public void SegitigaSiku2(){
        System.out.println("Segitiga Siku Kiri Atas = ");
        for (int i=n;i>0;i--){
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
  
//   ============================ segitiga siku kanan atas
    
     public void SegitigaSiku3(){
        System.out.println("Segitiga Siku Kanan Atas = ");
        for (int i=n;i>0;i--){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
 
//   ============================ segitiga siku kanan bawah     
     
     public void SegitigaSiku4(){
        System.out.println("Segitiga Siku Kanan Bawah = ");
        for (int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
        for (int k=0;k<i;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
    
//    =========================== segitiga sama kaki 
     
    public void SegitigaSiku5(){
        System.out.println("Segitiga Sama Kaki = ");
        for (int i=1;i<=n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
        for (int k=0;k<=(i*2)-2;k++){
            System.out.print(k+1);
        }
            System.out.println();
        }
    }
     
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        TugasPiramit tampil = new TugasPiramit();
        
        System.out.print(" Masukkan tinggi segitiga = ");
        tampil.n = input.nextInt();        
        tampil.SegitigaSiku1();
        tampil.SegitigaSiku2();
        tampil.SegitigaSiku3();
        tampil.SegitigaSiku4();
        tampil.SegitigaSiku5();
    }
    
}

