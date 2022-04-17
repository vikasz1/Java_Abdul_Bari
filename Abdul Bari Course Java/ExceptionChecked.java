import java.io.FileInputStream;

public class ExceptionChecked {

    public static void main(String[] args) {
        FileInputStream fi = new FileInputStream("Vikas.txt");
        String line = fi.readLine();
        System.out.println(line);


    }

}
