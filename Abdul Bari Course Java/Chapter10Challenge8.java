public class Chapter10Challenge8 {
    public static void main(String[] args) {
        double sum = 0d;
        for (String x:args){
            if (x.matches("[0-9\\.]+")){
                sum += Double.parseDouble(x);
            }
        }
        System.out.println(sum);
    }
}