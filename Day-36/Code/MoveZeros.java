package Code;

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int idx = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }

        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeros(arr);
        for (int n : arr)
            System.out.print(n + " ");
    }
}
