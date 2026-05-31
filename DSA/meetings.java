import java.util.*;

class Info {
    int start;
    int end;

    Info(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Solution {
    public int number(int[] start, int[] end) {
        int n = start.length;

        Info[] infos = new Info[n];

        for (int i = 0; i < n; i++) {
            infos[i] = new Info(start[i], end[i]);
        }

        // Sort by ending time
        Arrays.sort(infos, (a, b) -> Integer.compare(a.end, b.end));

        int count = 1;
        int lastEnd = infos[0].end;

        for (int i = 1; i < n; i++) {
            if (infos[i].start > lastEnd) {
                count++;
                lastEnd = infos[i].end;
            }
        }

        return count;
    }
}

public class Meetings {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

        System.out.println(sol.number(start, end)); // 4
    }
}