import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File myFile = new File("data.txt");
        FileWriter writer = new FileWriter("data.txt");

        writer.write("Hej, dette er en test.");
        writer.write("Her er der en til sætning.");

        writer.close();
    }
}
