class ThrowException {
    public static void main(String[] args) {
        meth1();
    }

    static void meth1() {
        try{
            int a = area(0, 0);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static int area(int x, int y) throws Exception {
        if (x <= 0 || y <= 0) {
            throw new Exception("Value can not be negative or zero");

        }
        int a = x * y;
        return a;
    }

}