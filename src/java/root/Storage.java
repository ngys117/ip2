package root;

import com.google.gson.Gson;
import root.data.ProductList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Storage {

    Gson gson;

    public Storage() {
        this.gson = new Gson();
    }

    public void save(ProductList productList) throws IOException {
        FileWriter fileWriter = new FileWriter("docs/saveData");
        gson.toJson(productList, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }

    public ProductList read() throws FileNotFoundException {
        FileReader fileReader = new FileReader("docs/saveData");
        return gson.fromJson(fileReader, ProductList.class);
    }
}
