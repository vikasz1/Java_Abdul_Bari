public class Chapter10Challenge5 {
    static void namePrint(String ...A){
        for(int i = 0;i<A.length;i++){
            System.out.println(i+1+". "+A[i]);
        }
    }
    public static void main(String[] args) {
        namePrint("Vikas","shivanand");
    }
}
