package root.data;

public class Product {

    public final String name;
    public final int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " " + id;
    }
}
