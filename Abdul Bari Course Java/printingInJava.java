public class printingInJava {
    public static void main(String[] args) {
        int x = -10,y = 20;
        float f = 123.45f;
        char c = 64;
        System.out.println("Sum "+(x+y));
        System.out.printf("Hello %d %f %c World\n",x,f,c);
        System.out.printf("%e\n",f);
        System.out.printf("%+5d\n",x);
        System.out.printf("%f\n",f);
        System.out.printf("%6.3f\n",f);
    }
}
