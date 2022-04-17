public class Chapter8Challenge5 {
    public static void main(String[] args) {
        // Pattern 4 - Printing a pyramid
        for (int i = 1;i<=5;i++){
            for (int j = 1;j<=5;j++){
                if (i+j>5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } 
            for (int k = 0;k<i;k++){
                // System.out.print("*");
            }
            }
            System.out.println("");
        }
    }
}
