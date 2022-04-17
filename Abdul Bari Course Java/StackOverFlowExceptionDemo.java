public class StackOverFlowExceptionDemo {
    public static void main(String[] args) {
        StackVikas sv =new StackVikas(5);
        try{
            sv.push(56);
            sv.pop();
            sv.pop();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}

class StackOverFlowException extends Exception {
    @Override
    public String toString() {
        return "StackOverflowException by vikas";
    }
}

class StackUnderflowException extends Exception {
    // @override
    public String toString() {
        return "StackUnderflowException by vikas";
    }
}

class StackVikas {
    private int size;
    private int top = -1;
    private int[] S;

    public StackVikas(int size) {
        this.size = size;
        S = new int[size];
    }

    public void push(int x) throws StackOverFlowException {
        if (top == size - 1) {
            throw new StackOverFlowException();
        }
        top++;
        S[top] = x;
    }
    public int pop() throws StackUnderflowException {
        int x  = -1;
        if (top == -1) {
            throw new StackUnderflowException();
        }
        x = S[top];
        top--;
        return x;
    }


}
