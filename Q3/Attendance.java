
import java.util.HashSet;
import java.util.Objects;

class Student {
    int regNo;
    String name;

    Student(int regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;
        return this.regNo == other.regNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo);
    }
}

public class Attendance {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        students.add(new Student(101, "Ravi"));
        students.add(new Student(102, "Meena"));
        students.add(new Student(101, "Ravi Kumar"));

        System.out.println("Total Unique Students: " + students.size());
    }
}
