public class BitwiseWidening {
    public static void main(String[] args) {
        byte b = 12;
        short s = 12;
        int i = 12;
        char c = 10;
        float f = 10.33f;
        double d = 10.33d;
        boolean bl = true;
        // byte can be assigned to the short but not vice versa;
        s = b;
        f = i;
        s = i;
        System.out.println(f);
        System.out.println(s);
    }
}
