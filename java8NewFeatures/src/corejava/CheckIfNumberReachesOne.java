package corejava;

public class CheckIfNumberReachesOne {
    private static int times = 1;
    public static void main(String[] args) {
        int n = 23;
        System.out.println(numberCheck(n) ? "Yes it reaches to 1" : "Not reached");
    }

    private static Boolean numberCheck(int n) {
        int sum = 0;
        while(n > 0) {
            int t = n % 10;
            sum += t*t;
            n = n / 10;
        }
        times++;

        if(sum == 1) {
            return true;
        } else {
            return times <= 100 ? numberCheck(sum) : false;
        }
    }
}
