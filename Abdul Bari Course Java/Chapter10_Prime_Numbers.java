class Chapter10_Prime_Numbers{

    static boolean isPrime(int number){
        
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Check if a number is prime or not
        int num = 47;
        System.out.println(isPrime(num));
    }
}