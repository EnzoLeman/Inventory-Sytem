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
    public String ownerName;
    public String shopName;

    // Constructor to initialize shop & owner names
    public Shop(String ownerName, String shopName) {
        this.ownerName = ownerName;
        this.shopName = shopName;
    }

    // Getter for OwnerName
    public String getOwnerName() {
        return ownerName;
    }
    // Getter for ShopName
    public String getShopName() {
        return shopName;
    }

    
}
