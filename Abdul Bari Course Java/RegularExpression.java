public class RegularExpression {
    public static void main(String[] args) {
        String str = "b";
        String str1 = "abbaccab";
        String str2 = "abcdEFGH";
        System.out.println(str.matches("[abc]"));
        System.out.println(str.matches("\\W"));
        System.out.println(str1.matches("[abc]*"));
        System.out.println(str2.matches("[a-z]{4}[A-Z]{4}"));
        
    }
}
