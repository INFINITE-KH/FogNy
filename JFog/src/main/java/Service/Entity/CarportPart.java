package Service.Entity;

public class CarportPart {
    
    private Product product;
    private int amount;

    public CarportPart(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }
    
    public Product getProduct(){
        return product;
    }
    
    public int getAmount(){
        return amount;
    }
    
}