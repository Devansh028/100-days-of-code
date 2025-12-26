/*Question 1: Allocate Minimum Pages

You are given n books with pages and m students.
Allocate books (contiguous) such that the maximum pages assigned to a student is minimized.

Example

pages = [12, 34, 67, 90], m = 2
Output = 113 */

public class AllocateMinimumPages {

    public static int allocatePages(int[] pages, int m) {
        if (m > pages.length)
            return -1;

        int low = 0, high = 0;
        for (int p : pages) {
            low = Math.max(low, p);
            high += p;
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(pages, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] pages, int m, int maxPages) {
        int students = 1, sum = 0;

        for (int p : pages) {
            if (sum + p > maxPages) {
                students++;
                sum = p;
                if (students > m)
                    return false;
            } else {
                sum += p;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pages = { 12, 34, 67, 90 };
        System.out.println(allocatePages(pages, 2));
    }
}
