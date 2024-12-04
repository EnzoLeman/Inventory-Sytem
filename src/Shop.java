/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Shop {
    
    // Shop Variable Declaration
    public String pct_Name;
    public Double pct_ID;
    public Double pct_Price;
    public Double pct_Qty;

    // Shop Details Variable Declaration    
    public String owner_Name;
    public String shop_Name;

    // Constructor to initialize object with shop & owner names
    public Shop(String owner_Name, String shop_Name) {
        this.owner_Name = owner_Name;
        this.shop_Name = shop_Name;
    }

    public String getOwner_Name() {
        return owner_Name;
    }

    public String getShop_Name() {
        return shop_Name;
    }

    
}
