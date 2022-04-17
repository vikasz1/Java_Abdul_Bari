public class ThrowException2 {

    static int area(int x, int y) throws negativeValueException {
        if(x<0 ||y<0) throw new negativeValueException();
        return x*y;
    }

    public static void main(String[] args) {
        
        try{
            System.out.println(area(10,-9));
        }
        catch(negativeValueException e){
            System.out.println(e);
        }

    }
}
class negativeValueException extends Exception {
    @Override
    public String toString() {
        return "Negative values not allowed";
    }
}