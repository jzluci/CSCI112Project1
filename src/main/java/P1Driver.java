/*
Name: James Zachary Luci
Current Date: 9/19/2022
Sources Consulted: Googled how to calculate gpa using credit hours to find the equation necessary (https://www.pdx.edu/registration/calculating-grade-point-average).
Referenced lecture notes and labs.

By submitting this work, I attest that it is my original work and that I did
not violate the University of Mississippi academic policies set forth in the
M book.
*/


public class P1Driver {

    public static void main(String[] args) {
        System.out.println("Welcome to the GPA Calculator and Student Information Manager" + "\n");

        Student s = new Student("Bob Jones", "Sophomore", "Dallas");
        s.addCourse("Fall 2022", "Calculus 225", "B" , 3.0 , 4);
        s.addCourse("Fall 2022", "English 210", "A", 4.0, 3.0);
        s.addCourse("Fall 2022", "Physics 240 + Lab", "B", 3.0, 5.0);
        s.addCourse("Fall 2022", "Introduction to Acting", "C", 2.0, 3.0);
        s.addCourse("Fall 2022", "Spanish 250", "D", 1.0, 3.0);
        s.calculateGPA();
        s.printStudent();
        s.printCourses();

        System.out.println("\nThank you for using the GPA Calculator and Student Information Manager");


    }

}
