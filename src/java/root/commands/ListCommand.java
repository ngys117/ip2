package root.commands;

import root.data.ProductList;

public class ListCommand extends Command {
    public void execute(ProductList products) {
        products.listProduct();
    }
}
