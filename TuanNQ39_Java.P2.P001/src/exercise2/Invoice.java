package exercise2;

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String part, String description, int count, double price) {
        partNumber = part;
        partDescription = description;
        setQuantity(count); 
        setPricePerItem(price); 
    }

    public void setPartNumber(String part) {
        partNumber = part; 
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String description) {
        partDescription = description; 
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int count) {

    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double price) {

    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" + "partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity + ", pricePerItem=" + pricePerItem + '}';
    }

    @Override
    public double getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


}
