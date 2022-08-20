package root.commands;

import root.data.Product;
import root.data.ProductList;

public class AddCommand extends Command {

    String name;
    int id;

    public AddCommand(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void execute(ProductList products) {
        System.out.println("Adding" + " " + products.addProduct(new Product(name, id)));
    }
}
