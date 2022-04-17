public class Chapter10Challenge4 {

    static void show(int... A) {
        for (int x:A){
            System.out.print(x);
        }System.out.println("");
    }

    public static void main(String[] args) {
        show(1,2,3);
        show();
        show(new int[]{3,5,7,2,4,9,11});

    }
}
