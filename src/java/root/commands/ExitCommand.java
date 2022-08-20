package root.commands;

import root.data.ProductList;

public class ExitCommand extends Command {
    public ExitCommand() {
    }

    public void execute(ProductList products) {
        System.out.println("Exiting");
    }
}
