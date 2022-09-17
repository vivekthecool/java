package corejava;

//        Need to write program for this
//        For the same array as above divide the array into two parts
//        such that the intersection of this two arrays is a null set
//        [A,A,C,C,D,E,F,G]
//        [B,B]
//
//        is a valid solution
//        and
//
//        [A,B,C,D,E,F,G] [A,B,C] is a wrong solution

import com.sun.istack.internal.NotNull;

import java.util.HashMap;
import java.util.Map;

public class PrintHighestFrequencyOfCharacter {
    private static void getHighestFreq(@NotNull char[] chArray) {
        Map<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(Character c : chArray) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if(maxFreq < map.get(c))
                maxFreq = map.get(c);
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getValue() == maxFreq)
                System.out.println(e);
        }
    }

    public static void main(String[] args) {
        char[] chArray = {'A','B','C','D','E','F','G','A','B','C'};
//        char[] chArray = {'A','B','C','D','E','F','G'};
        getHighestFreq(chArray);
    }
}
