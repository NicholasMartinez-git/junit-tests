import org.junit.Test;
import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testConstructor() {
        Student nicholas = new Student(1L, "Nicholas");

        assertEquals(1L, nicholas.getId());
        assertEquals("Nicholas", nicholas.getName());
        assertNotNull(nicholas);
    }
}
