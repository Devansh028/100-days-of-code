import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Day9_output.txt");
            writer.write("This file was created on Day 9 of 100 Days of Code.\n");
            writer.write("Great job buddy!");
            writer.close();

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }
    }
}
