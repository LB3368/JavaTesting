import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class EducationServiceTest {

    @Mock
    private StudentDataObject studentDataObject;

    @Mock
    private InstructorDataObject instructorDataObject;

    @Mock
    private ClassDataObject classDataObject;

    @InjectMocks
    private EducationService educationService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetClassesByInstructor() {
        // Given
        String instructorId = "123";
        List<Class> expectedClasses = Arrays.asList(
                new Class("Algebra"),
                new Class("Economics")
        );
        given(instructorDataObject.getClassesByInstructor(instructorId)).willReturn(expectedClasses);

        // When
        List<Class> actualClasses = educationService.getClassesByInstructor(instructorId);

        // Then
        assertEquals(expectedClasses, actualClasses);
    }

    @Test
    public void testGetStudentsInClass() {
        // Given
        String classId = "456";
        List<Student> expectedStudents = Arrays.asList(
                new Student("John Doe"),
                new Student("Jane Smith")
        );
        given(classDataObject.getStudentsInClass(classId)).willReturn(expectedStudents);

        // When
        List<Student> actualStudents = educationService.getStudentsInClass(classId);

        // Then
        assertEquals(expectedStudents, actualStudents);
    }
}
