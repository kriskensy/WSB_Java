package pl.kriskensy;

public class PasswordValidator {
    public static void main(String[] args) {
        String passwordToCheck = "HasloDoSPRAWDZENIA7&";

        System.out.println(validatePassword(passwordToCheck));
    }

    public static boolean validatePasswordLength(String passwordToCheck) {
        if (passwordToCheck.length() >= 6) {
            return true;
        } else return false;
    }

    public static boolean validatePasswordSpecialCharactersAndNumbers(String passwordToCheck) {
        boolean specialCharactersFound = false;
        for (char element : passwordToCheck.toCharArray()) {
            int asciiValue = (int) element;
            if ((asciiValue >= 33 && asciiValue <= 47) || (asciiValue >= 48 && asciiValue <= 57) || (asciiValue >= 58 && asciiValue <= 64)) {
                specialCharactersFound = true;
                break;
            }
        }
        return specialCharactersFound;
    }

    public static boolean validatePasswordUpperCase(String passwordToCheck) {
        boolean upperCaseFound = false;
        for (char element : passwordToCheck.toCharArray()) {
            int asciiValue = (int) element;
            if (asciiValue >= 65 && asciiValue <= 90) {
                upperCaseFound = true;
                break;
            }
        }
        return upperCaseFound;
    }

    public static boolean validatePasswordLowerCase(String passwordToCheck) {
        boolean lowerCaseFound = false;
        for (char element : passwordToCheck.toCharArray()) {
            int asciiValue = (int) element;
            if (asciiValue >= 97 && asciiValue <= 122) {
                lowerCaseFound = true;
                break;
            }
        }
        return lowerCaseFound;
    }

    public static boolean validatePassword(String passwordToCheck) {
        if (validatePasswordLength(passwordToCheck) && validatePasswordSpecialCharactersAndNumbers(passwordToCheck)
                && validatePasswordUpperCase(passwordToCheck) && validatePasswordLowerCase(passwordToCheck)) {
            return true;
        } else return false;
    }
}