import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileFunWriting {
    public static void main(String[] args) {
        FileFunWriting myClass = new FileFunWriting();

        myClass.run();
    }

    public void run(){
        try{
            File myFile = new File("output.txt");
            PrintStream printStream = new PrintStream(myFile);

            printStream.println("hello world1");
            printStream.println("hello world2");
        }catch(FileNotFoundException e){
            System.out.println("Filen findes ikke.");
        }
    }
}
