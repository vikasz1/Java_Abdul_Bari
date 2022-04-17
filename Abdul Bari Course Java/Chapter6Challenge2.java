public class Chapter6Challenge2 {
    public static void main(String[] args) {
        // question 1 : Find if a number is binary or not
        // question 2 : Find if a number is Hexadecimal  or not
        // question 3 : Find if the data is in date format

        //1
        String s = "101011";
        System.out.println(s.matches("[0-1]+"));
        //2
        String s1 = "0x123A";
        System.out.println(s1.matches("0x[0-9A-F]+"));

        String s2 = "21/05/2001";
        System.out.println(s2.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
