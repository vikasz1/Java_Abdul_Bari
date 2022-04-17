public class Chapter10Challenge6 {
    static int maxNum(int... a) {
        if (a.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int max = a[0];
            for (int x : a) {
                if (x > max) {
                    max = x;
                }
            }
            return max;

        }

    }

    public static void main(String[] args) {
        // Maximum of numbers from varargs
        System.out.println(maxNum(45));
    }
}
