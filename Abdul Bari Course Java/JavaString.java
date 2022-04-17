public class JavaString {
    public static void main(String[] args) {
        char a[] = {'a','b','c'};
        byte b[] = {12,66,56};
        String str1 = new String(a);
        String str2 = new String(b);
        System.out.println(str1);
        System.out.println(str2);
    }
}
