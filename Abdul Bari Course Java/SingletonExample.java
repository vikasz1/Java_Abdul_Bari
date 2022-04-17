class CoffeeMachine{
    private double powderQty;
    private double milkQty;

    private static CoffeeMachine our = null;

    private CoffeeMachine(){
        powderQty = 1;
        milkQty = 1;
    }
    public static CoffeeMachine getInstance(){
        if (our ==null){
            our = new CoffeeMachine();
        }
        return our;
    }
    public void fillmilk(float milkQty){
        milkQty = 12.9f;
    }
    public void getCoffei(){
        if (this.milkQty>1){
            System.out.println("Your Tea is ready sir!!!");
        }
        else{
            System.out.println("I don't have milk for that!");
        }
    }

}
public class SingletonExample {
    public static void main(String[] args) {

    CoffeeMachine c = CoffeeMachine.getInstance();
    c.fillmilk(4.0f);
    c.getCoffei();
    }


}
