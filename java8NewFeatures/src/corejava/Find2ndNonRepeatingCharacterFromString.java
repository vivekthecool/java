package corejava;

public class Find2ndNonRepeatingCharacterFromString {
    public static void main(String[] args) {
        String str = "abcdabgd";
        int count = 0;
        for(char c : str.toCharArray()) {
            if(str.indexOf(c) == str.lastIndexOf(c)) {
                if(count == 1) {
                    System.out.println(c);
                    break;
                }
                count++;
            }
        }
    }
}
