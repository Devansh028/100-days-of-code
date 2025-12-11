public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "Dev";
        s = s + "ansh";
        System.out.println("String:" + s);
        StringBuilder sb = new StringBuilder("Dev");
        sb.append("ansh");
        System.out.println("StringBuilder:" + sb);
    }
}
