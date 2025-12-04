package MiniProject;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        int sum = 0;
        for (int m : marks)
            sum += m;
        return sum / (double) marks.length;
    }

    public int getHighestMark() {
        int max = marks[0];
        for (int m : marks) {
            if (m > max)
                max = m;
        }
        return max;
    }

    public void printDetails() {
        System.out.println("\nStudent: " + name);
        System.out.print("Marks: ");
        for (int m : marks)
            System.out.print(m + " ");
        System.out.println("\nAverage: " + getAverage());
        System.out.println("Highest Mark: " + getHighestMark());
    }
}
