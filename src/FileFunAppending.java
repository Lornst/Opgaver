import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileFunAppending {
    public static void main(String[] args) {
        FileFunAppending myClass = new FileFunAppending();
        myClass.run();
    }

    public void run(){
        try{
            FileOutputStream outPutStream = new FileOutputStream("output.txt", true);
            PrintStream printStream = new PrintStream(outPutStream);

            printStream.println("HelloWorld1");
            printStream.println("HelloWorld2");
        } catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}
