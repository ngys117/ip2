package root.commands;

import root.data.ProductList;

public class DeleteCommand extends Command {

    int id;

    public DeleteCommand(int id) {
        this.id = id;
    }

    public void execute(ProductList products) {
        System.out.println("Deleting" + " " + products.deleteProduct(id));
    }
}
