package root.commands;

import root.data.ProductList;

public abstract class Command {
    public abstract void execute(ProductList products);
}
