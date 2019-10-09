/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithhsqldb;

/**
 *
 * @author pedago
 */
public class Product {
    private final int productCode;
    private final String productName;
    private final float productPrice;
    
    public Product(int code,String name,float price){
        
            productCode=code;
            productName=name;
            productPrice=price;
    }
    
    public int getCode(){
        return this.productCode;
    }
    
    public String getName(){
        return this.productName;
    }
    
    public float getPrice(){
        return this.productPrice;
    }
    
    
}
