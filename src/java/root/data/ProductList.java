package root.data;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private List<Product> products;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product deleteProduct(int id) {
        for (Product p: products) {
            if (p.id == id) {
                products.remove(p);
                return p;
            }
        }
        return null;
    }

    public void listProduct() {
        System.out.println(products);
    }
}
