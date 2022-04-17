public class Chapter8Challenge4 {
    public static void main(String[] args) {
        //Pattern 1
        for (int i = 0;i<5;i++){
            for (int j = 0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }   
        //Pattern 2
        int num = 0;
        for (int a = 1;a<=5;a++){
            for (int b = 1;b<=a;b++){
                num++;
                System.out.print(num+" ");
            }
            System.out.println("");
        }
        //Pattern 3
        for (int a = 5;a>=1;a--){
            for (int b = 1;b<=a;b++){
                System.out.print(b+" ");
            }
            System.out.println("");
        }
        
    }
}
