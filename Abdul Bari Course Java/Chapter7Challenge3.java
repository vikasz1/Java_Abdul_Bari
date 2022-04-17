import java.util.Scanner;

public class Chapter7Challenge3 {
    public static void main(String[] args) {
        //1. Display name of the day based on number
        //2. Find type of website and the protocol used
        Scanner sc = new Scanner(System.in);
        //1.
        int day = sc.nextInt();
        if (day==1) System.out.println("Monday");
        else if (day==2) System.out.println("Tuesday");
        else if (day==3) System.out.println("Wednesday");
        else if (day==4) System.out.println("Thursday");
        else if (day==5) System.out.println("Friday");
        else if (day==6) System.out.println("Saturday");
        else if (day==7) System.out.println("Sunday");
        else System.out.println("Invalid!!");
        

        //2. 
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String website = sc2.nextLine();
        int i = website.indexOf(":");
        String protocol = website.substring(0,i);

        if (protocol.equals("http")){
            System.out.println("HyperText Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String ext = website.substring(website.lastIndexOf(".")+1,website.length());
        if (ext.equals("com")){
            System.out.println("Commercial");
        }
        else if (ext.equals("in")){
            System.out.println("Indian site");
        }
        else if(ext.equals("gov")){
            System.out.println("Government");
        }
        else if(ext.equals("net")){
            System.out.println("Networking Site");
        }
        else if(ext.equals("biz")){
            System.out.println("Business");
        }
    }
}
