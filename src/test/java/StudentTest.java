import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void emptyConstructor(){
        Student s = new Student();
        assertNotNull(s);

    }

    @Test
    void nameConstructor(){
        Student s = new Student("Greg", "", "");
        assertEquals("Greg", s.getName());

    }

    @Test
    void yearConstructor(){
        Student s = new Student("", "Freshman", "");
        assertEquals("Freshman", s.getYear());
    }

    @Test
    void hometownConstructor(){
        Student s = new Student("", "", "Pismo Beach");
        assertEquals("Pismo Beach", s.getHometown());
    }

    @Test
    void addCourse() {
        Student s = new Student();
        s.addCourse("Spring 2022", "Engineering 120", "B", 3.0, 3.0);
        assertNotNull(s.getCourse(0));
    }

    @Test
    void calculateGPA() {
        Student s = new Student();
        s.addCourse("Spring 2022", "Engineering 120", "B", 3.0, 3.0);
        s.addCourse("Spring 2022", "Engineering 121", "A", 4.0, 3.0);
        s.addCourse("Spring 2022", "English 101", "C", 2.0, 3.0);
        s.addCourse("Spring 2022", "Spanish 400", "A", 4.0, 3.0);
        s.calculateGPA();
        assertEquals(3.25, s.getFinalGPA());
    }

    @Test
    void setName() {
        Student s = new Student();
        s.setName("Bob");
        assertEquals("Bob", s.getName());
    }

    @Test
    void setYear() {
        Student s = new Student();
        s.setYear("Junior");
        assertEquals("Junior", s.getYear());
    }

    @Test
    void setHometown() {
        Student s = new Student();
        s.setHometown("Waco");
        assertEquals("Waco", s.getHometown());

    }



}