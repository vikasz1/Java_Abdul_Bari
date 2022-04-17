import java.lang.Math;
public class JavaMethods {
    public static void main(String[] args) {
    
        String str = "Vikas Maury   ";
        int length = str.length();
        str = str.trim();
        str = str.replace("a","u");
        System.out.println(str);
        System.out.println("Length of the given string is : "+length);

        String str1 = new String("Java Full");
        str1.substring(2,7);

        // New
        String str_name = "Mr. Shahrukh Khan";
        String name = "Vikas";
        System.out.println(str_name.startsWith("Mr.")); //true
        System.out.println(str_name.endsWith("Khan")); //true
        System.out.println(name.equalsIgnoreCase("vikas")); //true 

    }
}
