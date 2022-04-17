import java.util.ArrayList;

public class LearnArray {
        public static void main(String[] args) {
            // String[] studentName = new String[30];
            // studentName[0] = "Rakesh";
            // studentName[29] = "kailash";
            // // studentName[30] = "Raman";
            
            ArrayList<String> students = new ArrayList<>();
            students.add("vikas");
            students.add("Shivanand Maury");
            System.out.println(students);


            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
                
            }
        }
}