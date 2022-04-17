import java.io.*;
import java.util.*;


class ResourcesDemo{
    static FileInputStream fi;

    static void Divide() throws Exception
    {
        fi = new FileInputStream("C:/Users/maury/Desktop/vikas.txt");
        Scanner sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/b);
        System.out.println(a/c);
        fi.close();
    }

    public static void main(String[] args) throws Exception {
        Divide();
    }
}