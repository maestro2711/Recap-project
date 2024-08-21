package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

    }
    public static boolean passwordValidationLengthCheckt(String password){
       return password.length()>=8;

    }

    public static boolean passwordDigitCheck(String password) {
        int[] digits ={0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<digits.length;i++){
            if(password.contains(String.valueOf(digits[i]))){
                return true;
            }

        }
        return false;



    }

    public static boolean passwordContainUpperCaseAndLowerCaseCheck(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        int i;
        for (i = 0; i < password.length()-1; i++) {
            ;
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }
        if(hasUpperCase && hasLowerCase) {
            return true;
        }
        return false;


    }

    public  static boolean passwordContainWeakPasswordsCheck(String password) {
        //Liste der häufig verwendeten passwort muster
        String[] words = {"password22", "123456", "qwerty", "abc123", "password1", "admin", "welcome", "111111"};
        //Durchlaufen die Liste der Passwort-Muster

        for(String word:words){
            //Prüfe, ob das Übergebene Passwort dem Muster entspricht
            if(password.equalsIgnoreCase(word)){
                System.out.println("das eingegebene Password ist sehr Schwach");
                return true;
            }
        }
        System.out.println("das Übergebene Passwort ist hoch");
        return false;
    }


}

//regex = “^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$”