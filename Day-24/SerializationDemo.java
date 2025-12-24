/* Question 3: Java Serialization & Deserialization*/

import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }
}

public class SerializationDemo {

    public static void main(String[] args) throws Exception {
        Student s = new Student(1, "Devansh");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(s);
        out.close();
        System.out.println("Object Serialized");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Student obj = (Student) in.readObject();
        in.close();

        System.out.println("Deserialized Student:" + obj.id + ", " + obj.name);
    }
}
