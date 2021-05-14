import org.junit.Test;
import static org.junit.Assert.*;

public class StudentsTest {
    @Test

    public void testConstructor() {
        Student nicholas = new Student(1, "Nicholas");

        assertSame(1L, nicholas.getId());
        assertSame("Nicholas", nicholas.getName());
        assertSame(0, nicholas.getGrades().size());
    }
}
