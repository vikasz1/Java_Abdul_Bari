import java.util.Stack;

import javax.print.event.PrintEvent;

public class learnStrack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("hyena");
        st.push("lion");
        st.push("cat");
        st.push("dog");

        System.out.println(st);
        st.pop();
        System.out.println("peek item:"+st.peek());

        for (String item : st) {
            System.out.println(item);
            
        }
    }
    
}
