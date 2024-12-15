class Shop {
    
    // Shop details
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
