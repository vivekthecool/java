package corejava;

import java.util.ArrayList;
import java.util.List;

public class CheckGivenStringIsRotationOrNot {
    public static void main(String[] args) {
//        ABCD->BCDA->CDAB->DABC
        String str1 = "ABCD";
        String strCheck = "DABC";
        System.out.println(checkRotation(str1, strCheck) ? "Rotation" : "Not a Rotation");
    }

    private static boolean checkRotation(String str1, String strCheck) {
        if(null == str1 || null == strCheck) return false;
        if(str1.length() != strCheck.length()) return false;
        String temp = str1 + str1;
        return temp.contains(strCheck);
    }
}
