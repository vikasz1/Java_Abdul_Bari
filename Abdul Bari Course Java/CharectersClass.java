public class CharectersClass   {
    public static void main(String[] args) {
        char a = 0x03C8; //unicode for german language.
        System.out.println(a);
        //printing all characters of greek language
        for(char c = 0x0370;c<=0x03FF;c++){
            System.out.print(c+" ");
        }
        //printing all characters of hindi language
        for (char c = 0x0900;c<=0x0970;c++){
            System.out.println();
        }

    }
}
