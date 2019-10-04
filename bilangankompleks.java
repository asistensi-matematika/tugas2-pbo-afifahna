/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasis2;
import java.util.Scanner;
/**
 *
 * @author AFIFAH NADHIRAH
 */
public class bilangankompleks {
    private int riil;
    private int imajiner;
    
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("OPERASI PERKALIAN BILANGAN KOMPLEKS");
        System.out.println("Pilihan : \n1. Soal Utama \n2. Soal Optional");
    int pilih; 
    System.out.print("Pilih Soal: ");
    pilih=input.nextInt();
    switch (pilih){ 
        case 1:
        {
        bilangankompleks b = new bilangankompleks(0,4); 
        bilangankompleks b2 = new bilangankompleks(3,-7);
        bilangankompleks b3 = new bilangankompleks (7,6); 
        bilangankompleks b4 = new bilangankompleks(7,6); 
            System.out.print("\nSoal: ");
            b.info(); 
            b2.info(); 
            bilangankompleks b5; 
            b5 = b.perkalian(b2); 
            System.out.print("\nHasil= ");
            b5.info(); 
            System.out.print("\n\nSoal: ");
            b3.info(); 
            b4.info(); 
            bilangankompleks b6; 
            b6 = b3.perkalian(b4);
            System.out.print("\nHasil= ");
            b6.info(); 
            System.out.println("");
            break;
        }
        case 2:
        {
            bilangankompleks b = new bilangankompleks(0,3);
            bilangankompleks b2 = new bilangankompleks(0,3);
            bilangankompleks b3 = new bilangankompleks(0,3);
            System.out.print("\nSoal: ");
            b.info();
            b2.info();
            b3.info();
            bilangankompleks b4;
            b4= b.perkalian2(b2, b3);
            System.out.print("\nHasil= ");
            b4.info();
            System.out.println("");
            break;
        }
     
    
}}
    
    public bilangankompleks(){
        this.riil=0;
        this.imajiner=0;
    }
   public bilangankompleks(int riil, int imajiner){
       this.riil=riil;
       this.imajiner=imajiner;
   } 
   public void setRiil(int r){
       this.riil = r;
   }   
   public void setImajiner(int i){
       this.imajiner = i;
   }
   public int getRiil(){
       return this.riil;
      }
   public int getImajiner(){
       return this.imajiner;
   }
   public bilangankompleks perkalian(bilangankompleks a){
       bilangankompleks kali = new bilangankompleks();
       kali.riil = (getRiil()*a.riil)+(getImajiner()*a.imajiner*(-1));
       kali.imajiner = (getRiil()*a.imajiner)+(getImajiner()*a.riil);
       return kali;
   }
   public bilangankompleks perkalian2 (bilangankompleks a, bilangankompleks b){
       bilangankompleks kali2 = new bilangankompleks();
       kali2 = b.perkalian(a); 
       bilangankompleks kali3 = new bilangankompleks(); 
       kali3.riil = (kali2.riil*getRiil())+(kali2.imajiner*getImajiner()*(-1));
       kali3.imajiner = (kali2.riil*getImajiner())+(kali2.imajiner*getRiil());
       return kali3; 
   }
   public void info(){
        if (this.riil==0)
                System.out.println(this.imajiner+"i");
            else if (this.imajiner==0)
                System.out.println(this.riil);
            else if (this.riil<0)
                System.out.println(this.riil + this.imajiner+"i");
            else
                System.out.println(this.riil + "+" + this.imajiner+"i");
        }
   }
