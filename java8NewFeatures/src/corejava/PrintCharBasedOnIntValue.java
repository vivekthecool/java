package corejava;

import java.util.Objects;

public class PrintCharBasedOnIntValue {
    public static void main(String[] args) {
        String input = "a2p3c2";
//        o/p: - aapppcc
        Character c = null;
        int num = 0;

        for(int i = 0; i < input.length(); i++) {
            if(Objects.isNull(c)) {
                c = (char) input.charAt(i);
            } else if(num == 0) {
                num = Integer.parseInt(input.charAt(i)+"");
            }

            for(int j = 0; j < num && num > 0; j++) {
                System.out.print(c);
            }
            if(Objects.nonNull(c) && num > 0) {
                c = null;
                num = 0;
            }
        }
    }
}
