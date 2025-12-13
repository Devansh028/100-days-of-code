/*
 * Question 1: Activity Selection Problem
 * 
 * Given start and end times of activities, select the maximum number of
 * non-overlapping activities a single person can perform.
 * 
 * Input:
 * start = [1,3,0,5,8,5]
 * end = [2,4,6,7,9,9]
 * Output: 4
 */

import java.util.*;

class Activity {
    int start, end;

    Activity(int s, int e) {
        start = s;
        end = e;
    }
}

public class ActivitySelection {
    public static int maxActivities(int[] start, int[] end) {
        List<Activity> list = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            list.add(new Activity(start[i], end[i]));
        }
        list.sort(Comparator.comparingInt(a -> a.end));
        int count = 1;
        int lastEnd = list.get(0).end;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).start >= lastEnd) {
                count++;
                lastEnd = list.get(i).end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        System.out.println(maxActivities(start, end));
    }

}