public class ExceptionExample2 {
    public static void main(String[] args) {
        int money = 8000;
        if (money<6000){
            try{
                throw new minBalanceExceptions();
            }
            catch(minBalanceExceptions e){
                System.out.println(e.toString());
            }
        }
    }
}

class minBalanceExceptions extends Exception{
    public String toString() {
        return "Minimum balance should be 6000";
    }
}