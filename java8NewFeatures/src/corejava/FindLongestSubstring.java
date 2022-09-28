package corejava;

public class FindLongestSubstring {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("Longest Substring is: " + findLongestSubstring(str));
    }

    private static int findLongestSubstring(String str) {
        if(null == str || str.isEmpty()) return 0;
        else if(str.length() == 1) return 1;

        String temp = "";
        int maxLen = -1;

        for(char c: str.toCharArray()) {
            String current = String.valueOf(c);

            if(temp.contains(current)) {
                temp = temp.substring(temp.indexOf(current) + 1);
            }
            temp = temp + current;
            maxLen = Math.max(temp.length(), maxLen);
        }
        return maxLen;
    }
}
