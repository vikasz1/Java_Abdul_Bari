public class Chapter7Challenge4 {
    public static void main(String[] args) {
        //1. Display name of day based on number
        //2. Display name of the month based on number
        //3. Display type of website

        //1
        int day = 1;
        switch(day){
            case 1: System.out.println("Mon");
                    break;
            case 2: System.out.println("Tue");
                    break;
            case 3: System.out.println("Wed");
                    break;
            case 4: System.out.println("Thu");
                    break;
            case 5: System.out.println("Fri");
                    break;
            case 6: System.out.println("Sat");
                    break;
            case 7: System.out.println("Sun");
                    break;
            default: System.out.println("Invalid day!!!!");
        }

        //2.
        int month = 11;
        switch(month){
            case 1: System.out.println("Jan");
                    break;
            case 2: System.out.println("Feb");
                    break;
            case 3: System.out.println("Mar");
                    break;
            case 4: System.out.println("Apr");
                    break;
            case 5: System.out.println("May");
                    break;
            case 6: System.out.println("Jun");
                    break;
            case 7: System.out.println("July");
                    break;
            case 8: System.out.println("Aug");
                    break;
            case 9: System.out.println("Sep");
                    break;
            case 10: System.out.println("Oct");
                    break;
            case 11: System.out.println("Nov");
                    break;
            case 12: System.out.println("Dec");
                    break;
            default: System.out.println("Invalid");
        }

        //3.
        String website = "http://www.google.com";
        int i = website.lastIndexOf(".");
        String type = website.substring(i+1);
        switch(type){
            case "com": System.out.println("Commercial");
                        break;
            case "net": System.out.println("Network");
                        break;
            case "org": System.out.println("Organization");
                        break;
            default: System.out.println("other");
        }

    }
}
