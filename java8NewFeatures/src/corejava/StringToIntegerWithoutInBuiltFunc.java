package corejava;

public class StringToIntegerWithoutInBuiltFunc {
    public static void main(String[] args) {
        String str = "1234";
        Integer num = 0;

        for(int i = 0; i < str.length(); i++) {
            num = num * 10 + str.charAt(i) - 48;
        }
        System.out.println(num);
    }
}
