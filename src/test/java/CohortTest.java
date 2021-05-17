import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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

        assertEquals(3, mtnz.getStudents().size());
        assertEquals(1, mtnz.getStudents().get(0).getId());
        assertEquals(89, mtnz.getCohortAverage(), 0.5);
    }

}
