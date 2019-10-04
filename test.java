/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasis2;
import java.util.Date;
/**
 *
 * @author AFIFAH NADHIRAH
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        customer a = new customer("Arip", "Premium");
        customer b = new customer("Arap", "Gold");
        customer c = new customer("Ira", "Silver");
        customer d = new customer ("Ari","Bukan member");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
 
        visit a1 = new visit(a, new Date());
        visit b1 = new visit(b, new Date());
        visit c1 = new visit(c, new Date());
        visit d1 = new visit(d, new Date());
        
        a1.setProductExpense(982758);
        a1.setServiceExpense(98275.8);
        System.out.print(a1.toString());
        System.out.println(" Total Harga= " + a1.getTotalexpense());
        
        b1.setProductExpense(982758);
        b1.setServiceExpense(98275.8);
        System.out.print(b1.toString());
        System.out.println(" Total Harga= " + b1.getTotalexpense());
        
        c1.setProductExpense(982758);
        c1.setServiceExpense(98275.8);
        System.out.print(c1.toString());
        System.out.println(" Total Harga= " + c1.getTotalexpense());
        
        d1.setProductExpense(982758);
        d1.setServiceExpense(98275.8);
        System.out.print(d1.toString());
        System.out.println(" Total Harga= " + d1.getTotalexpense());
        
        
    }}
        