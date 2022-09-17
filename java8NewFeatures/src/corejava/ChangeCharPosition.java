package corejava;

public class ChangeCharPosition {
    public static void main(String[] args) {
        changePosition("String", 'r', 'n');
    }

    private static void changePosition(String str, Character ch1, Character ch2) {
        int ch1Pos = 0;
        int ch2Pos = 0;

        System.out.println(ch1);
        System.out.println(ch2);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch1) {
                ch1Pos = i;
            } else if(str.charAt(i) == ch2) {
                ch2Pos = i;
            }
        }

        StringBuilder strNew = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(i == ch1Pos) {
                strNew = strNew.append(ch2);
            } else if(i == ch2Pos) {
                strNew = strNew.append(ch1);
            } else {
                strNew = strNew.append(str.charAt(i));
            }
        }
        System.out.println("Original: " + str);
        System.out.println("Modified: " + strNew);
    }

}
