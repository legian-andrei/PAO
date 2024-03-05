package lab1.task1;

import lab1.task2.Course;
import lab1.task2.StudentAllocator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Course test = new Course("mate", 5, StudentAllocator.createStudents());
        System.out.println("chooseStudentRandomly: " + test.chooseStudentRandomly());
        System.out.println("isStudentPassing: " + test.isStudentPassing(2));
        System.out.println("showAllPassingStudents: " + Arrays.toString(test.showAllPassingStudents()));
    }
}