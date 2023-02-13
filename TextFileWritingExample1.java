import java.io.FileWriter;
import java.io.IOException;
 
/**
 * This program demonstrates how to write characters to a text file.
 * @author www.codejava.net
 *
 */
public class TextFileWritingExample1 {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("User_1_VSCode.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good morning!");
            System.out.println("Current Date and Time is: test");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}