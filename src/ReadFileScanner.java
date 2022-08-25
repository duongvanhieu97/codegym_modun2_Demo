import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileScanner {
    private final static String FILE_URL = "/home/duonghieu/codegym/modun2/demo/src/data.txt";

    //    Scanner
    public static void main(String[] args) {
        File text  = new File(FILE_URL);
        Scanner scanner = null;
        try {
            scanner = new Scanner(text);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Scanner");
        while (scanner.hasNextLine()) {
            String line  = scanner.nextLine();
            System.out.println(line);
        }
    }
}