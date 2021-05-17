import org.junit.Test;

public class CohortTest {
    @Test
    public void testAddStudents() {
        Student nic = new Student(1L, "Nic");
        Student matt = new Student(2L, "Matt");
        Student jon = new Student(3L, "Jon");
        nic.addGrade(100);
        nic.addGrade(90);
        nic.addGrade(90);

        matt.addGrade(85);
        matt.addGrade(95);
        matt.addGrade(75);

        jon.addGrade(70);
        jon.addGrade(100);
        jon.addGrade(100);

        Cohort mtnz = new Cohort();

        mtnz.addStudent(nic);
        mtnz.addStudent(matt);
        mtnz.addStudent(jon);
    }
}
