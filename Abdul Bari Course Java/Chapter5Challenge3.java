import java.util.Scanner;

class Chapter5Challenge3{
    //FIND TOTAL AREA AND VOLUME OF THE CUBOID
    public static void main(String[] args) {
        int a,b,c,area,volume;
        System.out.println("Please Enter a, b and c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        area = 2*(a*b+b*c+c*a);
        volume = a*b*c;
        System.out.println("total area is : "+area+" square meter");
        System.out.println("total volume is : "+volume+" cubic meter");
    }
}