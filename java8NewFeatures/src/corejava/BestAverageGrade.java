package corejava;


import utility.AverageMarks;

import java.util.HashMap;
import java.util.Map;

/* Problem Name is &&& Best Average Grade &&& PLEASE DO NOT REMOVE THIS LINE. */

/*
 **  Instructions:
 **
 **  Given a list of student test scores, find the best average grade.
 **  Each student may have more than one test score in the list.
 **
 **  Complete the bestAverageGrade function in the editor below.
 **  It has one parameter, scores, which is an array of student test scores.
 **  Each element in the array is a two-element array of the form [student name, test score]
 **  e.g. [ "Bobby", "87" ].
 **  Test scores may be positive or negative integers.
 **
 **  If you end up with an average grade that is not an integer, you should
 **  use a floor function to return the largest integer less than or equal to the average.
 **  Return 0 for an empty input.
 **
 **  Example:
 **
 **  Input:
 **  [["Bobby", "87"],
 **   ["Charles", "100"],
 **   ["Eric", "64"],
 **   ["Charles", "22"]].
 **
 **  Expected output: 87
 **  Explanation: The average scores are 87, 61, and 64 for Bobby, Charles, and Eric,
 **  respectively. 87 is the highest.
 */
public class BestAverageGrade {
    /*
     **  Find the best average grade.
     */
    public static int bestAverageGrade(String[][] scores) {
        // name, score
        Map<String, AverageMarks> map = new HashMap<>();

        for (String[] score : scores) {
            if (map.containsKey(score[0])) {
                map.get(score[0]).count++;
                map.get(score[0]).score += Integer.parseInt(score[1]);
            } else {
                map.put(score[0], new AverageMarks(1, Integer.parseInt(score[1])));
            }
        }

        float avg = Integer.MIN_VALUE;
        for (Map.Entry<String, AverageMarks> e : map.entrySet()) {
            float t = (float) e.getValue().score / e.getValue().count;
            if (avg < t) {
                avg = t;
            }
        }
        return (int) avg;
    }

    /*
     **  Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass () {
        String[][] tc1 = {
                {"Bobby", "87"},
                {"Charles", "100"},
                {"Eric", "64"},
                {"Charles", "22"}};
        return bestAverageGrade(tc1) == 87;
    }

    /*
     **  Execution entry point.
     */
    public static void main(String[] args){
        // Run the tests
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }
    }
}
