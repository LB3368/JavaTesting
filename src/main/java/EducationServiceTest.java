//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.*;
//
//public class EducationServiceTest {
//
//    @Mock
//    private StudentDataObject studentDataObject;
//
//    @Mock
//    private InstructorDataObject instructorDataObject;
//
//    @Mock
//    private ClassDataObject classDataObject;
//
//    @InjectMocks
//    private EducationService educationService;
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testGetClassesByInstructor() {
//        // Given
//        String instructorId = "123";
//        List<Class> expectedClasses = Arrays.asList(
//                new Class("Algebra"),
//                new Class("Economics")
//        );
//        when(instructorDataObject.getClassesByInstructor(instructorId)).thenReturn(expectedClasses);
//
//        // When
//        List<Class> actualClasses = educationService.getClassesByInstructor(instructorId);
//
//        // Then
//        assertEquals(expectedClasses, actualClasses);
//        verify(instructorDataObject, times(1)).getClassesByInstructor(instructorId);
//        verifyNoMoreInteractions(instructorDataObject);
//    }
//
//    @Test
//    public void testGetStudentsInClass() {
//        // Given
//        String classId = "456";
//        List<Student> expectedStudents = Arrays.asList(
//                new Student("John Doe"),
//                new Student("Jane Smith")
//        );
//        when(classDataObject.getStudentsInClass(classId)).thenReturn(expectedStudents);
//
//        // When
//        List<Student> actualStudents = educationService.getStudentsInClass(classId);
//
//        // Then
//        assertEquals(expectedStudents, actualStudents);
//        verify(classDataObject, times(1)).getStudentsInClass(classId);
//        verifyNoMoreInteractions(classDataObject);
//    }
//
//    @Test
//    public void testEnrollStudentInClass() {
//        // Given
//        String studentId = "789";
//        String classId = "456";
//
//        // When
//        educationService.enrollStudentInClass(studentId, classId);
//
//        // Then
//        verify(studentDataObject, times(1)).enrollStudentInClass(studentId, classId);
//        verifyNoMoreInteractions(studentDataObject);
//    }
//
//    @Test
//    public void testGetInstructorById() {
//        // Given
//        String instructorId = "123";
//        Instructor expectedInstructor = new Instructor("John Smith");
//        when(instructorDataObject.getInstructorById(instructorId)).thenReturn(expectedInstructor);
//
//        // When
//        Instructor actualInstructor = educationService.getInstructorById(instructorId);
//
//        // Then
//        assertEquals(expectedInstructor, actualInstructor);
//        verify(instructorDataObject, times(1)).getInstructorById(instructorId);
//        verifyNoMoreInteractions(instructorDataObject);
//    }
//
//    @Test
//    public void testGetAllClasses() {
//        // Given
//        List<Class> expectedClasses = Arrays.asList(
//                new Class("Algebra"),
//                new Class("Economics"),
//                new Class("Physics")
//        );
//        when(classDataObject.getAllClasses()).thenReturn(expectedClasses);
//
//        // When
//        List<Class> actualClasses = educationService.getAllClasses();
//
//        // Then
//        assertEquals(expectedClasses, actualClasses);
//        verify(classDataObject, times(1)).getAllClasses();
//        verifyNoMoreInteractions(classDataObject);
//    }
//
//    @Test
//    public void testGetStudentsInEmptyClass() {
//        // Given
//        String classId = "789";
//        List<Student> expectedStudents = new ArrayList<>();
//        when(classDataObject.getStudentsInClass(classId)).thenReturn(expectedStudents);
//
//        // When
//        List<Student> actualStudents = educationService.getStudentsInClass(classId);
//
//        // Then
//        assertEquals(expectedStudents, actualStudents);
//        verify(classDataObject, times(1)).getStudentsInClass(classId);
//        verifyNoMoreInteractions(classDataObject);
//    }
//
//    @Test
//    public void testEnrollStudentInMultipleClasses() {
//        // Given
//        String studentId = "789";
//        List<String> classIds = Arrays.asList("456", "789", "123");
//
//        // When
//        for (String classId : classIds) {
//            educationService.enrollStudentInClass(studentId, classId);
//        }
//
//        // Then
//        verify(studentDataObject, times(classIds.size())).enrollStudentInClass(studentId, anyString());
//        verifyNoMoreInteractions(studentDataObject);
//    }
//
//    @Test
//    public void testGetClassesByInstructorWithNoClasses() {
//        // Given
//        String instructorId = "999";
//        List<Class> expectedClasses = new ArrayList<>();
//        when(instructorDataObject.getClassesByInstructor(instructorId)).thenReturn(expectedClasses);
//
//        // When
//        List<Class> actualClasses = educationService.getClassesByInstructor(instructorId);
//
//        // Then
//        assertEquals(expectedClasses, actualClasses);
//        verify(instructorDataObject, times(1)).getClassesByInstructor(instructorId);
//        verifyNoMoreInteractions(instructorDataObject);
//    }
//
//    @Test
//    public void testEnrollStudentInNonexistentClass() {
//        // Given
//        String studentId = "789";
//        String classId = "999";
//
//        // When
//        educationService.enrollStudentInClass(studentId, classId);
//
//        // Then
//        verify(studentDataObject, times(1)).enrollStudentInClass(studentId, classId);
//        verifyNoMoreInteractions(studentDataObject);
//    }
//
//    @Test
//    public void testGetInstructorByIdNonexistent() {
//        // Given
//        String instructorId = "999";
//        when(instructorDataObject.getInstructorById(instructorId)).thenReturn(null);
//
//        // When
//        Instructor actualInstructor = educationService.getInstructorById(instructorId);
//
//        // Then
//        assertNull(actualInstructor);
//        verify(instructorDataObject, times(1)).getInstructorById(instructorId);
//        verifyNoMoreInteractions(instructorDataObject);
//    }
//}




//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.BDDMockito.given;
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class EducationServiceTest {
//
//    @Mock
//    private StudentDataObject studentDataObject;
//
//    @Mock
//    private InstructorDataObject instructorDataObject;
//
//    @Mock
//    private ClassDataObject classDataObject;
//
//    @InjectMocks
//    private EducationService educationService;
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testGetClassesByInstructor() {
//        // Given
//        String instructorId = "123";
//        List<Class> expectedClasses = Arrays.asList(
//                new Class("Algebra"),
//                new Class("Economics")
//        );
//        given(instructorDataObject.getClassesByInstructor(instructorId)).willReturn(expectedClasses);
//
//        // When
//        List<Class> actualClasses = educationService.getClassesByInstructor(instructorId);
//
//        // Then
//        assertEquals(expectedClasses, actualClasses);
//    }
//
//    @Test
//    public void testGetStudentsInClass() {
//        // Given
//        String classId = "456";
//        List<Student> expectedStudents = Arrays.asList(
//                new Student("John Doe"),
//                new Student("Jane Smith")
//        );
//        given(classDataObject.getStudentsInClass(classId)).willReturn(expectedStudents);
//
//        // When
//        List<Student> actualStudents = educationService.getStudentsInClass(classId);
//
//        // Then
//        assertEquals(expectedStudents, actualStudents);
//    }
//}
