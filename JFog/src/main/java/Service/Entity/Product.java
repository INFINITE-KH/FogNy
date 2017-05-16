package Service.Entity;

public class Product {

    private int id;
    private String name;
    private double measure;

    public Product(int id, String name, double measure) {
        this.id = id;
        this.name = name;
        this.measure = measure;
    }

    public Product(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", measure=" + measure + '}';
    }
    
}
