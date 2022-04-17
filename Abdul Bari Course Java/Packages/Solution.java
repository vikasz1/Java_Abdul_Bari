import java.sql.Array;
import java.util.Arrays;

class Solution {
    public static double average(int[] salary) {
        int sum = 0;
        int maximum = Arrays.stream(salary).max().getAsInt();
        int minimum = Arrays.stream(salary).min().getAsInt();
        for (int x: salary) {
            sum += x;
        }
        sum = sum - maximum-minimum;
        int average = sum / (salary.length-2);
        return average;

    }
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        // int ans = average({4000,3000,1000,2000});
        System.out.println(average(salary));

    }
}