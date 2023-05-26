package Tugas7;

public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    Invoice(String productName, int quantity, int pricePerItem){
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        // TODO Auto-generated method stub
        return quantity * pricePerItem;
    }
}
