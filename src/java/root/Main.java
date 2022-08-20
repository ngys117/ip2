package root;

import root.commands.Command;
import root.commands.ExitCommand;
import root.data.ProductList;

import java.util.Scanner;

public class Main {

    ProductList products;
    Storage storage;

    private void start() {
        System.out.println("Hi, this is Duke.");
        storage = new Storage();
        products = new ProductList();
        try {
            products = storage.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void loop() {
        Command command = null;
        do {
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            Parser parser = new Parser(line);
            try {
                command = parser.parseInput();
                command.execute(products);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!(command instanceof ExitCommand));
    }

    private void end() {
        try {
            storage.save(products);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Goodbye!");
    }

    public void run() {
        start();
        loop();
        end();
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
