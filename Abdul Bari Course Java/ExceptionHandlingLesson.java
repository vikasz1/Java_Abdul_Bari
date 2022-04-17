public class ExceptionHandlingLesson {
    public static void main(String[] args) {
        int a = 13;
        int b = 0;
        Exception x = new Exception();
        x.printStackTrace();
        
        try{
            int c = a/b;
            System.out.println(c);      
        }
        catch (ArithmeticException e){
            System.out.println("b can not be 0 "+e);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("something else;");
        }
        System.out.println("Bye");
    }
}
