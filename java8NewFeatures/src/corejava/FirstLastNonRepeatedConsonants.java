package corejava;

public class FirstLastNonRepeatedConsonants {
    public static void main(String[] args) {
        String str = "aabbdfdghiquo";
        Character res = null;

        for(int i = str.length() - 1; i > -1; i--) {
            Character c = str.charAt(i);
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                if(str.indexOf(c) == str.lastIndexOf(c)) {
                    res = c;
                    break;
                }
            }
        }
        System.out.println((res != null ? res + ": is the result" : "There is no vowels to print"));
    }
}
