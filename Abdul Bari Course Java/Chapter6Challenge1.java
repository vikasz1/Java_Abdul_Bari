public class Chapter6Challenge1 {
    public static void main(String[] args) {
        // find if email id on gmail or not
        // find username and domain from the email

        String email = "vikasmaury225@gmail.com";
        System.out.println(email.matches(".*@gmail.*"));

        System.out.println(email.substring(0,email.indexOf("@"))); //username
        System.out.println(email.substring(email.indexOf("@")+1,email.length())); //domain
        
    }
}
