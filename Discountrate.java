/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasasis2;

/**
 *
 * @author AFIFAH NADHIRAH
 */
public class Discountrate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;
    
    public static double getServiceDiscountrate(String jenis) {
        switch (jenis) {
            case "Premium" :
                return serviceDiscountPremium;
            case "Gold" :
                return serviceDiscountGold;
            case "Silver" :
                return serviceDiscountSilver;
            default :
                return 0;
        }
    }
    public static double getProductDiscountrate(String jenis) {
        switch (jenis) {
            case "Premium":
                return productDiscountPremium;
            case "Gold":
                return productDiscountGold;
            case "Silver":
                return productDiscountSilver;
            default:
                return 0;
        }
    }
    
    
}
