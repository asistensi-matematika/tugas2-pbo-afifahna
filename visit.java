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
public class visit {
    private customer name;
    private Date date;
    private double serviceexpense;
    private double productexpense;
    private double totalexpense;
    
    public visit(customer name,Date date){
        this.name=name;
        this.date=date;
    }
    public String getName(){
        return name.getName();
    }
     public String getCustomerName() {
        return name.getName();
    }

    public double getServiceexpense() {
        return serviceexpense;
    }

    public void setServiceExpense(double serviceexpense) {
        this.serviceexpense = serviceexpense;
    }

    public double getProductexpense() {
        return productexpense;
    }

    public void setProductExpense(double productexpense) {
        this.productexpense = productexpense;
    }
    public double getTotalexpense(){
        return  (serviceexpense - (serviceexpense * Discountrate.getServiceDiscountrate(name.getMembertype()))) +
                (productexpense - (productexpense * Discountrate.getProductDiscountrate(name.getMembertype())));
    }
    public double setTotalexpense(){
        this.totalexpense = (serviceexpense - (serviceexpense * Discountrate.getServiceDiscountrate(name.getMembertype()))) +
                (productexpense - (productexpense * Discountrate.getProductDiscountrate(name.getMembertype())));
    }
    
    @Override
    public String toString() {
        return  "Nama= " + name.getName() + " Tanggal Beli= " + date;
    }
  }
