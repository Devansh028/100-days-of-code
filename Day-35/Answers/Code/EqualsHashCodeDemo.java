package Answers.Code;

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
        Map<Student, String> map = new HashMap<>();

        map.put(new Student(1, "Devansh"), "Backend Dev");
        map.put(new Student(1, "Devansh"), "Java Dev");

        System.out.println(map.size());
    }
}
