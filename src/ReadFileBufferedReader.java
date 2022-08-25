import java.io.*;
public class ReadFileBufferedReader {
    private final static String FILE_URL = "/home/duonghieu/codegym/modun2/demo/src/data.txt";


    public static void main(String[] args) throws IOException {
        File file = new File(FILE_URL);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = "";
        System.out.println("BufferedReader");

        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }

}