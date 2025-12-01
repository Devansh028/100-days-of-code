public class ReverseString {
    public static void main(String[] args) {
        String str = "Devansh kumar";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
