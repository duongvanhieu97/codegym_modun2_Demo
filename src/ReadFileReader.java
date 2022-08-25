import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileReader {
//    private final static String FILE_URL = "/home/duonghieu/codegym/modun2/demo/src/data.txt";


    public static void main(String args[]) throws IOException {

        // Đọc dữ liệu từ File với File và FileReader
        File file = new File("/home/duonghieu/codegym/modun2/demo/src/data.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            String line = reader.readLine();
            System.out.println("FileScanner");

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFileBufferedReader.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFileBufferedReader.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
                // file.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadFileBufferedReader.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }
}
