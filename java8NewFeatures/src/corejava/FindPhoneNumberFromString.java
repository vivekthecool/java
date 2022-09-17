package corejava;

import java.io.IOException;

public class FindPhoneNumberFromString {
    public static void main(String[] args) throws IOException {
        String str = "123fvgbghbhvgc9876543210m0";
        int counter = 0;
        String phoneNumber = "";

        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(Character.isDigit(c)) {
                counter++;
            } else if(!Character.isDigit(c)) {
                if(counter == 10) {
                    phoneNumber = str.substring(i - counter, i);
                    break;
                }
                counter = 0;
            }
        }
        if(counter == 10 && phoneNumber.isEmpty()) {
            phoneNumber = str.substring(str.length() - counter);
        } else if(phoneNumber.isEmpty()) {
            phoneNumber = "No valid phone number";
        }
        System.out.println(phoneNumber);
    }
}
