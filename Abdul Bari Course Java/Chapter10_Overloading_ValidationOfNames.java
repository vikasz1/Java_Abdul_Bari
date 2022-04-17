public class Chapter10_Overloading_ValidationOfNames {
    // name validation
    static boolean validate(String name){
        if(name.matches("[a-zA-Z\\s]+")){
            return true;
        }
        else{
            return false;
        }
    }
    // age validation
    static boolean validate(int age){
        if (age>=3 && age<=15){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String name = "Vikas Maury";
        int age = 35;
        if (validate(name)){
            System.out.println("Name is valid");
        }
        else{
            System.out.println("Invalid name.");
        }

        if (validate(age)){
            System.out.println("Admission grantted");
        }
        else{
            System.out.println("Admission denied");
        }

    }
}
