public class Chapter7Challange1 {
    public static void main(String[] args) {
        //1. Find if a number is even or odd
        //2. Find person is young or not
        //3. Find grades of a given marks

        //1.
        int num = 12;
        if (num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        //2.
        int age = 19;
        if (age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Young");
        }
        //3.
        int marks = 92;
        if (marks>95 && marks<=100){
            System.out.println("A");
        }
        else if(marks>90 && marks<=95){
            System.out.println("B");
        }
    }
}
