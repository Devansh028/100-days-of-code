package Answers.Code;

public class AllocateMinimumPages {

    public static int allocate(int[] pages, int students) {
        int low = 0, high = 0;

        for (int p : pages) {
            low = Math.max(low, p);
            high += p;
        }
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(pages, students, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] pages, int students, int max) {
        int count = 1, sum = 0;
        for (int p : pages) {
            if (sum + p > max) {
                count++;
                sum = p;
                if (count > students)
                    return false;
            } else {
                sum += p;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pages = { 12, 34, 67, 90 };
        System.out.println(allocate(pages, 2));
    }
}
