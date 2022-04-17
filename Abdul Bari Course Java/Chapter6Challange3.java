public class Chapter6Challange3 {
    public static void main(String[] args) {
        //1.Remove special characters from string
        //2.Remove extra space from string 
        //3.Find number of word in a string

        // 1.
        String str = "A$b&c1#2@3!";
        str = str.replaceAll("\\W", "");
        // str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
        
        //2
        String str2 = "abc     tree                        is    my      favourite";
        str2 = str2.replaceAll("\\s+", " ");
        System.out.println(str2);

        //3
        String str3 = "abc     tree                        is    my      favourite";
        str3 = str3.replaceAll("\\s+", " ").trim();
        String words[] = str3.split("\\s");
        System.out.println(words[0]);        
    }
}
