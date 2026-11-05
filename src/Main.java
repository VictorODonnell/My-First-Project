import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO A1: Create a File object for "grades.txt"
        File file = new File("grades.txt");
        // TODO A2: Use try–catch to handle FileNotFoundException
        try {
            // TODO B1: Create a Scanner to read the file
            Scanner sc = new Scanner(file);
            // TODO B2: Print "Student Grades:"
            System.out.println("Student Grades:");
            // TODO B3: Read and print each line from the file
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            // TODO C1: Print "File not found!" if grades.txt is missing
            System.out.println("File not found!");
        }
    }
}