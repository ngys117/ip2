package root;

import root.commands.*;
import root.exceptions.InvalidInputException;

public class Parser {
    private final String input;
    private String[] tokens;

    public Parser(String input) {
        this.input = input;
    }

    private void tokenize() {
        tokens = input.split(" ");
    }

    private String getUserCommand() {
        return tokens[0];
    }

    public Command parseInput() throws InvalidInputException {
        String productName;
        int productId;

        tokenize();
        String command = getUserCommand();

        switch(command) {
        case "add":
            if (tokens.length < 3) {
                throw new InvalidInputException();
            }
            productName = tokens[1];
            productId = Integer.parseInt(tokens[2]);
            return new AddCommand(productName, productId);
        case "del":
            productId = Integer.parseInt(tokens[1]);
            return new DeleteCommand(productId);
        case "list":
            return new ListCommand();
        case "exit":
            return new ExitCommand();
        default:
            throw new InvalidInputException();
        }
    }
}
