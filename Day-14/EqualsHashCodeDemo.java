/* Question 3: equals() vs hashCode()

Explain and demonstrate:
Why both must be overridden together
What happens in HashMap if you don’t*/

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Student))
            return false;
        Student s = (Student) o;
        return id == s.id && name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsHashCodeDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Devansh");
        Student s2 = new Student(1, "Devansh");

        HashMap<Student, String> map = new HashMap<>();
        map.put(s1, "Student 1");
        map.put(s2, "Student 2");

        System.out.println(map.size());
        System.out.println(map.get(s1));
    }
}
