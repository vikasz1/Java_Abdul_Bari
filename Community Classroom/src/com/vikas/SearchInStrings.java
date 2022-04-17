package com.vikas;


public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Vikas";
        boolean isPresent = searchMe(name,'q');
        System.out.println(isPresent);
    }

    private static boolean searchMe(String name, char target) {
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length(); i++) {
            if (target ==name.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
