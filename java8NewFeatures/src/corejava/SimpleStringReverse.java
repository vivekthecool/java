package corejava;

public class SimpleStringReverse {
    public static void main(String[] args) {
        String str = "abc";

        for(int i = 0, j = str.length() - 1; i < j; i++, j--) {
            str = str.substring(0, i) +
                    str.charAt(j) +
                    str.substring(i+1, j) +
                    str.charAt(i) +
                    str.substring(j+1);
        }
        System.out.println(str);
    }
}
